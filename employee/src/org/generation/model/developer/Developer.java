package org.generation.model.developer;

import org.generation.model.Employee;

public class Developer extends Employee {
    // Lenguaje de programación
    // Atributo (enum: Lenguaje de programación)
    private ProgrammingLanguage language;

    public Developer(Long idEmpleado, String fullName, Double salario, ProgrammingLanguage language) {
        super(idEmpleado, fullName, "Developer", salario);
        this.language = language;
    }

    public ProgrammingLanguage getLanguage() {
        return language;
    }

    public void setLanguage(ProgrammingLanguage language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "language=" + language +
                "} " + super.toString();
    }
}
