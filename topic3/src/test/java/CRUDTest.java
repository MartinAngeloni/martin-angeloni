import com.topic3.topic3.entity.Cart;
import com.topic3.topic3.repository.CartRepository;
import com.topic3.topic3.repository.Repository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by martin on 9/7/2018.
 */
@SpringBootTest
public class CRUDTest {

    private Repository cartRepository = CartRepository.getCarts();
    Cart cart;


    @Before
    public void loadData(){
        cart = new Cart(1);
    }

    @Test
    public void createEntity(){

        cartRepository.create(cart);
        Assert.assertEquals(cart, cartRepository.get(1));
        Assert.assertEquals(1, cartRepository.getAll().size());
    }

    @Test
    public void UpdateEntity(){
        cart.getProducts().clear();
        cartRepository.update(cart);
        cart = (Cart) cartRepository.get(1);
        Assert.assertEquals(0, cart.getProducts().size());
    }

    @Test
    public void deleteEntity(){
        cartRepository.delete(cart);
        Assert.assertEquals(null, cartRepository.get(1));
    }

}
