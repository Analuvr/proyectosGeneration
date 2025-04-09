package employee;

public class Employee {
    // 1. Atributos (variables de instancia)
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private String position;

    // 2. Metodo constructor
    public Employee(String firstName, String lastName, int age, double salary, String position) {
        this.firstName  = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.position = position;
    }

    // 3. Métodos de acceso y modificación (Getters y Setters)
    //Son de tipo public
    //Son del mismo tipo que la variable
    //Generación automática: click derecho > Generate > Getter and Setter

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // 4. Métodos específicos del objeto

    //Metodo para obtener el nombre completo
    public String getFullName() {
        return firstName + " " + lastName;
    }

    //Metodo para calcular los años restantes para jubilación (60)
    public int getYearsForRetirement() {
        return 60 - age;
    }

    //Metodo para calcular salario con un incremento salarial basado en un porcentaje (salario = salario base + 10%) $10000 + 10% = $11000
    public double increaseSalary(double percentage) {
        double increase = salary * (percentage / 100);
        return salary += increase; //(salary = salary + increase)
    }

    //Metodo para mostrar la posición del empleado
    public String getPositionEmployee() {
        return "Employee: " + getFullName() + " -> Position: " + position;
    }

    //5. Sobreescribir el metodo toString() de Object
//    @Override
//    public String toString() {
//        return "FirstName: " + firstName + ", LastName: " + lastName + ", Age: " + age + ", Salary: " + salary + ", Position: " + position;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
}//class

