import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class QueueTests {

    @Test
    public void testEnqueueAndSize_addOneItemSizeReturnsOne(){
        MyQueue queue = new MyQueue();
        queue.enqueue("First In");
        int result = queue.size();
        assertEquals(result, 1);
    }

    @Test
    public void testEnqueueAndSize_addTwoItemSizeReturnsTwo(){
        MyQueue queue = new MyQueue();
        queue.enqueue("First In");
        queue.enqueue("Second");
        int result = queue.size();
        assertEquals(result, 2);
    }

    @Test
    public void testEnqueueAndPeek_addOneItemPeekReturnsItem(){
        MyQueue queue = new MyQueue();
        queue.enqueue("First In");
        String result = queue.peek();
        assertEquals("First In", result);
    }

    @Test
    public void testEnqueueDequeueAndPeek_addTwoItemsDequeueOnePeekReturnsItemAtFrontOfQueue(){
        MyQueue queue = new MyQueue();
        queue.enqueue("First In");
        queue.enqueue("Second");
        queue.dequeue();
        String result = queue.peek();
        assertEquals("Second", result);
    }

    @Test
    public void testEnqueueDequeueAndPeek_enqueueAndDequeueLotsOfItems(){
        MyQueue queue = new MyQueue();
        queue.enqueue("First In");
        queue.enqueue("Second");
        queue.enqueue("Third");
        queue.dequeue();
        queue.enqueue("Fourth");
        queue.enqueue("Fifth");
        queue.enqueue("Sixth");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        String result = queue.peek();
        assertEquals("Fifth", result);
        assertEquals(2, queue.size());
    }

    @Test
    public void testEnqueue_enqueueMoreThan10Items(){
        MyQueue queue = new MyQueue();
        queue.enqueue("First In");
        queue.enqueue("Second");
        queue.enqueue("Third");
        queue.enqueue("Fourth");
        queue.enqueue("Fifth");
        queue.enqueue("Sixth");
        queue.enqueue("7");
        queue.enqueue("8");
        queue.enqueue("9");
        queue.enqueue("10");
        queue.enqueue("11");

        String result = queue.peek();
        assertEquals("First In", result);
        assertEquals(10, queue.size());
    }

    @Test
    public void testDequeue_denqueueWhenNoItemsInQueue(){
        MyQueue queue = new MyQueue();
        assertEquals(0, queue.size());
        queue.dequeue();
        assertEquals(0, queue.size());
    }

}
