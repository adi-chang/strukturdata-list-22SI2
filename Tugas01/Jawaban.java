package Tugas01;

import java.io.IOException;

public class Jawaban {
    
    // READONLY - ISI MAIN FUNCTION INI JANGAN DIUBAH-UBAH
    public static void main(String[] args) throws InterruptedException, IOException {

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  

        System.out.println("Tugas - ArrayList");
        System.out.println("-----------------");
        System.out.println();

        ArrayList list = new ArrayList();

        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        for (int i = 10; i >= 5; i--) {
            list.add(i);
        }
        System.out.println("add items and print it");
        System.out.println("----------------------");
        System.out.println("list items: " + list);
        System.out.println("count list items: " + list.getCount());
        System.out.println("list capacity: " + list.getCapacity());
        System.out.println();

        System.out.println("sample get item at index 1, 3, 5");
        System.out.println("--------------------------------");
        // get item at index 1, 3, 5
        System.out.println("item at index-1: " + list.getItem(1));
        System.out.println("item at index-3: " + list.getItem(3));
        System.out.println("item at index-5: " + list.getItem(5));
        System.out.println();

        System.out.println("sample set item");
        System.out.println("---------------");
        // set item at index 0 => 5
        System.out.println("set item at index-0 => 5");
        list.setItem(0, 5);
        System.out.println();

        // after set item at index 0 => 5
        System.out.println("after set item at index-0 => 5");
        System.out.println("list items: " + list);
        System.out.println();

        System.out.println("sample findFirst");
        System.out.println("----------------");
        // cari item 2 ada tidak dalam list ? 
        int x = 2;

        if (list.findFirst(x)) {
            System.out.println("item: " + x + " ditemukan dalam list");
        }
        else {
            System.out.println("item: " + x + " tidak ditemukan dalam list");
        }

        // cari item 9 ada tidak di dalam list ? 
        x = 13;

        if (list.findFirst(x)) {
            System.out.println("item: " + x + " ditemukan dalam list");
        }
        else {
            System.out.println("item: " + x + " tidak ditemukan dalam list");
        }
        System.out.println();

        System.out.println("sample findIndex");
        System.out.println("----------------");

        // mencari index dari item: 15
        int index;
        x = 15;
        
        index = list.findIndex(x);
        if (index >= 0) {
            System.out.println("item: " + x + " ditemukan pada index: " + index);
        }
        else {
            System.out.println("item: " + x + " tidak ditemukan dalam list");
        }

        // mencari index dari item: 7
        x = 7;

        index = list.findIndex(x);
        if (index >= 0) {
            System.out.println("item: " + x + " ditemukan pada index: " + index);
        }
        else {
            System.out.println("item: " + x + " tidak ditemukan dalam list");
        }
        System.out.println();

        System.out.println("sample findLastIndex");
        System.out.println("--------------------");

        // mencari index dari item: 15
        x = 15;
        
        index = list.findLastIndex(x);
        if (index >= 0) {
            System.out.println("item: " + x + " ditemukan pada index: " + index);
        }
        else {
            System.out.println("item: " + x + " tidak ditemukan dalam list");
        }

        // mencari index dari item: 7
        x = 5;

        index = list.findLastIndex(x);
        if (index >= 0) {
            System.out.println("item: " + x + " ditemukan pada index: " + index);
        }
        else {
            System.out.println("item: " + x + " tidak ditemukan dalam list");
        }
        System.out.println();

        System.out.println("sample removeAt");
        System.out.println("---------------");

        System.out.println("remove item at index: 3");
        index = 3;
        System.out.println("list item before remove item at index: 3");
        System.out.println("list items: " + list);
        System.out.println("count: " + list.getCount());
        if (list.removeAt(index)) {
            // after remove
            System.out.println("list item after remove item at index: 3");
            System.out.println("list items: " + list);
            System.out.println("count: " + list.getCount());
        }
        System.out.println();

        System.out.println("sample removeFirst");
        System.out.println("------------------");
        x = 2;
        System.out.println("removeFirst item = " + x);
        System.out.println("list item before removeFirst item: " + x);
        System.out.println("list items: " + list);
        System.out.println("count: " + list.getCount());
        if (list.removeFirst(x)) {
            // after remove
            System.out.println("list item after removeFirst item: " + x);
            System.out.println("list items: " + list);
            System.out.println("count: " + list.getCount());
        }
        System.out.println();

        System.out.println("sample removeLast");
        System.out.println("------------------");
        x = 6;
        System.out.println("removeLast item = " + x);
        System.out.println("list item before removeLast item: " + x);
        System.out.println("list items: " + list);
        System.out.println("count: " + list.getCount());
        if (list.removeLast(x)) {
            // after remove
            System.out.println("list item after removeLast item: " + x);
            System.out.println("list items: " + list);
            System.out.println("count: " + list.getCount());
        }
        System.out.println();

        System.out.println("sample removeAll");
        System.out.println("----------------");
        x = 5;
        System.out.println("removeAll item = " + x);
        System.out.println("list item before removeAll item: " + x);
        System.out.println("list items: " + list);
        System.out.println("count: " + list.getCount());
        if (list.removeAll(x)) {
            // after remove
            System.out.println("list item after removeAll item: " + x);
            System.out.println("list items: " + list);
            System.out.println("count: " + list.getCount());
        }
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

    public void insert(int index, int item) {
        if (count == capacity) growArray();
        if (count == 0 && index == 0) 
            add(item);
        else if (index >= 0 && index < count) {
            for (int i = count; i > index; i--) 
                arr[i] = arr[i-1];
            arr[index] = item;
            count++;
        }
    }

    private boolean indexIsValid(int index) {
        return index >= 0 && index < count;
    }


    public int getItem(int index) { 
        if (indexIsValid(index)) 
            return arr[index];
        return -1;
    }

    public void setItem(int index, int item) {
        if (indexIsValid(index)) {
            arr[index] = item;
        }
    }

    public boolean findFirst(int item) { 
        for (int x : arr) {
            if (x == item)
                return true;
        }
        return false;
    }

    public int findIndex(int item) {
        for (int i = 0 ; i < count ; i++) 
            if (arr[i] == item)
                return i;
        return -1; 
    } 

    public int findLastIndex(int item) {
        for (int i = count-1; i >= 0; i--)
            if (arr[i] == item)
                return i;
        return -1;
    }

    public boolean removeAt(int index) {
        if (indexIsValid(index)) {
            for (int i = index; i < count-1; i++)
                arr[i] = arr[i+1];
            count--;
            return true;
        }
        return false;
    }

    public boolean removeFirst(int item) {
        int idx = findIndex(item);
        if (idx >= 0) {
            boolean result = removeAt(idx);
            return result;
        }
        return false;
    }

    public boolean removeLast(int item) {
        int idx = findLastIndex(item);
        if (idx >= 0) {
            boolean result = removeAt(idx);
            return result;
        }
        return false;
    }

    public boolean removeAll(int item) {
        boolean adaDeleteItem = false;
        int idx = findIndex(item);
        
        while (idx >= 0) {
            boolean b = removeAt(idx);
            if (b) adaDeleteItem = true;
            idx = findIndex(item);
        }
        return adaDeleteItem;
    }
    
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