package com.example.addProduct.repository;

import com.example.addProduct.model.Product;
import com.example.addProduct.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcUserRepository implements UserRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(User user) {
        return jdbcTemplate.update("INSERT INTO usertable VALUES ");
    }

    @Override
    public int updateCart(List<Product> productList) {
        return 0;
    }

    @Override
    public int cartTotal(User user) {
        return 0;
    }
}
