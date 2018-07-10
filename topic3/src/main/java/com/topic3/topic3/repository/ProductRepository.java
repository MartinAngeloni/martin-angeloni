package com.topic3.topic3.repository;

import com.topic3.topic3.entity.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 9/7/2018.
 */
public class ProductRepository implements IRepository<Product>{

    private final List<Product> products = new ArrayList<Product>();

    private static ProductRepository productRepository;

    private ProductRepository(){}

    //return instance
    public static ProductRepository getProducts(){
        if(productRepository == null){
            productRepository = new ProductRepository();
        }
        return productRepository;
    }

    @Override
    public Product create(Product product) {
        products.add(product);
        return product;
    }

    @Override
    public Product get(int index) {
        Product product = products.get(index);
        return product;
    }

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

    @Override
    public List<Product> getAll() {
        return products;
    }
}
