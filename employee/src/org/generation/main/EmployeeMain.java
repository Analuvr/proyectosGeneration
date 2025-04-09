package org.generation.main;

import org.generation.model.Trabajador;
import org.generation.model.developer.Developer;
import org.generation.model.developer.ProgrammingLanguage;
import org.generation.model.manager.Manager;
import org.generation.service.ManagerService;

public class EmployeeMain {
    public static void main (String[] args){
        ManagerService managerService = new ManagerService(); // Instancia de ManagerService (acceder a los métodos de ManagerService)

        // Agregar Managers
        managerService.addManager(new Manager(1L, "Andrea Escalante", 200000d, 12000d));
        managerService.addManager(new Manager(2L, "Montse Pineda", 40000d, 8000d));
        managerService.addManager(new Manager(3L, "Karen Olán", 80000d, 6500d));

        // Recuperar todos los Manager
        System.out.println(managerService.getManagers());

        // Recuperar Manager por Id
        System.out.println("Manager con id 1: " + managerService.findById(1L));
        //System.out.println("Manager con id 12: " + managerService.findById(12L));
        System.out.println("Manager con id 3: " + managerService.findById(3L));

        // Eliminar Manager
        managerService.deleteManager(3L);
        //System.out.println(managerService.findById(3L));

        // Instanciando desde la interface
        Trabajador daniel = new Manager(123L, "Daniel", 55205d, 1200d); // Trabajador sería el equivalente a List<> daniel = new ArrayList<> (Interface =  Clase)
        Trabajador anaPao = new Developer(456L, "Ana Pao", 98522d, ProgrammingLanguage.JAVA);

        // Implementando métodos abstractos
        System.out.println(daniel.calcularSalario()); // Output: 56405.0
        System.out.println(anaPao.calcularSalario()); // Output: 98522.0

        System.out.println(daniel);
        System.out.println(anaPao);
    }

}
