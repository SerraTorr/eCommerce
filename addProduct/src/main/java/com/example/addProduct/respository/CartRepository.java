package com.example.addProduct.respository;

import com.example.addProduct.model.Cart;

public interface CartRepository {
    //getcart from sql
    public Cart getCart();
    //add to cart in sql
    public String addToCart(int id);
}
