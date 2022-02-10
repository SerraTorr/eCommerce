package com.example.addProduct.controller;

import com.example.addProduct.respository.CartRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddProductController {
    @Autowired
    CartRepository cartRepository;

    @PutMapping("/addProduct/{product_id}")
    public String addProduct(@PathVariable int product_id){
        return cartRepository.addToCart(product_id);
    }

}
