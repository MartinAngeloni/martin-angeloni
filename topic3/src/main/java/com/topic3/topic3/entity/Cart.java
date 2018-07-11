package com.topic3.topic3.entity;

import com.topic3.topic3.service.Carry;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 6/7/2018.
 * Create a cart with id and his products and sales
 * @author angelonimartin90@gmail.com
 */
public class Cart implements Carry{

    private int id;
    private List<Product> products;
    private List<Sale> sales;

    public Cart(){
        this.id = id;
        this.products = new ArrayList<Product>();
        this.sales = new ArrayList<Sale>();
    }

    public Cart(int id){
        this.id = id;
        this.products = new ArrayList<Product>();
        this.sales = new ArrayList<Sale>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }

    /**
     * To delete the same object from a repository
     * @param o - object to compare
     * @return return if the object is equals or no
     */
    @Override
    public boolean equals(Object o) {
        if(o instanceof Cart && this.getId() == ((Cart) o).getId()){
            return true;
        }
        return false;
    }

    /**
     * @return the sum of the price of all products added in cart
     */
    public int getTotalPrice() {
        int totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
        return totalPrice;
    }

    /**
     * Add one product to cart
     * @param product - a product object
     */
    @Override
    public void addToCart(Product product) {
        products.add(product);
    }

    /**
     * The product that gonna be removed
     * @param product - a product object
     */
    @Override
    public void removeToCart(Product product) {
        products.remove(product);
    }
}
