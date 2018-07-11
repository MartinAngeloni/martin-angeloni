package com.topic3.topic3.entity;

/**
 * Create product with a ID, Category, an a price
 * Created by martin on 6/7/2018.
 * @author angelonimartin90@gmail.com
 */
public class Product {

    private int id;
    private String name;
    private String category;
    private Sale sale;
    private int price;

    public Product(){}

    public Product(int id, String name, String category, int price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.sale = null;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * To delete the same object from a repository
     * @param o
     * @return - if is a equal object or no
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        return id == product.id;
    }
}
