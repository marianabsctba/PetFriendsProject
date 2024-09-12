package edu.br.infnet.petfriends.product.model;

import lombok.Getter;

@Getter
public enum ProductsEnum {
    PET_SHAMPOO("Shampoo para Pets", 20.00, "Shampoo para pets, adequado para todas as raças."),
    DOG_FOOD("Ração para Cachorro", 50.50, "Ração premium para cachorros com nutrição equilibrada."),
    CAT_FOOD("Ração para Gato", 45.00, "Ração de alta qualidade para gatos com vitaminas essenciais."),
    PET_TOY("Brinquedo para Pets", 15.00, "Brinquedo durável para pets brincarem."),
    DOG_LEASH("Coleira para Cachorro", 25.00, "Coleira resistente para passear com seu cachorro."),
    CAT_LITTER("Areia para Gato", 10.00, "Areia absorvente para fácil limpeza."),
    PET_BED("Cama para Pet", 60.00, "Cama confortável para o descanso do seu pet.")
    ;

    private final String productName;
    private final double price;
    private final String description;

    ProductsEnum(String productName, double price, String description) {
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return productName + " (" + description + ") - $" + price;
    }
}
