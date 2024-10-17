package org.example.Demo1;

import org.example.Exception.DivideByZeroException;

public class Calcul {
    // addition de 2 nombres puis retourne le résultat
    public double addition(double a, double b) {
        return a + b;
    }
    
    // soustraction de 2 nombres puis retourne le résultat
    
    
    // multiplication de 2 nombres puis retourne le résultat
    
    
    // division de 2 nombres puis retourne le résultat
    public double division(double a, double b) {
        if (b == 0) {
            throw new DivideByZeroException();
        }

        return a / b;
    }
}
