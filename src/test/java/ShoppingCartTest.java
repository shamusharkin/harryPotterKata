import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ShoppingCartTest {

    private  ShoppingCart sc;

    @Before
    public void setUp() {
        sc = new ShoppingCart();
    }
    @Test
    public void testOneItem() {
        BigDecimal eight = new BigDecimal(8);
        sc.addItem(1, 1);  // id , qty
        assertEquals(eight, sc.cost());
    }
}
