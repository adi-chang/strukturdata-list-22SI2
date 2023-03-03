package code02;

public class Sample {
    
    public static void main(String[] args) {
        
        ArrayList list = new ArrayList();

        // sample code to show operation on ArrayList 

    }
}

class ArrayList {

    private int[] arr;
    private int count;
    private int capacity;

    private final int INITIAL_CAPACITY = 10;

    public ArrayList() {
        
    }

    public int getCount() { return -1; }
    public int length() { return -1; }
    public int getCapacity() { return -1; }

    public boolean isEmpty() { return false; }
    public boolean isFull() { return false; } 

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