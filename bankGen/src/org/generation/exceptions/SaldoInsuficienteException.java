package org.generation.exceptions;

// Crear una Exception personalizada (SaldoInsuficienteException es una subclase de Exception)
public class SaldoInsuficienteException extends Exception {

    // Constructor de la Excepción (exception   )
    public SaldoInsuficienteException(String message) {
        super(message); // Proviene de la superclase
    }
}
