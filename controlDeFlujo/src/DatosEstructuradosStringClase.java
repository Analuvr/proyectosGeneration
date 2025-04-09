import java.util.Scanner;

public class DatosEstructuradosStringClase {
    public static void main(String[] args) {
        //Strings
        String nombre01 = "daniel";
        String nombre02 = "jaqui";
        String nombre03 = "anita";
        String nombre04 = "dian";

        System.out.println(nombre01 + ", " + nombre02 + ", " + nombre03 + ", " + nombre04);

        //Clase Scanner
        Scanner scanner = new Scanner(System.in);
        //Contexto
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); //El scanner se encuentra activo en la consola
        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.println(nombre + ": " + edad);
    }
}
