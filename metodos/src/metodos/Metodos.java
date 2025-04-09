package metodos;

public class Metodos {
    // Metodo que no retorna
    public static void asteriscos() {
        System.out.println("**************************");
    }

    //Metodo que sí retorna
    public static int sumar(int num1, int num2) {
       return num1 + num2;
    }

    //Metodo que retorna pero recibe argumentos de diferente tipo
    public static String informacion(String nombre, int edad) {
        return nombre + " " + edad;
    }

    //Metodo que retorna Object
    public static Object salario(String nombre, double salario) {
        return "Nombre: " + nombre + ", $" + salario;
    }

    public static void main(String[] args) {
        Metodos.asteriscos();
        System.out.println(Metodos.sumar(2,3)); //Output: 5;
        System.out.println(Metodos.informacion("Anita", 38));
        System.out.println(Metodos.salario("Anita", 25000d));
    }
}
