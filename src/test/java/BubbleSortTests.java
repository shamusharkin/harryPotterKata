import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class BubbleSortTests {

    @Test
    public void testSort_arrayOfTwoNumbersInAscendingOrderReturnsSame(){
        int[] input = {1,2};
        assertEquals(input, BubbleSort.sort(input));
    }

    @Test
    public void testSort_arrayOfTwoNumbersInDescendingOrderReturnsArrayInAscendingOrder(){
        int[] input = {2,1};
        int[] result = {1,2};
        assertEquals(Arrays.toString(result), Arrays.toString(BubbleSort.sort(input)));
    }

    @Test
    public void testSort_BigArrayOfNumbersInAnyOrderReturnsArrayInAscendingOrder(){
        int[] input = {10,9,8,7,6,5,4,3,2,1};
        int[] result = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(Arrays.toString(result), Arrays.toString(BubbleSort.sort(input)));
    }

    @Test
    public void testSort_RandomNumbers(){
        int[] input = {10,8,3,9,7,6,5,4,2,1};
        int[] result = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(Arrays.toString(result), Arrays.toString(BubbleSort.sort(input)));
    }

    @Test
    public void testSort_RandomNumbersWithFlagForAscending(){
        int[] input = {10,8,3,9,7,6,5,4,2,1};
        int[] result = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(Arrays.toString(result), Arrays.toString(BubbleSort.sort(input, 'a')));
    }

    @Test
    public void testSort_RandomNumbersWithFlagForDescending(){
        int[] input = {10,8,3,9,7,6,5,4,2,1};
        int[] result = {10,9,8,7,6,5,4,3,2,1};
        assertEquals(Arrays.toString(result), Arrays.toString(BubbleSort.sort(input, 'd')));
    }
}
