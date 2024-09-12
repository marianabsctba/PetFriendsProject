package edu.br.infnet.petfriends.product.controller;

import edu.br.infnet.petfriends.product.model.ProductsEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    public ProductsEnum[] getAllProducts() {
        return ProductsEnum.values();
    }
}
