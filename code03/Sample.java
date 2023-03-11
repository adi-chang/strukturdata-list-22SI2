package code03;

public class Sample {
        
    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();

        System.out.println("list is empty ? " + list.isEmpty());
        System.out.println("list count ? " + list.getCount());

        for ( int i = 1 ; i <= 5 ; i++ ) {
            list.add(i);
        }

        list.insert(0, 8);
        list.insert(3, 9);
        list.insert(5, 7);

        System.out.println("after add: list items: " + list);

    }
}


class Node {
    
    // atribut    
    private int item;
    private Node next;
    
    // constructor 
    public Node(int item) {
        this.item = item;
        this.next = null;
    }

    // getter - method
    public int getItem() {
       return item;
    }

    public Node getNext() {
       return next;
    }

    // setter - method
    public void setItem(int item) {
    this.item = item;
    }

    public void setNext(Node next) {
       this.next = next;
    }

    @Override
    public String toString() {
        return String.format("%d", this.item);
    }

}

class SingleLinkedList {
    
    // atribut
    private Node head;
    private Node tail;
    private int count;

    // constructor - inisialisasi - (set nilai awal)
    public SingleLinkedList() {
        head = null;
        tail = null;
        count = 0;
    }

    public int getCount() { return count; }

    public int length() { return count; }

    public boolean isEmpty() { return count == 0; }

    public void add(int item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } 
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
        count++;
    }

    private boolean indexIsValid(int index) {
        return (index >= 0 && index < count);
    }

    public void insert(int index, int item) {
        if (indexIsValid(index)) {
            if (isEmpty()) {
                add(item);
            }
            else {
                Node newNode = new Node(item);
                if (index == 0) {
                    newNode.setNext(head);
                    head = newNode;
                }
                else {
                    Node p = head;
                    int idx = 0;
                    while (idx < index-1) {
                        p = p.getNext();
                        idx++;
                    }
                    newNode.setNext(p.getNext());
                    p.setNext(newNode);
                } 
                count++;
            }
        }
    }

    public int getItem(int index) { return -1; }
    public void setItem(int index, int item) {}

    public boolean findFirst(int item) { return false; }
    public int findIndex(int item) { return -1; } 
    public int findLastIndex(int item) { return -1; } 

    public boolean removeFirst(int item) { return false; }
    public boolean removeLast(int item) { return false; }
    public boolean removeAll(int item) { return false; }

    public void clear() {}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!isEmpty()) {
            Node p = head;
            while (p != null) {
                sb.append(p.getItem() + " ");
                p = p.getNext();
            }
        }
        return sb.toString();
    } 

}


