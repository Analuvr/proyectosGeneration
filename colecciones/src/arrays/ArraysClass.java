package arrays;
import java.util.Arrays;

public class ArraysClass {
    public static void main (String[] args) {
        //Arrays. Recibe un conjunto de datos del mismo tipo en una única variable y tienen una longitud definida
        String[] nombres = {"Denisse", "Anita", "Yoz", "Mariana"};
        System.out.println(nombres); //Representación hexadecimal del hash del objeto
        System.out.println(Arrays.toString(nombres)); //Representación de los elementos en String

        double[] salarios = {24366.12d, 31422.05d, 17699.06d, 67579.17d};
        System.out.println(Arrays.toString(salarios));

        //Acceder a elementos mediante el index
        double salario01 = salarios[0];
        System.out.println(salario01);

        //Acceder al último elemento del array
        String ultimoNombre = nombres[nombres.length-1]; //Output: Mariana
        double ultimoSalario = salarios[salarios.length-1];
        System.out.println(ultimoNombre + ": $" + ultimoSalario);

        //Inicializar un Array definiendo su tamaño
        char[] simbolos = new char[2];
        simbolos[0] = '-';
        simbolos[1] = '5';

        System.out.println(Arrays.toString(simbolos));
    }
}
