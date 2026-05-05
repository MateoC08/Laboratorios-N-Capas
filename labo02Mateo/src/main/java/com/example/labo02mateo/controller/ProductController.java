package com.example.labo02mateo.controller;

import com.example.labo02mateo.domain.entity.Product;
import com.example.labo02mateo.impl.ProductServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController //este archivo forma parte de la presentacion y es una api rest
@RequestMapping("/api/product") //https://localhost:8085 y aca ponemos el controlador para acceder a esta shit
@AllArgsConstructor
public class ProductController {
    private final ProductServiceImpl productService;

    //vamos a crear entonces, el metodo post
    @PostMapping("/create")
    //con esto mostramos las cosas <entidad para la cual manejamos esto> @RequestBody es de donde obtenemos las cosas y como lo manejaremos?
    public ResponseEntity<Product> createProduct(@RequestBody Product product ){
        productService.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(product);
    }

    @GetMapping("/getProduct/{name}")
    public ResponseEntity<Product> getProduct(@PathVariable String name){
        return ResponseEntity.
                status(HttpStatus.OK)
                .body(productService.getProduct(name));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Product> updateProduct(
            @PathVariable UUID id,
            @RequestBody Product product
    ) {
        productService.updateProduct(id, product);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(product);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Product> deleteProduct(
            @PathVariable UUID id
    ) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(productService.deleteProduct(id));
    }

}
