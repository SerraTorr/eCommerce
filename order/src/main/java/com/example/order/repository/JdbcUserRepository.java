package com.example.order.repository;

import com.example.order.model.Product;
import com.example.order.model.User;
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
