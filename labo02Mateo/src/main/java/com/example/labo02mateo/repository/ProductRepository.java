package com.example.labo02mateo.repository;

import com.example.labo02mateo.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {

    Product getProductsByName(String name);

    Product getProductsById(UUID id);

    void deleteById(UUID id);

}
