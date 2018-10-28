import org.junit.Assert;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

//Linked Lists
//        *
//        * - create linked list with 1 item (head)
//        * - having an empty list
//        *   - should be able to add an item
//        *   - should throw an error when trying to remove first item
//        * - having a list with an item
//        *   - hasItem returns true if the list has that item
//        *   - hasItem returns false if the list doesn't have that item
//        *   - should be able to add an item to an existing list
//        *   - should be able to add multiple items to the list
//        *   - should be able to insert an item at the beginning
//        * - having a list with multiple items
//        *   - hasItem returns true if the list has an item
//        *   - hasItem returns false if the list doesn't have an item
//        *   - remove first item from the list by value
//        *   - remove an item from the list by value
//        *   - should throw error when trying to remove an item that doesn't exist
//        *   - remove first item of the list
//        *   - get the nth-to-last element of the list
//        *
public class LinkedListTest {
    @Test
    public void testSize_linkedListWithOneItem(){
        LinkedList list = new LinkedList();
        list.add("a");
        assertEquals(1, list.size());
    }

    @Test
    public void testSize_linkedListWithTwoItems(){
        LinkedList list = new LinkedList();
        list.add("a");
        list.add("b");
        assertEquals(2, list.size());
    }

    @Test
    public void testSize_linkedListWithTwoItems_removeItem(){
        LinkedList list = new LinkedList();
        list.add("a");
        list.add("b");
        assertEquals(2, list.size());

        list.remove(0);
        assertEquals(1, list.size());
    }

    @Test
    public void testRemove_removeIsCalledWithNoItemsInList(){
        LinkedList list = new LinkedList();

        list.remove(0);
        assertEquals(0, list.size());
    }

    @Test
    public void testGetItem_usingIndex(){
        LinkedList list = new LinkedList();

        list.add("abcd");
        list.add("efg");
        list.add("hijk");
        String result = list.getItem(2);
        System.out.println("result"+ result);
        assertEquals("hijk", result);
    }

    @Test
    public void testRemoveItem_usingIndex(){
        LinkedList list = new LinkedList();

        list.add("abcd");
        list.add("efg");
        list.add("hijk");
        String result = list.getItem(2);
        assertEquals("hijk", result);
        list.remove(1);
        String result1 = list.getItem(1);
        assertEquals("hijk", result1);
    }

    @Test
    public void testHasItem_usingItam(){
        LinkedList list = new LinkedList();

        list.add("abcd");
        list.add("efg");
        list.add("hijk");

        assertEquals(true, list.hasItem("hijk"));

    }

}
