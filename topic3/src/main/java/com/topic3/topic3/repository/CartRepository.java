package com.topic3.topic3.repository;

import com.topic3.topic3.entity.Cart;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 6/7/2018.
 */
public class CartRepository implements IRepository<Cart>{

    private final List<Cart> carts = new ArrayList<Cart>();

    private static CartRepository cartRepository;

    private CartRepository(){}

    //return instance
    public static CartRepository getCarts(){
        if(cartRepository == null){
            cartRepository = new CartRepository();
        }
        return cartRepository;
    }

    @Override
    public Cart create(Cart cart) {
        carts.add(cart);
        return cart;
    }

    @Override
    public Cart get(int id) {
        for (Cart c: carts) {
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }

    @Override
    public void update(Cart cart) {
        Cart cartToUpdate = null;
        for (Cart c: carts) {
            if(c.getId() == cart.getId()){
                cartToUpdate = c;
                break;
            }
        }
        carts.remove(cartToUpdate);
        carts.add(cart);
    }

    @Override
    public void delete(Cart cart) {
        Cart cartToDelete = null;
        for (Cart c: carts) {
            if(c.getId() == cart.getId()){
                cartToDelete = c;
                break;
            }
        }
        carts.remove(cartToDelete);
    }

    @Override
    public List<Cart> getAll() {
        return carts;
    }
}
