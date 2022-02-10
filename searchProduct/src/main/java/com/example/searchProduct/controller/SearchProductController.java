package com.example.searchProduct.controller;

import java.util.List;

import com.example.searchProduct.model.Product;
import com.example.searchProduct.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SearchProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/search/{query}")
    public ResponseEntity<List<Product>> searchQuery( @PathVariable String query){
        try{
            List<Product> searchresults = productRepository.findByQuery(query);
            return new ResponseEntity<>(searchresults, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e);
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }



}
