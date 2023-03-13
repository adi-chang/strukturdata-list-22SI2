package Tugas02;

import java.io.IOException;

public class Sample {

    // READONLY - ISI MAIN FUNCTION INI JANGAN DIUBAH-UBAH
    public static void main(String[] args) throws InterruptedException, IOException {

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  

        System.out.println("Tugas - SinglyLinkedList");
        System.out.println("------------------------");
        System.out.println();

        SingleLinkedList list = new SingleLinkedList();

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

    // berfungsi untuk melakukan pengecekan apakah index valid atau tidak
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

    // operasi untuk mengambil elemen data pada posisi index, 
    // index harus valid, 
    // jika tidak valid, return -1
    public int getItem(int index) { return -1; }
    
    // operasi untuk mengubah elemen data pada posisi index menjadi item data baru, 
    // index harus valid, 
    // jika tidak valid, do nothing     
    public void setItem(int index, int item) {}

    // operasi untuk menemukan index dari item, 
    // pencarian dilakukan dari index terkecil sampe index terbesar 
    // jika item ditemukan, return true
    // jika item tidak ditemukan, return false
    public boolean findFirst(int item) { return false; }
    
    // operasi untuk menemukan index dari sebuah item data,
    // pencarian dilakukan dari index terkecil ke index terbesar
    //jika item ditemukan, return nilai index posisi item data
    // jika tidak ditemukan, return -1
    public int findIndex(int item) { return -1; } 
    
    // operasi untuk menemukan index paling akhir (paling besar) dari sebuah item data,
    // jika item ditemukan, return nilai index posisi terbesar dari item data 
    // jika tidak ditemukan, return -1
    public int findLastIndex(int item) { return -1; } 

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
    public boolean removeFirst(int item) { return false; }
    
    // operasi untuk menghapus elemen item data yang terakhir sekali ditemukan (item dengan posisi index paling besar)
    // jika berhasil melakukan penghapusan, return true
    // jika gagal atau item tidak ditemukan, return false
    public boolean removeLast(int item) { return false; }

    // operasi untuk menghapus semua elemen item data yang ditemukan pada list 
    // return true jika ada elemen data yang berhasil diremove
    // sebaliknya, return false jika tidak ada elemen data yang berhasil diremove atau elemen data tidak ditemukan
    public boolean removeAll(int item) { return false; }

    public void clear() {
        head = tail = null;
        count = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!isEmpty()) {
            Node p = head;
            boolean first = true;
            while (p != null) {
                if (first) {
                    sb.append(p.getItem());
                    first = false;
                }
                else 
                    sb.append(", " + p.getItem());
                p = p.getNext();
            }
        }
        return sb.toString();
    } 

}


