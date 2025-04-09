package string;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        //Metodos de String
        String saludo = "Hola Anita";
        String mensaje = "GenMX";

        //lenght(): mostrar la longitud del string (número de caracteres)
        System.out.println(saludo.length()); //Output: 9

        //charAt(i);
        System.out.println(saludo.charAt(5));

        //equals(String): compara dos string
        System.out.println(saludo.equals(mensaje)); //Output: false

        //toUpperCase(); toLowerCase();
        System.out.println(saludo.toLowerCase()); //hola anita
        System.out.println(mensaje.toUpperCase());

        //replace(oldChar, newChar); sustituye un caracter por otro (todas las ocurrencias)
        System.out.println(saludo.replace('a', 'i'));

        //Solicitar al usuario un mensaje y mostrar los caracteres del mensaje en forma de lista
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el texto");
        String texto = scanner.nextLine();

        //Solución 01. Iterar sobre los caracteres del string
        System.out.println("\tSolución 01");

        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }

        //Solucion 02. Usar ciclo for-Each con la conversión de un String en un Array de char
        System.out.println("\tSolución 02");

        for (char caracter : texto.toCharArray()) {
            System.out.println(caracter);
        }

    }
}
