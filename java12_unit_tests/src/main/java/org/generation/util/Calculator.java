package org.generation.util;

public class Calculator {
    public int add(int num1, int num2){
        // TO DO: Realizar la implementación
        return num1 + num2;
    }

    public double add(double num1, double num2){
        // TO DO: Realizar la implementación
        return num1 + num2;
    }

    /** substract **/
    public int substract(int num1, int num2){
        return num1 - num2;
    }

    /** multiiply **/
    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    /** divide **/
    public int divide(int num1, int num2){
        if(num2 == 0){
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return num1 / num2;
    }

}
