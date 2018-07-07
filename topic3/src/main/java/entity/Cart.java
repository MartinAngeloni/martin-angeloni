package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 6/7/2018.
 */

public class Cart {

    private int id;
    private List<Product> products;
    private List<Sale> sales;

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
}
