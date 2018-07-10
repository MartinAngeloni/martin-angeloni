import com.topic3.topic3.entity.Cart;
import com.topic3.topic3.entity.Product;
import com.topic3.topic3.repository.CartRepository;
import com.topic3.topic3.repository.ProductRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by martin on 9/7/2018.
 */
@SpringBootTest
public class CartTest {

    Product burger;
    Product wine;
    Product wire;
    ProductRepository productRepository = ProductRepository.getProducts();

    Cart cart;
    CartRepository cartRepository = CartRepository.getCarts();


    @Before
    public void loadData(){
        burger = new Product(1, "Burger", "Food", 50);
        wine = new Product(1, "Wine", "Drink", 200);
        wire = new Product(1, "HDwire", "Electronics", 450);

        productRepository.create(burger);
        productRepository.create(wine);
        productRepository.create(wire);

        cart = new Cart(1);
        cartRepository.create(cart);
    }


    @Test
    public void addToCart(){

        cart.addToCart(burger);
        cart.addToCart(wine);
        cart.addToCart(wire);
        cartRepository.update(cart);
        Cart cartToTest = cartRepository.get(1);

        Assert.assertTrue(cartToTest.getProducts().contains(burger));
        Assert.assertTrue(cartToTest.getProducts().contains(wine));
        Assert.assertTrue(cartToTest.getProducts().contains(wire));

        int totalPrice = 0;

        for (Product p: cartToTest.getProducts()) {
            totalPrice += p.getPrice();
        }

        Assert.assertEquals(totalPrice, cartToTest.getTotalPrice());

    }


}
