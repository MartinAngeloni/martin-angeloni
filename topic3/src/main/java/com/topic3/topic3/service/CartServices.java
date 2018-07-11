package com.topic3.topic3.service;

import com.topic3.topic3.entity.Cart;
import com.topic3.topic3.entity.Sale;
import com.topic3.topic3.repository.SaleRepository;
import org.springframework.stereotype.Service;

/**
 * Created by martin on 9/7/2018.
 */
@Service("cartServices")
public class CartServices implements Saleable<Sale, Cart>{

    SaleRepository saleRepository = SaleRepository.getSales();

    @Override
    public Sale buy(Cart cart) {
        Sale sale = new Sale(1);
        sale.setTotalPrice(cart.getTotalPrice());
        sale.setCart(cart);
        return saleRepository.create(sale);
    }
}
