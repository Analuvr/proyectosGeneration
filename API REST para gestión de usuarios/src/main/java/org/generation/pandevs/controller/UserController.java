package org.generation.pandevs.controller;

import org.generation.pandevs.exception.UserNotFoundException;
import org.generation.pandevs.model.User;
import org.generation.pandevs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Arquitectura de API tipo Rest
@RequestMapping(path = "/api/v1/users") // Se puede omitir la palabra path (/api/v1/users no es obligatorio)
// localhost:8081/api/v1/users
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) { // Click derecho
        this.userService = userService;
    }

    // Mapear el metodo de UserService getUsers();
    // Mapear a una solicitud de tipo get
    @GetMapping
    public List<User> getAll() {
        return userService.getUsers();
    }

    // Mapear el metodo createUser();
    // Postman
    /*
    @PostMapping // Indica que es un metodo ligado a http POST
    public User createUser(@RequestBody User newUser) { // @RequestBody: Indica a SpringBoot que solicite al cliente que agregue el cuerpo de cada objeto. Obtiene los valores de un input
        return userService.createUser(newUser);
    }
    */

    // Evitar que los ids existan como fantasmas y evitar la respuesta genérica 200 OK
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User newUser) {

        // Si existe información: lanza un status 409
        // Si no existe información: crea el usuario y lanza un status 201
        if(userService.findByEmail(newUser.getEmail()) != null) {// Conocer si un usuario existe dentro de la base de datos (email y/o username, por ahora solo email)
            return new ResponseEntity<>(HttpStatus.CONFLICT); // 409
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(newUser)); // 201
        // Tratarla como una clase que nos permite realizar acciones, body toma el cuerpo del metodo que nos permite crear un usuario
    }

    // Metodo para obtener usuario por ID (404 NotFound y 200 OK)
    @GetMapping("{id}") // Queremos que no apunte a un endpoint, sino a un valor (las llaves indican que el path, lo que buscamos, es variable, porque los ids van a cambiar)

    // Firma del metodo
    public ResponseEntity<User> getById(@PathVariable Long id){ // Le indicamos que el path que va a ir cambiando ({id}) apunta a este id

        // Metodo try-catch para manejo de exception
        try {
            return ResponseEntity.ok(userService.findById(id)); // Retorna una respuesta 200 siempre y cuando se encuentre al usuario por id
        } catch (UserNotFoundException e) {
            return ResponseEntity.notFound().build(); // Crea un builder con el status 404
        }
    }

    // Metodo para eliminar usuario por ID. Status: 204 y 404
    @DeleteMapping("/delete-user/{id}") // Ejecutar la acción de eliminar (localhost:8081/api/v1/users/delete-user/id)
    public ResponseEntity<User> deleteUser(@PathVariable Long id) { // Clase response entity que maneja la entida
        try {
            userService.deleteUser(id); // Acción de tipo void. Al eliminar, no podremos volver a crear un usuario con ese id
            return ResponseEntity.noContent().build();
        } catch (UserNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Metodo para updateUser (200 y 404)
    @PutMapping("/update-user/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Long id) {
        try {
            return ResponseEntity.ok(userService.updateUser(user, id));
        } catch (UserNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

}

