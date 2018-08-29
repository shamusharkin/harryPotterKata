import java.math.BigDecimal;

public class ShoppingCart {

    private final BigDecimal costOfBook= new BigDecimal(8);
    private int[] items = new int[5];
    private BigDecimal[] discountMultipliers =  {
                new BigDecimal("1"),
                new BigDecimal("1"),
                new BigDecimal(".95"),
                new BigDecimal(".90"),
                new BigDecimal(".80"),
                new BigDecimal(".75")
    };


    public void addItem(int itemId, int qty)
    {
        items[itemId-1] += qty;

    }
    public BigDecimal cost()
    {
        int distinctBooks = getDistinctBooks();
        return calcCost(discountMultipliers[distinctBooks]);

    }

    private int getDistinctBooks() {

        int distinctBooks =0 ;
        for (int i = 0; i <5 ; i++) {
            if (items[i] >0 )
            {
                distinctBooks++;
            }
        }
        return distinctBooks;
    }

    private BigDecimal calcCost(BigDecimal multiplier)
    {
        BigDecimal cost= new BigDecimal(0);
        for (int i = 0; i <5 ; i++) {
            BigDecimal costOfBooks = costOfBook.multiply(new BigDecimal(items[i])).multiply(multiplier);
            cost = cost.add( costOfBooks );
        }
        return cost;
    }
}
