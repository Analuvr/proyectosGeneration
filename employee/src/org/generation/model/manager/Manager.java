package org.generation.model.manager;

import org.generation.model.Employee;

//Manager es una subclase de Employee
public class Manager extends Employee {

    // Atributo único para Manager
    private Double bonus;

    // Constructor: debe traer los atrivutos desde el super constructor
    public Manager(Long idEmpleado, String fullName, Double salario, Double bonus) { // Eliminamos String position
        super(idEmpleado, fullName, "Manager", salario); // Indica que estos vienen de la superclase | Le damos un valor fijo a Manager porque siempre será manager, así ya sabe qué es al instanciar uno nuevo
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                "} " + super.toString();
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + bonus;
    }
}
