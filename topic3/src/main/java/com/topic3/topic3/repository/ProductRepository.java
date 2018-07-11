package com.topic3.topic3.repository;

import com.topic3.topic3.entity.Product;
import java.util.ArrayList;
import java.util.List;

/**
 * A singleton class to simulate a database
 * CRUD Services implementation of Product
 * Created by martin on 9/7/2018.
 * @author angelonimartin90@gmail.com
 */
public class ProductRepository implements IRepository<Product>{

    private final List<Product> products = new ArrayList<Product>();

    private static ProductRepository productRepository;

    private ProductRepository(){}

    /**
     * Get the instance of himself
     * @return - instance of this class
     */
    public static ProductRepository getProducts(){
        if(productRepository == null){
            productRepository = new ProductRepository();
        }
        return productRepository;
    }

    /**
     * Add a new Product to list
     * @param product - Product Object
     * @return - Product Object
     */
    @Override
    public Product create(Product product) {
        products.add(product);
        return product;
    }

    /**
     * Get a Product from his id
     * @param id - id of the Product to search
     * @return - Product Object
     */
    @Override
    public Product get(int id) {
        Product product = products.get(id);
        return product;
    }

    /**
     * Replace the old Product to another Product
     * @param product - Product Object
     */
    @Override
    public void update(Product product) {
        Product productToUpdate = null;
        for (Product c: products) {
            if(c.getId() == product.getId()){
                productToUpdate = c;
                break;
            }
        }
        products.remove(productToUpdate);
        products.add(product);
    }

    /**
     * Delete Product from the list
     * @param product - Product Object to delete
     */
    @Override
    public void delete(Product product) {
        Product productToDelete = null;
        for (Product c: products) {
            if(c.getId() == product.getId()){
                productToDelete = c;
                break;
            }
        }
        products.remove(productToDelete);
    }

    /**
     * Get the all Products
     * @return - the list of all Products
     */
    @Override
    public List<Product> getAll() {
        return products;
    }
}
