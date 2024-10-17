package org.example.Exo3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mockito;

public class DiceScoreTest {

    private DiceScore diceScore;

    private Ide de;

    @Test
    @DisplayName("Test Display Name")
    public void whenTwoDices5_Then_Return20() {
        // Arrange
        int expected = 20;
        de = Mockito.mock(Ide.class);
        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(5);

        // Act
        int result = diceScore.getScore();

        // Assert
        Assertions.assertEquals(expected, result);
    }


    @Test
    @Disabled("Test Disabled")
    public void whenTwoDices6_Then_Return30() {
        // Arrange
        int expected = 30;
        de = Mockito.mock(Ide.class);
        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(6);

        // Act
        int result = diceScore.getScore();

        // Assert
        Assertions.assertEquals(expected, result);
    }


    @Test
    public void whenTwoDicesDifferents_Then_ReturnCorrectValue() {
        // Arrange
        int expected = 5;
        de = Mockito.mock(Ide.class);
        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(4).thenReturn(5);

        // Act
        int result = diceScore.getScore();

        // Assert
        Assertions.assertEquals(expected, result);
    }
}
