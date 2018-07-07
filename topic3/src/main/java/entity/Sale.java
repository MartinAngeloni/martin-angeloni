package entity;

import java.util.List;

/**
 * Created by martin on 6/7/2018.
 */
public class Sale {

    private int id;
    private Cart cart;
    private int totalPrice;

    public Sale(int id, int totalPrice){
        this.id = id;
        this.totalPrice = totalPrice;
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
