import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class HarryPotterBookTest2 {

    @Test
    public void bookIsNotAHarryPotterBookInOurListOfConstants()  {
        Books books = new Books();
        try {
            books.add("BookDoesNotExist");
        } catch (Exception e) {
            assertEquals(e.toString(), "java.lang.Exception: BookDoesNotExist is not a Harry Potter Book");
        }

    }

    @Test
    public void oneBookReturnsTotalPriceWithNoDiscount() throws Exception{
        Books books = new Books();
        books.add("Book1");
        double totalPrice = books.getTotalPrice();
        assertThat(totalPrice, equalTo(8.00));
    }

    @Test
    public void twoCopiesOfTheSameBookReturnsTotalPriceWithNoDiscount() throws Exception {

        Books books = new Books();
        books.add("Book1");
        books.add("Book1");
        double totalPrice = books.getTotalPrice();
        assertThat(totalPrice, equalTo(16.00));

    }

    @Test
    public void twoCopiesOfDifferentBooksReturnsTotalPriceWithFivePercentDiscount() throws Exception {

        Books books = new Books();
        books.add("Book1");
        books.add("Book2");
        double totalPrice = books.getTotalPrice();
        assertThat(totalPrice, equalTo(15.20));
    }

    @Test
    public void fiveCopiesOfDifferentBooksReturnsTotalPriceWithTwentyPercentDiscount() throws Exception {

        Books books = new Books();
        books.add("Book1");
        books.add("Book2");
        books.add("Book3");
        books.add("Book4");
        books.add("Book5");
        double totalPrice = books.getTotalPrice();

        assertThat(totalPrice, equalTo(30.00));
    }

    @Test
    public void fiveCopiesOfDifferentBooksPlusTwoTheSameReturnsTotalPriceWithTwentyPercentDiscountAndFullPriceForOneBook() throws Exception{

        Books books = new Books();
        books.add("Book1");
        books.add("Book2");
        books.add("Book3");
        books.add("Book4");
        books.add("Book5");
        books.add("Book1");
        books.add("Book2");
        books.add("Book3");
        double totalPrice = books.getTotalPrice();
        assertThat(totalPrice, equalTo(51.60));
    }

    @Test
    public void Testfrominternet() throws Exception {

        Books books = new Books();
        books.add("Book1");
        books.add("Book1");
        books.add("Book1");
        books.add("Book2");
        books.add("Book2");
        books.add("Book3");
        books.add("Book3");
        books.add("Book3");
        books.add("Book3");
        books.add("Book4");
        books.add("Book4");
        books.add("Book5");
        double totalPrice = books.getTotalPrice();
        assertThat(totalPrice, equalTo(78.80));
    }

    @Test
    public void anotherTestfrominternet() throws Exception {

        Books books = new Books();
        books.add("Book1");
        books.add("Book1");
        books.add("Book1");
        books.add("Book1");
        books.add("Book1");
        books.add("Book1");
        books.add("Book2");
        books.add("Book2");
        books.add("Book2");
        books.add("Book2");
        books.add("Book2");
        books.add("Book2");

        double totalPrice = books.getTotalPrice();

        assertThat(totalPrice, equalTo(91.20));
    }


}
