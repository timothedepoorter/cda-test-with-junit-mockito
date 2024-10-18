package org.example.Exo5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShopTest {

    private Shop shop;
    private Product product;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
    }

    @Test
    public void whenUpdateProduct_Then_SellInDecreased1() {
        // Arrange
        product = new Product("viande", "steack haché", 15, 18);
        int expected = 14;

        // Act
        shop.update(product);

        // Assert
        Assertions.assertEquals(expected, product.getSellIn());
    }

    @Test
    public void whenUpdateProduct_Then_QualityDecreased1() {
        // Arrange
        product = new Product("viande", "steack haché", 15, 18);
        int expected = 17;

        // Act
        shop.update(product);

        // Assert
        Assertions.assertEquals(expected, product.getQuality());
    }

    @Test
    public void whenUpdateProductWithSellIn0_Then_QualityDecreased2() {
        // Arrange
        product = new Product("viande", "steack haché", 0, 18);
        int expected = 16;

        // Act
        shop.update(product);

        // Assert
        Assertions.assertEquals(expected, product.getQuality());
    }

    @Test
    public void whenUpdateProductWithQuality0_Then_QualityKeepValue0() {
        // Arrange
        product = new Product("viande", "steack haché", 15, 0);
        int expected = 0;

        // Act
        shop.update(product);

        // Assert
        Assertions.assertEquals(expected, product.getQuality());
    }

    @Test
    public void whenUpdateProductOfTypeDairyProduct_Then_QualityDecreased2() {
        // Arrange
        product = new Product("produit laitier", "yaourt", 15, 40);
        int expected = 38;

        // Act
        shop.update(product);

        // Assert
        Assertions.assertEquals(expected, product.getQuality());
    }

    @Test
    public void whenUpdateProductWithNameBrieVieilli_Then_QualityIncreased1() {
        // Arrange
        product = new Product("produit laitier", "brie vieilli", 15, 40);
        int expected = 41;

        // Act
        shop.update(product);

        // Assert
        Assertions.assertEquals(expected, product.getQuality());
    }

    @Test
    public void whenUpdateProductWithQuality50_Then_QualityKeepValue50() {
        // Arrange
        product = new Product("produit laitier", "brie vieilli", 15, 50);
        int expected = 50;

        // Act
        shop.update(product);

        // Assert
        Assertions.assertEquals(expected, product.getQuality());
    }

    @Test
    public void whenUpdateProductWithSellIn0AndOfTypeDairyProduct_Then_QualityDecreased4() {
        // Arrange
        product = new Product("produit laitier", "yaourt", 0, 50);
        int expected = 46;

        // Act
        shop.update(product);

        // Assert
        Assertions.assertEquals(expected, product.getQuality());
    }
}
