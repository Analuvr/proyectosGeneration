package employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee daniel = new Employee("Anita", "Lucía", 24, 25000d, "senior developer"); //Instancia 01

        Employee itzel = new Employee("Itzel", "Padilla", 24, 84719.23d, "Sr. Developer"); //Instancia 02

        Employee ximena = new Employee("Ximena", "García", 18, 10000d, "data analyst");

        //Probando métodos
        System.out.println(daniel.getFullName());
        System.out.println(itzel.getFullName());
        System.out.println("Te faltan: " + itzel.getYearsForRetirement() + " años para el retiro laboral");

        System.out.println("Tu salario con incremento es de: $" + ximena.increaseSalary(25d)); //Output: 12500

        System.out.println(ximena.getPositionEmployee());

        System.out.println(daniel);
    }
}
