import java.math.BigDecimal;

public class ShoppingCart {

    private final BigDecimal costOfBook= new BigDecimal(8);
    private int[] items = new int[5];
    private int[] bookSets = new int[5];
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

        // create sets of books to be priced
        int highestSet = getHighestSet();
        while (highestSet > 0 )
        {
            // increment set count for set
            bookSets[highestSet-1]++;

            // mark books as processed for costing
            markBooksAsProcessed();

            highestSet = getHighestSet();
        }

        // now price he sets of books

        return calcCost();

    }

    void markBooksAsProcessed()
    {
        for (int i = 0; i <5 ; i++) {
            if (items[i] >0 )
            {
                items[i]--;
            }
        }
    }

    private int getHighestSet() {

        int highestSet =0 ;
        for (int i = 0; i <5 ; i++) {
            if (items[i] >0 )
            {
                highestSet++;
            }
        }
        return highestSet;
    }


    private BigDecimal calcCost()
    {
        BigDecimal cost= new BigDecimal(0);
        for (int i = 0; i <5 ; i++) {
            BigDecimal costOfBooks = costOfBook.multiply(new BigDecimal(bookSets[i])).multiply(new BigDecimal(i+1)).multiply( discountMultipliers[i+1]);
            cost = cost.add( costOfBooks );
        }
        return cost;
    }
}
