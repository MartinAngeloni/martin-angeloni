package com.topic3.topic3.controller;

import com.topic3.topic3.entity.Cart;
import com.topic3.topic3.entity.Sale;
import com.topic3.topic3.service.Saleable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class of Sale
 * Created by martin on 9/7/2018.
 * @author angelonimartin90@gmail.com
 */
@RestController
@RequestMapping("/sales")
public class SaleController {

    @Autowired
    @Qualifier("cartServices")
    private Saleable saleable;

    /**
     * Method to create a Sale
     * @param cart
     * @return
     */
    @PostMapping("/buy")
    public Sale buy(@RequestBody Cart cart){
        return (Sale) saleable.buy(cart);
    }
}
