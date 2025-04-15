package org.generation.pandevs.service;

import org.generation.pandevs.exception.UserNotFoundException;
import org.generation.pandevs.model.User;
import org.generation.pandevs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Indicates that an annotated class is a "Service"
public class UserService {
    // Instanciar UserRepository
    private final UserRepository userRepository;

    // Crear variable de tipo PasswordEncoder para inyectarla como dependencia
    private final PasswordEncoder passwordEncoder;

    // Inyectar la variable en el constructor
    // Para facilitar la inyección de dependencias agrego @Autowired
    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    // Metodo para obtener las instancias de User
    public List<User> getUsers() {
        return userRepository.findAll(); // Retornar todas las instancias que viven en la base de datos
    }

    // Metodo para trabajar con la creación de nuevas entidades (crear un nuevo usuario)
    /*
    public User createUser(User newUser) {
        return userRepository.save(newUser); // No agregamos validaciones
    }
     */

    // Nuevo metodo para crear un usuario con PasswordEncoder (para codificar password)
    public User createUser(String username, String email, String rawPassword){
        // Crear una variable de tipo String que implemente PasswordEncoder
        String encryptedPassword = passwordEncoder.encode(rawPassword);
        User user = new User();// Metodo que permite modificar la instancia
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(encryptedPassword);

        return userRepository.save(user);
    }

    // Metodo para recuperar un usuario por email
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // Metodo para recuperar un usuario por id
    // Opción 1. Manejar el metodo con la clase Optional
    /*
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }
     */

    // Opción 2. Manejar el metodo con la clase Entity (User) y una Exception
    public User findById(Long id){
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id)); // Intenta buscar a un usuario por id, si no lo encuentra, lanza una exception
    }

    // Metodo para eliminar un User
    public void deleteUser(Long id){

        // Evalua la condición
        if(userRepository.existsById(id)){
            userRepository.deleteById(id); // Elimina
        } else {
            throw new UserNotFoundException(id); // Lanza una exception
        }
    }

    // Metodo para actualizar nuestro User (findById, save)
    // PUT -> Actualizar todos los atributos
    public User updateUser(User user, Long id) { // Salvar al usuario con la nueva información, Buscar al usuario

        // Lo busca, en caso de que lo encuentre, recupera la información de cada atributo y sobreescribe
        return userRepository.findById(id)
                .map(userMap -> { // Creamos un "usuario temporal" gracias al Map
                    userMap.setUsername(user.getUsername()); // Sobreescribirlo en la información que ya existe
                    userMap.setEmail(user.getEmail());
                    userMap.setPassword(user.getPassword());
                    return userRepository.save(userMap);
                })
                .orElseThrow(() -> new UserNotFoundException(id));
    }

}
