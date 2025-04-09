package org.generation.service;

import org.generation.exceptions.EmployeeNotFoundException;
import org.generation.model.manager.Manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Métodos aplicados a toda la base de datos de Manager
public class ManagerService {
    private final List<Manager> managers = new ArrayList<>(); // No recibe otra modificación, es una constante (final)

    // Metodo para agregar Managers
    public void addManager(Manager manager){
        managers.add(manager);
    }

    //Metodo para recuperar todos los Managers
    public List<Manager> getManagers(){
        return managers;
    }

    // Metodo para buscar un Manager por su idEmpleado
    public Manager findById(Long id) {
        Iterator<Manager> iterator = managers.iterator();

        while(iterator.hasNext()){
            Manager manager = iterator.next(); // Guarda todas las iteraciones que vayan saliendo
            if(manager.getIdEmpleado().equals(id)){ // Comparar una instancia con otra instancia: el id que introduzca con el ide de la instancia
                return manager;
            } // if
        } // while

        // Exception
        throw new EmployeeNotFoundException("No se encuentra el empleado con id: " + id);

    } // findById

    // Metodo para eliminar un Manager por idEmpleado
    public void deleteManager(Long id) {
        // Buscar el Manager por id. Si lo encuentra, se elimina, si no, no hace nada
        Manager manager = findById(id);
        managers.remove(manager); // managers por que es el ArrayList


    }
}
