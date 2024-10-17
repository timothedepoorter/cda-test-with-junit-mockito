package org.example.Exo4;

public class CityNameTooShortException extends RuntimeException {
    public CityNameTooShortException() {
        super("Nom de ville incorrect");
    }
}
