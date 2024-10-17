package org.example.Exo5;

import org.example.Exo4.NotImplementedException;

import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    public void update(Product product) {
        product.setSellIn(decreased(product.getSellIn(), 1));
        int decrementQuality = 1;
        int incrementQuality = 0;

        if (product.getSellIn() == 0) {
            decrementQuality += 1;
        }

        if (product.getType().equals("produit laitier") && (!product.getName().equals("brie vieilli"))) {
            decrementQuality += 1;
        }

        if (product.getName().equals("brie vieilli")) {
            incrementQuality += 1;
        }

        product.setQuality(decreased(product.getQuality(), decrementQuality));
        product.setQuality(increased(product.getQuality(), incrementQuality));
    }

    private int decreased(int value, int decrement) {
        int newValue = value - decrement;

        if (newValue < 0) {
            newValue = 0;
        }

        return newValue;
    }

    private int increased(int value, int increment) {
        int newValue = value + increment;

        if (newValue > 50) {
            newValue = 50;
        }

        return newValue;
    }
}