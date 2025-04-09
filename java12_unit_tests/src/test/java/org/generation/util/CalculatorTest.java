package org.generation.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Priebas unitarias de la clase Calculator del paquete util")
public class CalculatorTest {

    Calculator calculator = new Calculator();

    /**
    	 * @ParameterizedTest permite ejecutar una prueba unitaria varias
	 * veces con diferentes parámetros. Es útil cuando se quiere
	 * probar el mismo método con diferentes entradas y resultados
	 * esperados, sin necesidad de escribir varias pruebas manualmente.
	 *
             * @CsvSource es una anotación que se utiliza junto con ParameterizedTest
	 * para proporcionar datos a la prueba. Los datos se suministran
	 * en formato CSV (valores separados por comas) y se asignan a
	 * los parámetros del método de prueba. Cada línea de datos
	 * representa una ejecución del test con diferentes valores.
            *
            */

    @Test
    @DisplayName("Sumatoria de números positivos")

    void addTest(){
        assertEquals( 5 , 2 + 3);
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    @DisplayName("Sumatoria de números de punto flotante")
    void addDoubleTest(){
        double delta = 0.01;
        assertEquals(0.1, calculator.add(0.05 , 0.05), delta, "0.05 + 0.05");
        assertEquals(0.2, calculator.add(0.1 , 0.1), delta, "0.1 + 0.1 = 0.2");
        assertEquals(0.3, calculator.add(0.1 , 0.2), delta);
        assertEquals(0.4, calculator.add(0.1 , 0.3), delta);
        assertEquals(0.5, calculator.add(0.1 , 0.4), delta);
        assertEquals(0.6, calculator.add(0.1 , 0.5), delta);
        assertEquals(0.7, calculator.add(0.1 , 0.6), delta);
        assertEquals(0.8, calculator.add(0.1 , 0.7), delta);
        assertEquals(0.9, calculator.add(0.1 , 0.8), delta);

    }

    @Test
    @DisplayName("Sumatoria de números negativos")
    void addNegativeNumbersTest(){
        assertEquals(-8, calculator.add(5, -13));
        assertEquals(-50, calculator.add(-100, 50));
    }


    @ParameterizedTest(name="Prueba resta de {0} - {1} = {2}")
    @CsvSource({
            "0, 10, -10",
            "10, 3, 7",
            "-6, -5, -1"
    })
    void subtractTest(int first, int second, int expectedResult){
        assertEquals(expectedResult, calculator.substract(first, second));
    }

    @Test
    @DisplayName("Substracción de números positivos")

    void substractTest(){
        assertEquals(3, calculator.substract(8,5));
        assertEquals(-3, calculator.substract(5,8));
    }

    @DisplayName("Multiplicación de números positivos")
    @ParameterizedTest(name="Prueba multiplicación de {0} - {1} = {2}")
    @CsvSource({
            "5, 4, 20",
            "-3, -8, 24",
            "-6, 5, -30",
            "3, 5, 15",
            "-10, 8, -80"
    })
    void multiplyTest(int first, int second, int expectedResult){
        assertEquals(expectedResult, calculator.multiply(first, second));
    }

    @DisplayName("División de números positivos")
    @ParameterizedTest(name="Prueba división de {0} - {1} = {2}")
    @CsvSource({
            "20, 5, 4",
            "24, -3, -8",
            "-30, -6, 5",
            "15, 3, 5",
            "-100, 10, -10"
    })

    void divideTest(int first, int second, int expectedResult){
        assertEquals(expectedResult, calculator.divide(first, second));
    }

    /* Prueba de que una excepción sucede */
    @Test
    void diveWithException(){
        assertThrows(ArithmeticException.class, ()-> calculator.divide(100, 0));
    }

}
