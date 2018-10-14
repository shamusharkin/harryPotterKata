import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<Integer> booklist;
    private static final List<String> HARRY_POTTER_BOOKS = new ArrayList<>();
    static {
        HARRY_POTTER_BOOKS.add("Book1");HARRY_POTTER_BOOKS.add("Book2");HARRY_POTTER_BOOKS.add("Book3");
        HARRY_POTTER_BOOKS.add("Book4");HARRY_POTTER_BOOKS.add("Book5");
    }

    public Books() { booklist = new ArrayList<>(); }

    public void add(String book) throws Exception {
        if(HARRY_POTTER_BOOKS.contains(book)) {
            try { booklist.set(HARRY_POTTER_BOOKS.indexOf(book), booklist.get(HARRY_POTTER_BOOKS.indexOf(book)) + 1); }
            catch (IndexOutOfBoundsException e) { booklist.add(HARRY_POTTER_BOOKS.indexOf(book), 1); }
        } else throw new Exception(book + " is not a Harry Potter Book");
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        while(booklist.size() > 0) {
            List<Integer> finalBooks = removeZeroCountBooks(booklist);
            double discountPercent = getDiscount(finalBooks.size());
            decrementBookCounts(finalBooks);
            totalPrice += calculateTotalPrice(finalBooks.size(), discountPercent);
        }return totalPrice;
    }

    private void decrementBookCounts(List<Integer> books) {
        for (int i=0; i<books.size(); i++){
            if(booklist.get(i) > 0) booklist.set(i,books.get(i) -1);
        }
    }

    private double calculateTotalPrice(int numBooks, double discount){
        return (8 * numBooks) * discount;
    }

    private List<Integer> removeZeroCountBooks(List<Integer> books) {
        int size = books.size();
        while (size > 0) {
            for (int i=0; i<books.size(); i++){
                if(books.get(i) == 0) {
                    books.remove(i);
                    break;
                }
            }size--;
        }return books;
    }

    private double getDiscount(int size) {
        if (size == 2) return .95;
        else if (size == 3) return .90;
        else if (size == 4) return .80;
        else if (size >= 5) return .75;
        else return 1;
    }
}
