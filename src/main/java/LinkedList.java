public class LinkedList {

    private int size = 0;
    private MyNode firstNode = new MyNode();

    private class MyNode {
        private final String item;
        private MyNode refToNextNode;

        public MyNode() {
            this.item = "";
            this.refToNextNode = null;
        }

        public MyNode(String item) {
            this.item = item;
            refToNextNode = null;
        }
        public void print(){
            System.out.println("Inside Inner Class");
        }
    }

    public boolean hasItem(String item) {
        MyNode temp = firstNode;
        while(temp.refToNextNode != null) {
            if(temp.item == item) return true;
            temp = temp.refToNextNode;
        }
        if(temp.item == item) return true;
        return false;
    }


    public void add(String item) {
        MyNode temp = firstNode;
        while (temp.refToNextNode != null) {
            temp = temp.refToNextNode;
        }
        MyNode newNode = new MyNode(item);
        temp.refToNextNode = newNode;

        size++;
    }

    public int size() {
        return size;
    }


    public void remove(int index) {
        MyNode deletedNode = firstNode;
        int count = 0;
        while(count <= index){
            deletedNode = deletedNode.refToNextNode;
            count++;
        }
        MyNode temp = firstNode;
        while(count-1 > 0) {
            temp = temp.refToNextNode;
            count--;
        }
        temp.refToNextNode = deletedNode.refToNextNode;

        if(size > 0) size--;
    }

    public String getItem(int index) {
        MyNode temp = firstNode;
        int count = 0;
        while (count <= index) {
            temp = temp.refToNextNode;
            count++;
        }
        return temp.item;
    }


}
