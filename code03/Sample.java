package code03;

public class Sample {
        
    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();

        // sample code to show operation on ArrayList 

    }
}

class Node {
    private int item;
    private Node next;
    // ...
}

class SingleLinkedList {
    
    private Node head;
    private int count;

    public SingleLinkedList() {}

    public int getCount() { return -1; }

    public int length() { return -1; }

    public boolean isEmpty() { return false; }

    public void add(int item) {}

    public void insert(int index, int item) {}

    public int getItem(int index) { return -1; }
    public void setItem(int index, int item) {}

    public boolean findFirst(int item) { return false; }
    public boolean findLast(int item) { return false; }
    public int findIndex(int item) { return -1; } 

    public boolean removeFirst(int item) { return false; }
    public boolean removeLast(int item) { return false; }
    public boolean removeAll(int item) { return false; }

    public void clear() {}

    @Override
    public String toString() {
        return "";
    } 

}


