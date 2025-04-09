import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        System.out.println("Hola");

        // --- Ciclo for. Determinar el cliente ganador en una lista de clientes a partir de un número dado

        for(int contador = 1; contador <= 10; contador++){
            // -- El cliente número 6 es el ganador
            if (contador == 6){
                System.out.println("Cliente ganador " + contador);
                // -- opcion 1. Omitir el texto "Cliente número 6"
                //continue;
                // -- opcion 2. Detener el loop cuando se cumpla la condición
                break;

            }
            System.out.println("Cliente número: " + contador);
        } // for

        // --- Ciclo while. Programa que solicita un número al usuario para realizar una cuenta del 1 al n, donde n es el número que ingresó

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int numeroFinal = scanner.nextInt(); // Variable para guardar el número del usuario
        int numeroInicial = 1;


        while ( numeroInicial <= numeroFinal) {
            System.out.println(numeroInicial);
            numeroInicial++;
        }//while

        // --- do-while. Crear un programa que solicita al usuario un número entre 1 y 999 para determinar cuantos digitos posee. El programa se ejecuta sin terminar el proceso hasta que el usuario digite el número 0.
        int numero;

        do{
            //instrucción
            System.out.println("Ingresa un numero entre 1 y 999 para conocer cuantos digitos posee. Presiona 0 para terminar.");
            numero = scanner.nextInt();

            //if (numero == 0){
            //  break;

            //}
            if (numero >= 1 && numero <= 999){
                int digitos = String.valueOf(numero).length();
                System.out.println("El número " + numero + " posee " + digitos + "digitos.");
            }else{
                System.err.println("Número fuera del rango / No permitido");

            }
        }while(numero != 0); {
            System.out.println("El programa ha finalizado");

        }

        //Crear un programa que solicite al usuario el valor del radio de una circunferencia para calcular el are
        double radio;

        // do-while para evaluar el número ingresado por el usuario
        do {
            System.out.println("Ingresa el radio de la circunferencia");
            while(!scanner.hasNextDouble()) { //Permite controlar la Exception para que no termine el programa
                System.err.println("Ingresa un número válido"); //Mostrar el error
                scanner.next();
            }
            radio = scanner.nextDouble();
            // Agregar un mensaje de error al número negativo
            if(radio < 0) {
                System.err.println("El radio no puede ser negativo. Ingresa un número válido");
            }
        } while (radio < 0);

        //Calcular el área (pi * r^2)
        double area = Math.PI * Math.pow(radio, 2);
        System.out.printf("El área de la circunferencia es: %.2f", area);

    } // main
} // class
