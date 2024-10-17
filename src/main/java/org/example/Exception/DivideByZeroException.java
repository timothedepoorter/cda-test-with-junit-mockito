package org.example.Exception;

public class DivideByZeroException extends RuntimeException {
    public DivideByZeroException() {
        super("Division par zéro");
    }
}
