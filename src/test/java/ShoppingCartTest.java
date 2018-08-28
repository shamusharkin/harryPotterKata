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
        BigDecimal eight = new BigDecimal("8");
        sc.addItem(1, 1);
        assertEquals(eight, sc.cost());
    }
    @Test
    public void testTwoItemsSameBook() {
        BigDecimal sixteen = new BigDecimal("16");
        sc.addItem(1, 1);
        sc.addItem(1, 1);
        assertEquals(sixteen, sc.cost());
    }

    @Test
    public void fivePercentDiscount() {
        BigDecimal fixteenPoint2 = new BigDecimal("15.20");
        sc.addItem(1, 1);
        sc.addItem(2, 1);
        assertEquals(fixteenPoint2, sc.cost());
    }
    @Test
    public void tenPercentDiscount() {
        BigDecimal twentyOnePoint6 = new BigDecimal("21.6");
        sc.addItem(1, 1);
        sc.addItem(2, 1);
        sc.addItem(3, 1);
        assertEquals(twentyOnePoint6, sc.cost());
    }
    @Test
    public void twentyPercentDiscount() {
        BigDecimal twentyFivePoint6 = new BigDecimal("25.60");
        sc.addItem(1, 1);
        sc.addItem(2, 1);
        sc.addItem(3, 1);
        sc.addItem(4, 1);
        assertEquals(twentyFivePoint6, sc.cost());
    }


    @Test
    public void twentyFivePercentDiscount() {
        BigDecimal thirty = new BigDecimal("30.00");
        sc.addItem(1, 1);
        sc.addItem(2, 1);
        sc.addItem(3, 1);
        sc.addItem(4, 1);
        sc.addItem(5, 1);
        assertEquals(thirty, sc.cost());
    }
}
