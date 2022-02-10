package com.example.order.repository;

import java.util.List;

import com.example.order.model.Cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcCartRepository implements CartRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Cart getCart() {
        String sql = "select * from cart";
        List<Integer> prods = jdbcTemplate.queryForList(sql, Integer.class);
        Cart cart = new Cart(prods);
        return cart;
    }

    @Override
    public void addToCart(int id) {
        // TODO Auto-generated method stub
        
    } 
}
