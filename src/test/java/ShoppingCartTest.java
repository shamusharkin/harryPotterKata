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
    public void testZeroItem() {
        BigDecimal zero = new BigDecimal("0.00");
        assertEquals(zero, sc.cost());
    }

    @Test
    public void OneItem() {
        BigDecimal eight = new BigDecimal("8.00");
        sc.addItem(1, 1);
        assertEquals(eight, sc.cost());
    }
    @Test
    public void TwoItemsSameBook() {
        BigDecimal sixteen = new BigDecimal("16.00");
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
        BigDecimal twentyOnePoint6 = new BigDecimal("21.60");
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
    @Test
    public void fivePercentDiscountOn2BooksOnly() {
        BigDecimal fixteenPoint2 = new BigDecimal("23.20");
        sc.addItem(1, 1);
        sc.addItem(2, 2);
        assertEquals(fixteenPoint2, sc.cost());
    }
    @Test
    public void lotsOfItems() {
        BigDecimal fixteenPoint2 = new BigDecimal("51.60");
        sc.addItem(1, 2);
        sc.addItem(2, 2);
        sc.addItem(3, 2);
        sc.addItem(4, 1);
        sc.addItem(5, 1);
        assertEquals(fixteenPoint2, sc.cost());
    }

    @Test
    public void sixitems() {
        BigDecimal fixteenPoint2 = new BigDecimal("48.00");
        sc.addItem(1, 6);

        assertEquals(fixteenPoint2, sc.cost());
    }


    @Test
    public void Testfrominternet() {
        BigDecimal fixteenPoint2 = new BigDecimal("91.20");
        sc.addItem(1, 1);
        sc.addItem(1, 1);
        sc.addItem(1, 1);
        sc.addItem(1, 1);
        sc.addItem(1, 1);
        sc.addItem(1, 1);
        sc.addItem(2, 6);
        assertEquals(fixteenPoint2, sc.cost());
    }

}
