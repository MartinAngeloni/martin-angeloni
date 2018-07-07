package repository;

import entity.Cart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by martin on 6/7/2018.
 */
public class CartRepository {

    private List<Cart> carts;

    private CartRepository(){}

    public List<Cart> getCarts(){
        if(carts == null){
            carts = new ArrayList<Cart>();
        }
        return carts;
    }
}
