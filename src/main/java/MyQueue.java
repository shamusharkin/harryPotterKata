public class MyQueue {
    private int size;
    private int back;
    private String[] myQueueArr;
    private int front;

    public MyQueue(){
        size = 0;
        front = 0;
        back = 0;
        myQueueArr = new String[10];
    }

    public void enqueue(String item) {
        if (size < 10){
            myQueueArr[back] = item;
            back++;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public String peek() {
        return myQueueArr[front];
    }

    public void dequeue() {
        if(size > 0) {
            front++;
            size--;
        }
    }
}
