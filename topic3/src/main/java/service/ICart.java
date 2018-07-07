package service;

import entity.Cart;

/**
 * Created by martin on 6/7/2018.
 */
public interface ICart {

    public void createCart(Cart cart);
    public Cart getCart();
    public void updateCart();
    public void deleteCart();

}
