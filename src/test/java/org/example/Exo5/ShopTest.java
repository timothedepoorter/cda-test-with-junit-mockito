package org.example.Exo5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ShopTest {

    private Shop shop;
    private List<Product> products = new ArrayList<>(1);

    @BeforeEach
    public void setUp() {
        products.clear();
    }

    @Test
    public void whenSellIn0_Then_QualityDecreased2() {
        // Arrange
        products = List.of(new Product("viande", "steack haché", 0, 50));
        shop = new Shop(products);
        List<Product> expected = products;
        expected.get(0).setQuality(expected.get(0).getQuality() - 2);

        // Act
        products.forEach(product -> shop.update(product));

        // Assert
        Assertions.assertArrayEquals(expected.toArray(), products.toArray());
    }

    @Test
    public void whenQuality0AndDecreased1_Then_QualityKeepValue0() {
        // Arrange
        products = List.of(new Product("viande", "steack haché", 15, 0));
        shop = new Shop(products);
        List<Product> expected = products;
        expected.get(0).setSellIn(expected.get(0).getSellIn() - 1);

        // Act
        products.forEach(product -> shop.update(product));

        // Assert
        Assertions.assertArrayEquals(expected.toArray(), products.toArray());
    }

    @Test
    public void whenQuality50AndIncreased1_Then_QualityKeepValue50() {
        // Arrange
        products = List.of(new Product("produit laitier", "brie veilli", 15, 50));
        shop = new Shop(products);
        List<Product> expected = products;
        expected.get(0).setSellIn(expected.get(0).getSellIn() - 1);

        // Act
        products.forEach(product -> shop.update(product));

        // Assert
        Assertions.assertArrayEquals(expected.toArray(), products.toArray());
    }

    @Test
    public void whenSellIn12DecreasedOfBrieVeilli_Then_QualityIncreased1() {
        // Arrange
        products = List.of(new Product("produit laitier", "brie veilli", 12, 25));
        shop = new Shop(products);
        List<Product> expected = products;
        expected.get(0).setSellIn(expected.get(0).getSellIn() - 1);
        expected.get(0).setQuality(expected.get(0).getQuality() + 1);

        // Act
        products.forEach(product -> shop.update(product));

        // Assert
        Assertions.assertArrayEquals(expected.toArray(), products.toArray());
    }

    @Test
    public void whenSellInOfProduitLaitierDecreased_Then_QualityDecreased2() {
        // Arrange
        products = List.of(new Product("produit laitier", "yaourt", 12, 25));
        shop = new Shop(products);
        List<Product> expected = products;
        expected.get(0).setSellIn(expected.get(0).getSellIn() - 1);
        expected.get(0).setQuality(expected.get(0).getQuality() - 2);

        // Act
        products.forEach(product -> shop.update(product));

        // Assert
        Assertions.assertArrayEquals(expected.toArray(), products.toArray());
    }
}
