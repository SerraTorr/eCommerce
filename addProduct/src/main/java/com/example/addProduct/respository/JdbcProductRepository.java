package com.example.addProduct.respository;

import com.example.addProduct.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcProductRepository implements ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(Product product) {
        return jdbcTemplate.update("INSERT INTO product (productname, price) VALUES (?,?)", new Object[] {product.getProductname(), product.getPrice()});
    }

    @Override
    public Product findById(int id) {
        try {
            return jdbcTemplate.queryForObject("SELECT * FROM product WHERE productid=?", BeanPropertyRowMapper.newInstance(Product.class), id);
        } catch (IncorrectResultSizeDataAccessException e) {
            System.out.println(e);
            return null;
        }
    }

    @Override
    public List<Product> findAll() {
        return jdbcTemplate.query("SELECT * FROM product", BeanPropertyRowMapper.newInstance(Product.class));
    }


}
