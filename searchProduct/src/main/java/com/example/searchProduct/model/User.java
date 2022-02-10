package com.example.searchProduct.model;

import java.util.List;

public class User {
    int userid;
    List<Integer> cart;

    public User(int userid, List<Integer> cart) {
        this.userid = userid;
        this.cart = cart;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public List<Integer> getCart() {
        return cart;
    }

    public void setCart(List<Integer> cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", cart=" + cart +
                '}';
    }
}
