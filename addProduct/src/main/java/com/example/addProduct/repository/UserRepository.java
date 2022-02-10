package com.example.addProduct.repository;

import com.example.addProduct.model.Product;
import com.example.addProduct.model.User;

import java.util.List;

public interface UserRepository {
    int save(User user);
    int updateCart(List<Product> productList);
    int cartTotal(User user);
}
