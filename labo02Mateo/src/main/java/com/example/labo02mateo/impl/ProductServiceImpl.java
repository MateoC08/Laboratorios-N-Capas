package com.example.labo02mateo.impl;

import com.example.labo02mateo.domain.entity.Product;
import com.example.labo02mateo.repository.ProductRepository;
import com.example.labo02mateo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public void createProduct(Product product){
        productRepository.save(product);
    }

    @Override
    public Product getProduct(String name) {
        return productRepository.getProductsByName(name);
    }

    @Override
    public void updateProduct(UUID id, Product product) {
        Product existProduct = productRepository.getProductsById(id);
        existProduct.setName(product.getName());
        existProduct.setPrice(product.getPrice());
        existProduct.setAvailable(product.getAvailable());
        productRepository.save(existProduct);
    }

    @Override
    public Product deleteProduct(UUID id) {
        Product existProduct = productRepository.getProductsById(id);
        productRepository.deleteById(id);
        return existProduct;
    }

}
