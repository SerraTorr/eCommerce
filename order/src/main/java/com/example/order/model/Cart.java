package com.example.order.model;

import java.util.List;

public class Cart {
    private List<Integer> productid;

    public Cart(){

    }

    public Cart(List<Integer> productid){
        this.productid = productid;
    }

    public List<Integer> getProductid(){
        return this.productid;
    }

    
}

