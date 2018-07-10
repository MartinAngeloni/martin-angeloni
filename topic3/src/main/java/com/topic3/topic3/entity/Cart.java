package com.topic3.topic3.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.topic3.topic3.service.Carry;
import com.topic3.topic3.service.Saleable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 6/7/2018.
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

    @Override
    public boolean equals(Object o) {
        if(o instanceof Cart && this.getId() == ((Cart) o).getId()){
            return true;
        }
        return false;
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
        return totalPrice;
    }

    @Override
    public void addToCart(Product product) {
        products.add(product);
    }

    @Override
    public void removeToCart(Product product) {
        products.remove(product);
    }
}
