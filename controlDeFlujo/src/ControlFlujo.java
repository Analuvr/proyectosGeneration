import java.util.Scanner;

public class ControlFlujo {
    public static void main(String[] args) {
        //if
        if(15 > 20) {
            System.out.println("15 es mayor que 20");
        }

        //if - else
        Scanner scanner = new Scanner(System.in); //Escáner instanciado
        System.out.println("Ingresa tu edad: "); //Contexto para que el usuario sepa qué hacer
        int edad = scanner.nextInt(); //Variable que reciba lo del escáner
        if(edad >= 18){
            System.out.println("La persona puede comprar cerveza");
        } else {
            System.out.println("No puedes comprar cerveza");
        }

        //if - else if - else
        //Determinar si una persona es un bebé (0-2 años), un niño (3-11 años), un adolescente (12-17 años) y un adulto (18 o más años)
        //Divide la adulta en adulta chiquita (18-60) y en adulta grande (más de 60)
        if(edad >= 18) {
            if(edad < 60) {
                System.out.println("Es una adulta chiquita");
            } else {
                System.out.println("Es una adulta grande");
            }
            //System.out.println("Es una adulta");
        } else if (edad >= 12) {
            System.out.println("Eres una adolescente");
        } else if (edad >=3) {
            System.out.println("Eres una niña");
        } else {
            System.out.println("Eres una bebé");
        }

        //Switch
        //Muestra el día de la semana correspondiente al númeoro específicaado (1 - lunes, 2 - martes, 3 - miércoles ...)
        System.out.println("Ingresa un número para conocer el día de la semana: ");
        int numeroDia = scanner.nextInt();

        switch (numeroDia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }

        //Determinar si un string tiene contenido o está vacío
        //System.out.println("Ingresa un texto");
        String texto = "Anita";

        if(texto.isEmpty()) {
            System.out.println("Tu texto no tiene contenido");
        } else {
            System.out.println("Tienes texto y es este: " + texto);
        }

        //Operador ternario: (condición) ? true : false
        String estado = (texto.isEmpty()) ? "Tu texto no tiene contenido" : "Tienes texto y es este: " + texto;
        System.out.println(estado);
    }
}
