import java.math.BigDecimal;

public class ShoppingCart {

    private final BigDecimal costOfBook= new BigDecimal(8);
    private int items[] = new int[5];
    public void addItem(int itemId, int qty)
    {
        items[itemId-1] += qty;

    }
    public BigDecimal cost()
    {
        int distinctBooks=0;
        for (int i = 0; i <5 ; i++) {
            if (items[i] >0 )
            {
                distinctBooks++;
            }
        }

        if (distinctBooks == 1)
        {
            return calcCost("1"); //no discount
        }
        if (distinctBooks == 2)
        {
            return calcCost(".95");
        }
        if (distinctBooks == 3)
        {
            return calcCost(".9");
        }
        if (distinctBooks == 4)
        {
            return calcCost(".80");
        }
        if (distinctBooks == 5)
        {
            return calcCost(".75");
        }

        return BigDecimal.ZERO;
    }

    private BigDecimal calcCost(String multiplier)
    {
        BigDecimal cost= new BigDecimal(0);
        for (int i = 0; i <5 ; i++) {
            BigDecimal costOfBooks = costOfBook.multiply(new BigDecimal(items[i])).multiply(new BigDecimal(multiplier));
            cost = cost.add( costOfBooks );
        }
        return cost;
    }
}
