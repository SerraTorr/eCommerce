package com.example.addProduct.respository;

import java.util.List;

import com.example.addProduct.model.Cart;

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
    public String addToCart(int id) {
        String sql = "insert into cart (productid) values ("+id+")";
        jdbcTemplate.update(sql);
        return "Product has been successfully added";
    } 
}
