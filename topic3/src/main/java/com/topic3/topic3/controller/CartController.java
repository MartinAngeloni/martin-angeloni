package com.topic3.topic3.controller;

import com.topic3.topic3.entity.Cart;
import com.topic3.topic3.entity.Product;
import com.topic3.topic3.repository.CartRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by martin on 7/7/2018.
 */
@Controller
@RequestMapping("/cart")
public class CartController {

    CartRepository cartRepository = CartRepository.getCarts();


    @PostMapping("/create")
    @ExceptionHandler(Exception.class)
    public Cart createCart(@RequestBody Cart cart){
        return cartRepository.create(cart);
    }

    @GetMapping("/get/{id}")
    @ExceptionHandler(ClassNotFoundException.class)
    public ResponseEntity<Cart> getCart(@PathVariable int id){

        return ResponseEntity.ok(cartRepository.get(id));
    }

    @PutMapping("/update")
    public void updateCart(@RequestBody Cart cart){
        cartRepository.update(cart);
    }

    @DeleteMapping("/delete")
    public void deleteCart(@RequestBody Cart cart){
        cartRepository.delete(cart);
    }

    @PutMapping("/addtocart/{id}")
    public void addToCart(@RequestBody Product product,
                          @PathVariable int id){
        Cart cart = cartRepository.get(id);
        cart.addToCart(product);
        cartRepository.update(cart);
    }

    @PutMapping("/removotocart/{id}")
    public void removeToCart(@RequestBody Product product,
                             @PathVariable int id){
        Cart cart = cartRepository.get(id);
        cart.removeToCart(product);
        cartRepository.update(cart);
    }
}
