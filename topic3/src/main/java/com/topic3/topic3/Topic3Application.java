package com.topic3.topic3;

import com.topic3.topic3.entity.Cart;
import com.topic3.topic3.entity.Product;
import com.topic3.topic3.repository.CartRepository;
import com.topic3.topic3.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Topic3Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Topic3Application.class, args);
	}

	ProductRepository productRepository = ProductRepository.getProducts();
	CartRepository cartRepository = CartRepository.getCarts();

	@Override
	public void run(String... strings) throws Exception {

		Product burger = new Product(1, "Burger", "Food", 50);
		Product wine = new Product(1, "Wine", "Drink", 200);
		Product wire = new Product(1, "HDwire", "Electronics", 450);

		productRepository.create(burger);
		productRepository.create(wine);
		productRepository.create(wire);

		Cart cart = new Cart(1);
		cart.addToCart(burger);
		cart.addToCart(wine);
		cart.addToCart(wire);

		cartRepository.create(cart);
	}
}
