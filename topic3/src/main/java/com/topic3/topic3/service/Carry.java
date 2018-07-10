package com.topic3.topic3.service;

import com.topic3.topic3.entity.Product;

/**
 * Created by martin on 9/7/2018.
 */
public interface Carry {

    public void addToCart(Product product);
    public void removeToCart(Product product);
}
