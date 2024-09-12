package edu.br.infnet.petfriends.product.model;

import lombok.Getter;
import lombok.Setter;

public class Product {

    private final ProductsEnum productEnum;
    private final int quantity;

    public Product(ProductsEnum productEnum, int quantity) {
        this.productEnum = productEnum;
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        return productEnum.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return productEnum.getProductName() + " x" + quantity + " - $" + calculateTotalPrice();
    }
}
