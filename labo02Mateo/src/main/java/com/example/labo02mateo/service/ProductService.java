package com.example.labo02mateo.service;

import com.example.labo02mateo.domain.entity.Product;

import java.util.UUID;

public interface ProductService {
    void createProduct(Product product);

    Product getProduct(String name);
    void updateProduct(UUID id, Product product);
    Product deleteProduct(UUID id);
}
