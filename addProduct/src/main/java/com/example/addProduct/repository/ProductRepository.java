package com.example.addProduct.repository;

import com.example.addProduct.model.Product;

import java.util.List;

public interface ProductRepository {
    int save(Product product);
    Product findByName(String nameString);
    List<Product> findAll();
}
