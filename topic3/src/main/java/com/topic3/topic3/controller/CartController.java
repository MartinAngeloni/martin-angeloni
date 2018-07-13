package com.topic3.topic3.controller;

import com.topic3.topic3.entity.Cart;
import com.topic3.topic3.entity.Product;
import com.topic3.topic3.repository.CartRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller class of Cart
 * CRUD basics services - also has add and remove products method
 * Created by martin on 7/7/2018.
 * @author angelonimartin90@gmail.com
 */
@RestController
@RequestMapping("/carts")
public class CartController {

    CartRepository cartRepository = CartRepository.getCarts();

    /**
     * Method to create a Cart with a Json Object
     * @param cart - a Json Cart object
     * @return - a Cart created object
     */
    @PostMapping("/create")
    public ResponseEntity<Cart> createCart(@RequestBody Cart cart){
        Cart cartCreated = cartRepository.create(cart);
        return ResponseEntity.ok(cartCreated);
    }

    /**
     * Method to get a cart from his repository
     * @param cartId - id of the cart to search
     * @return - a Json Cart Object
     */
    @GetMapping("/{cartId}")
    public ResponseEntity<Cart> getCart(@PathVariable int cartId){
        return ResponseEntity.ok(cartRepository.get(cartId));
    }

    /**
     * Method to update Cart
     * @param cart - a Json Cart Object
     */
    @PutMapping("/update")
    public void updateCart(@RequestBody Cart cart){
        cartRepository.update(cart);
    }

    /**
     * Method to delete a Cart from his repository
     * @param cart - a Json Cart Object
     */
    @DeleteMapping("/delete")
    public void deleteCart(@RequestBody Cart cart){
        cartRepository.delete(cart);
    }

    /**
     * Method to add product a particular cart
     * @param product - a Json Product Object
     * @param cartId - id of the Cart
     */
    @PutMapping("/add/{cartId}")
    public void addToCart(@RequestBody Product product,
                          @PathVariable int cartId){
        Cart cart = cartRepository.get(cartId);
        cart.addToCart(product);
        cartRepository.update(cart);
    }

    /**
     * Method to remove a Product of a particular Cart
     * @param product - a Json Product Object
     * @param cartId - id of the Cart
     */
    @PutMapping("/remove/{cartId}")
    public void removeToCart(@RequestBody Product product,
                             @PathVariable int cartId){
        Cart cart = cartRepository.get(cartId);
        cart.removeToCart(product);
        cartRepository.update(cart);
    }
}
