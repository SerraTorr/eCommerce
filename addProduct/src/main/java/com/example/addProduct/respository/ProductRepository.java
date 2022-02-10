package com.example.addProduct.respository;

import com.example.addProduct.model.Product;

import java.util.List;

public interface ProductRepository {
    int save(Product product);
    Product findById(int id);
    List<Product> findAll();
}
