package com.example.searchProduct.repository;

import com.example.searchProduct.model.Product;
import com.example.searchProduct.model.User;

public interface UserRepository {
    int save(User user);
    int updateCart(Product product, User user);
    int cartTotal(User user);
}
