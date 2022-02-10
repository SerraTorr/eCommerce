package com.example.order.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.order.model.Cart;
import com.example.order.model.Product;
import com.example.order.repository.CartRepository;
import com.example.order.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    CartRepository cartRepository;

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value="/placeOrder", method = RequestMethod.POST)
    public int placeOrder() {
        Cart cart = cartRepository.getCart();
        List<Integer> productsIdInCart = cart.getProductid();

        int total = 0;
        for (int productid : productsIdInCart) {
            total += productRepository.findById(productid).getPrice();
        }
        return total;
    }

}
