package org.example.Exo4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RechercheVillesTest {
    private final List<String> villes = List.of("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul");
    private final RechercheVilles rechercheVilles = new RechercheVilles(villes);

    @Test
    public void whenCityInputIsLessThan2Char_Then_ThrowCityNameTooShortException() {
        // Arrange
        String cityInput = "a";

        // Act & Assert
        Assertions.assertThrows(CityNameTooShortException.class, () -> rechercheVilles.rechercher(cityInput));
    }

    @Test
    public void whenCityInputIsGreaterThan1Char_Then_ReturnValenceVancouver() {
        // Arrange
        String cityInput = "Va";
        List<String> expected = List.of("Valence", "Vancouver");

        // Act
        List<String> result = rechercheVilles.rechercher(cityInput);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void whenCityInputIsSyDnEy_Then_ReturnSydney() {
        // Arrange
        String cityInput = "SyDnEy";
        List<String> expected = List.of("Sydney");

        // Act
        List<String> result = rechercheVilles.rechercher(cityInput);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void whenCityInputIsApe_Then_ReturnBudapest() {
        // Arrange
        String cityInput = "ape";
        List<String> expected = List.of("Budapest");

        // Act
        List<String> result = rechercheVilles.rechercher(cityInput);

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void whenCityInputIsAsterisk_Then_ReturnAllCities() {
        // Arrange
        String cityInput = "*";
        List<String> expected = rechercheVilles.getVilles();

        // Act
        List<String> result = rechercheVilles.rechercher(cityInput);

        // Assert
        Assertions.assertEquals(expected, result);
    }
}
