package org.example.Demo1;

import org.example.Exception.DivideByZeroException;
import org.junit.Assert;
import org.junit.Test;

public class CalculTest {

    @Test
    public void whenAddition_1_2_Then_3() {
        // Arrange
        Calcul calcul = new Calcul();
        double firstNumber = 1;
        double secondNumber = 2;

        // Act
        double result = calcul.addition(firstNumber, secondNumber);

        // Assert
        Assert.assertEquals(3, result,0);
    }

    @Test
    public void whenDivision_8_4_Then_2() {
        // Arrange
        Calcul calcul = new Calcul();
        double firstNumber = 8;
        double secondNumber = 4;

        // Act
        double result = calcul.division(firstNumber, secondNumber);

        // Assert
        Assert.assertEquals(2, result,0);
    }

    @Test
    public void whenDivision_8_0_Then_DivideByZeroException() {
        // Arrange
        Calcul calcul = new Calcul();
        double firstNumber = 8;
        double secondNumber = 0;

        // Act & Assert
        Assert.assertThrows(DivideByZeroException.class, () -> calcul.division(firstNumber, secondNumber));
    }
}
