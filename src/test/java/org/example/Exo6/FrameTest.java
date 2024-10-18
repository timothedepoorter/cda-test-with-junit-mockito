package org.example.Exo6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class FrameTest {

    IGenerateur iGenerateur = Mockito.mock(IGenerateur.class);
    Frame frame = new Frame(iGenerateur, false);

    @Test
    public void Roll_SimpleFrame_FirstRoll_CheckScore() {
        // Arrange
        int oldScore = frame.getScore();
        Mockito.when(iGenerateur.randomPin(10)).thenReturn(5);

        // Act
        frame.makeRoll();

        // Assert
        Assertions.assertTrue(frame.getScore() > oldScore);
    }
}
