package com.example.order.repository;

import com.example.order.model.Cart;

public interface CartRepository {
    //getcart from sql
    public Cart getCart();
    //add to cart in sql
    public void addToCart(int id);
}
