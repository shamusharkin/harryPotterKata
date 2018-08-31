import java.math.BigDecimal;

public class ShoppingCart {

    private final BigDecimal costOfBook= new BigDecimal(8);
    private int[] items = new int[5];
    private int[] bookSets = new int[5];
    private BigDecimal[] discountMultipliers =  {
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

        // create copy of the items
        int[] itemsCopy = this.items.clone();
        // create sets of books to be priced
        int highestSet = getHighestSet(itemsCopy);
        while (highestSet > 0 )
        {
            // increment set count for set
            bookSets[highestSet-1]++;


            highestSet = getHighestSet(itemsCopy);
        }

        return calcCost();

    }

    private int getHighestSet(int[] items) {

        int highestSet =0 ;
        for (int i = 0; i <items.length ; i++) {
            if (items[i] >0 )
            {
                highestSet++;
                items[i]--;
            }
        }
        return highestSet;
    }

    private BigDecimal calcCost()
    {
        BigDecimal cost= new BigDecimal(0);
        for (int i = 0; i <bookSets.length ; i++) {
            BigDecimal costOfBooks = costOfBook.multiply(new BigDecimal(bookSets[i])).multiply(new BigDecimal(i+1)).multiply( discountMultipliers[i]);
            cost = cost.add( costOfBooks );
        }
        return cost;
    }
}
