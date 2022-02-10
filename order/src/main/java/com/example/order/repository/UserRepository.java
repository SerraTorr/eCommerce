package com.example.order.repository;

import com.example.order.model.Product;
import com.example.order.model.User;

public interface UserRepository {
    int save(User user);
    int updateCart(Product product);
    int cartTotal(User user);
}
