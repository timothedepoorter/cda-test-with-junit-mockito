package org.example.Exo4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RechercheVillesTest {
    private final List<String> villes = List.of("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul");
    private final RechercheVilles rechercheVilles = new RechercheVilles(villes);

    @Test
    public void whenCityInputIsLessThan2Char_Then_ThrowNotFoundException() {
        // Arrange
        String cityInput = "a";

        // Act & Assert
        Assertions.assertThrows(CityNameTooShortException.class, () -> rechercheVilles.rechercher(cityInput));
    }
}
