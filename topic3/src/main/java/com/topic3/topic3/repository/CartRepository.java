package com.topic3.topic3.repository;

import com.topic3.topic3.entity.Cart;
import java.util.ArrayList;
import java.util.List;

/**
 * A singleton class to simulate a database
 * CRUD Services implementation of Cart
 * Created by martin on 6/7/2018.
 * @author angelonimartin90@gmail.com
 */
public class CartRepository implements IRepository<Cart>{

    private final List<Cart> carts = new ArrayList<Cart>();

    private static CartRepository cartRepository;

    private CartRepository(){}

    /**
     * Get the instance of himself
     * @return instance of this class
     */
    public static CartRepository getCarts(){
        if(cartRepository == null){
            cartRepository = new CartRepository();
        }
        return cartRepository;
    }

    /**
     * Add a new Cart to list
     * @param cart - Cart Object
     * @return - Cart object created
     */
    @Override
    public Cart create(Cart cart) {
        carts.add(cart);
        return cart;
    }

    /**
     * Get a Cart from his id
     * @param id - id of the Cart to search
     * @return - Cart Object
     */
    @Override
    public Cart get(int id) {
        for (Cart c: carts) {
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }

    /**
     * Replace the old Cart to another Cart
     * @param cart - Cart Object
     */
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

    /**
     * Delete Cart from the list
     * @param cart - Cart Object to delete
     */
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

    /**
     * Get the all Carts
     * @return - the list of all Carts
     */
    @Override
    public List<Cart> getAll() {
        return carts;
    }
}
