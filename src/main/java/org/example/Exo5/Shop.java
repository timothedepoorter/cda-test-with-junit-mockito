package org.example.Exo5;

import java.util.List;

public class Shop {
    private List<Product> products;

    public void update(Product product) {
        int decrement = 1;
        product.setSellIn(product.getSellIn() - 1);


        // Special case
        if (product.getName().equals("brie vieilli")) {
            incrementQuality(product);
            return;
        }

        if (product.getSellIn() <= 0) {
            decrement*=2;
        }

        if (product.getType().equals("produit laitier")) {
            decrement*=2;
        }

        decrementQuality(product, decrement);
    }

    private void incrementQuality(Product product) {
        product.setQuality(product.getQuality() + 1);

        if (product.getQuality() > 50) {
            product.setQuality(50);
        }
    }

    private void decrementQuality(Product product, int decrement) {
        product.setQuality(product.getQuality() - decrement);

        if (product.getQuality() < 0) {
            product.setQuality(0);
        }
    }
}