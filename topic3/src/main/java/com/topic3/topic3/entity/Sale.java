package com.topic3.topic3.entity;

/**
 * Create a sale with his total price
 * Created by martin on 6/7/2018.
 * @author angelonimartin90@gmail.com
 */
public class Sale {

    private int id;
    private Cart cart;
    private int totalPrice;

    public Sale(){}

    public Sale(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
