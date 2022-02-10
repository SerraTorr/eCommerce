package com.example.addProduct.respository;

import com.example.addProduct.model.Product;
import com.example.addProduct.model.User;

public interface UserRepository {
    int save(User user);
    int updateCart(Product product, User user);
    int cartTotal(User user);
}
