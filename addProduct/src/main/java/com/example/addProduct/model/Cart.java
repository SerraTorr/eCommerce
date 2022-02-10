package com.example.addProduct.model;


public class Cart {
    private int productid;

    public Cart(){

    }

    public Cart(int productid){
        this.productid = productid;
    }

    public int getProductid(){
        return this.productid;
    }

    
}
