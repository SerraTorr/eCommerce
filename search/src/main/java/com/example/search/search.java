package com.example.search;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

public class search {

    private JdbcTemplate jdbc;
    public List<Integer> searchProduct(String s){
        List<Integer> res = new ArrayList();
        String sql = "SELECT id FROM Products WHERE productname REGEXP './"+s+"./";

        res = jdbc.query(sql);



        return res;
    }
}
