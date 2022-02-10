package com.example.searchProduct.repository;

import com.example.searchProduct.model.Product;

import java.util.List;

public interface ProductRepository {
    
    int save(Product product);
    Product findById(int id);
    List<Product> findAll();
    List<Product> findByQuery(String query);
}
