package service.implementation;

import entity.Cart;
import entity.Product;
import entity.Sale;
import org.springframework.stereotype.Service;
import repository.CartRepository;
import service.ICart;

/**
 * Created by martin on 6/7/2018.
 */
@Service("iCartImpl")
public class ICartImpl implements ICart{

    CartRepository cartRepository;
    private Product burger;
    private Product wine;
    private Product cable;
    private Sale sale;

    @Override
    public void createCart(Cart cart) {
        //products
        burger = new Product(1,"Burger","Food",50);
        wine = new Product(2, "WhiteWine", "Drink", 100);
        cable = new Product(3, "HD Cable", "Electronics", 450);
        //total price
        int add = burger.getPrice() + wine.getPrice() + cable.getPrice();
        //sale with total price
        sale = new Sale(1, add);
        //cart
        cart = new Cart(1);
        cartRepository.getCarts().add(cart);
    }

    @Override
    public Cart getCart() {
        return null;
    }

    @Override
    public void updateCart() {

    }

    @Override
    public void deleteCart() {

    }
}
