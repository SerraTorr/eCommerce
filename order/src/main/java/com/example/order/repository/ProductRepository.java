package com.example.order.repository;

import com.example.order.model.Product;

import java.util.List;

public interface ProductRepository {
    int save(Product product);
    Product findById(int id);
    List<Product> findAll();
}
