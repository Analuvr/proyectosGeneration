package org.generation.excepciones;

//Implementar try-catch y el manejo de una excepcion
public class ExcepcionAritmetica {
    //Metodo para dividir dos enteros
    public static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args){
        System.out.println(div(50,10)); //Output: 5
        System.out.println(div(50,9)); //Output: 5
        //System.out.println(div(50, 0)); //Output: Exception
        //System.out.println(div(50, 5)); //Output: 10

        //Manejo de excepciones
        try {
            System.out.println(div(50, 0)); //Output: Exception
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0");
        } finally {
            System.out.println("Fin del try-catch");
        }

        System.out.println(div(50, 5)); //Output: 10
    }
}
