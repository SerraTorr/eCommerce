package com.example.searchProduct.repository;

import com.example.searchProduct.model.Product;
import com.example.searchProduct.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcUserRepository implements UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(User user) {
        return jdbcTemplate.update("INSERT INTO usertable VALUES  ");
    }

    @Override
    public int updateCart(Product product) {
        return 0;
    }

    @Override
    public int cartTotal(User user) {
        return 0;
    }

}
