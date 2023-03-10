package Tugas01;

import java.io.IOException;

public class Sample {
    
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

    // operasi untuk melakukan add item data baru. (sisip belakang)
    public void add(int item) {
        if (count == capacity) 
            growArray();
        if (count < capacity) {
            arr[count++] = item;
        }
    }

    // berfungsi untuk melakukan operasi insert item pada index tertentu
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

    // berfungsi untuk melakukan pengecekan apakah index valid atau tidak
    private boolean indexIsValid(int index) {
        return index >= 0 && index < count;
    }

    // operasi untuk mengambil elemen data pada posisi index, 
    // index harus valid, 
    // jika tidak valid, return -1
    public int getItem(int index) { 
        // change with your code
        return -1;
    }

    // operasi untuk mengubah elemen data pada posisi index menjadi item data baru, 
    // index harus valid, 
    // jika tidak valid, do nothing 
    public void setItem(int index, int item) {
        // change with your code
    }

    // operasi untuk menemukan index dari item, 
    // pencarian dilakukan dari index terkecil sampe index terbesar 
    // jika item ditemukan, return true
    // jika item tidak ditemukan, return false
    public boolean findFirst(int item) { 
        // change with your code
        return false;
    }

    // operasi untuk menemukan index dari sebuah item data,
    // pencarian dilakukan dari index terkecil ke index terbesar
    //jika item ditemukan, return nilai index posisi item data
    // jika tidak ditemukan, return -1
    public int findIndex(int item) {
        // change with your code
        return -1; 
    } 

    // operasi untuk menemukan index paling akhir (paling besar) dari sebuah item data,
    // jika item ditemukan, return nilai index posisi terbesar dari item data 
    // jika tidak ditemukan, return -1
    public int findLastIndex(int item) {
        // change with your code
        return -1;
    }

    // operasi untuk menghapus item data pada posisi index
    // posisi index harus valid,
    // jika valid, remove item datanya, then return true 
    // jika tidak valid, return false
    public boolean removeAt(int index) {
        // change with your code
        return false;
    }

    // operasi untuk menghapus elemen item data yang pertama sekali ditemukan (item dengan posisi index paling kecil) 
    // jika berhasil melakukan penghapusan, return true
    // jika gagal atau item tidak ditemukan, return false
    public boolean removeFirst(int item) {
        // change with your code
        return false;
    }

    // operasi untuk menghapus elemen item data yang terakhir sekali ditemukan (item dengan posisi index paling besar)
    // jika berhasil melakukan penghapusan, return true
    // jika gagal atau item tidak ditemukan, return false
    public boolean removeLast(int item) {
        // change with your code
        return false;
    }

    // operasi untuk menghapus semua elemen item data yang ditemukan pada list 
    // return true jika ada elemen data yang berhasil diremove
    // sebaliknya, return false jika tidak ada elemen data yang berhasil diremove atau elemen data tidak ditemukan
    public boolean removeAll(int item) {
        // change with your code
        return false;
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