package org.generation.model;

//idEmpleado, fullName, position, salario
public class Employee implements Trabajador {
    private Long idEmpleado;
    private String fullName;
    private String position;
    private Double salario;

    public Employee(Long idEmpleado, String fullName, String position, Double salario) {
        this.idEmpleado = idEmpleado;
        this.fullName = fullName;
        this.position = position;
        this.salario = salario;
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmpleado=" + idEmpleado +
                ", fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", salario=" + salario +
                '}';
    }

    // Implementando el metodo de la Interface
    @Override
    public Double calcularSalario(){
        return getSalario();
    }

} //Class
