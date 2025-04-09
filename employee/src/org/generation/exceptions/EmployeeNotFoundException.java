package org.generation.exceptions;

// Esta Exception será Unchecked (no verificada) para no manejarla con un bloque try-catch

// Exception RunTimeException (superclass)
public class EmployeeNotFoundException extends RuntimeException{

    // Constructor
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
