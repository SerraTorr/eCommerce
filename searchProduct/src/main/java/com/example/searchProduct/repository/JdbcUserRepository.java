package com.example.searchProduct.repository;

import com.example.searchProduct.model.Product;
import com.example.searchProduct.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcUserRepository implements UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(User user) {
        return jdbcTemplate.update("INSERT INTO users (cart) VALUES (array[]::int[])");
    }

    @Override
    public int updateCart(Product product, User user) {
        return jdbcTemplate.update("UPDATE users SET cart = cart || ? WHERE userid=?;", new Object[] {product.getProductid(), user.getUserid()});
    }

    @Override
    public int cartTotal(User user) {
        int value = 0;
        try {
            List<Product> products = jdbcTemplate.query("SELECT * FROM users WHERE userid = ?", BeanPropertyRowMapper.newInstance(Product.class), user.getUserid());
            for (Product product : products) {
                value += product.getPrice();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return value;
    }

}
