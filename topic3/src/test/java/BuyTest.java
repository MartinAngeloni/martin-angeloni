import com.topic3.topic3.entity.Cart;
import com.topic3.topic3.entity.Product;
import com.topic3.topic3.entity.Sale;
import com.topic3.topic3.repository.CartRepository;
import com.topic3.topic3.repository.ProductRepository;
import com.topic3.topic3.repository.SaleRepository;
import com.topic3.topic3.service.CartServices;
import com.topic3.topic3.service.Saleable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by martin on 9/7/2018.
 */
@SpringBootTest
public class BuyTest {

    private Saleable saleable = new CartServices();

    ProductRepository productRepository = ProductRepository.getProducts();
    CartRepository cartRepository = CartRepository.getCarts();
    SaleRepository saleRepository = SaleRepository.getSales();
    Cart cart;

    @Before
    public void loadData(){
        Product burger = new Product(1, "Burger", "Food", 50);
        Product wine = new Product(1, "Wine", "Drink", 200);
        Product wire = new Product(1, "HDwire", "Electronics", 450);

        productRepository.create(burger);
        productRepository.create(wine);
        productRepository.create(wire);

        cart = new Cart(1);
        cart.addToCart(burger);
        cart.addToCart(wine);
        cart.addToCart(wire);

        cartRepository.create(cart);
    }

    @Test
    public void buyTest(){

        saleable.buy(cart);
        Sale sale = saleRepository.get(0);

        Assert.assertEquals(1, sale.getId());
        Assert.assertEquals(cart, sale.getCart());
        Assert.assertEquals(3, cart.getProducts().size());

    }
}
