package code02;

import java.util.concurrent.CountDownLatch;

public class Sample {
    
    public static void main(String[] args) {
        
        ArrayList list = new ArrayList();

        // add data 
        for (int i = 1; i <= 15; i++) {
            System.out.println("add item: " + i + " to list.");
            list.add((i));
            System.out.println("list items: " + list);
            System.out.println("count: " + list.getCount());
            System.out.println("capacity: " + list.getCapacity());
            System.out.println("isEmpty ? " + list.isEmpty());
            System.out.println("isFull ? " + list.isFull());
            System.out.println();
        }
        // clear all list item
        list.clear();
        System.out.println("list items: " + list);
        System.out.println("count: " + list.getCount());
        System.out.println("capacity: " + list.getCapacity());
        System.out.println("isEmpty ? " + list.isEmpty());
        System.out.println("isFull ? " + list.isFull());
        System.out.println();
        
        System.out.println("done.");
    }
}

class ArrayList {

    private int[] arr;
    private int count;
    private int capacity;

    private final int INITIAL_CAPACITY = 10;

    public ArrayList() { // constructor
        capacity = INITIAL_CAPACITY;
        arr = new int[capacity];
        count = 0;
    }

    public int getCount() { return count; }
    public int length() { return count; }
    public int getCapacity() { return capacity; }

    public boolean isEmpty() { return count == 0; }
    public boolean isFull() { return count == capacity; } 

    private void growArray() {
        int[] newArr = new int[capacity + INITIAL_CAPACITY];
        for (int i = 0; i < arr.length; i++)
            newArr[i] = arr[i];
        capacity += INITIAL_CAPACITY;
        arr = newArr;
    }

    public void add(int item) {
        if (count == capacity) 
            growArray();
        if (count < capacity) {
            arr[count] = item;
            count = count + 1;
        }
    }

    public void insert(int index, int item) {}

    public int getItem(int index) { return -1; }
    public void setItem(int index, int item) {}

    public boolean findFirst(int item) { return false; }
    public boolean findLast(int item) { return false; }
    public int findIndex(int item) { return -1; } 

    public boolean removeFirst(int item) { return false; }
    public boolean removeLast(int item) { return false; }
    public boolean removeAll(int item) { return false; }

    public void clear() {
        count = 0;
    }

    @Override
    public String toString() {
        if (count == 0) 
            return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            if (i == 0) {
                sb.append(String.format("%d", arr[i]));
            }
            else {
                sb.append(String.format(", %d", arr[i]));
            }
        }
        return sb.toString();
    }
}