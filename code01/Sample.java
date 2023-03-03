// demo value type vs classes as reference type

package code01;

public class Sample {
    
    public static void main(String[] args) {

        // value type 

        int nilai_1 = 10;

        int nilai_2 = nilai_1; 

        System.out.println("Nilai 1 : " + nilai_1);
        System.out.println("Nilai 2 : " + nilai_2);

        // tukar nilai pada variable nilai_2

        nilai_2 = 100;

        // berapa nilai pada variable nilai_1 ? apakah ikut berubah ? 

        System.out.println("Nilai 1 : " + nilai_1);
        System.out.println("Nilai 2 : " + nilai_2);

        // menggunakan reference type

        Nilai n1 = new Nilai(10);
        Nilai n2 = n1;

        // apa nilai n1 dan n2 ? 
        System.out.println("Nilai 1 : " + n1);
        System.out.println("Nilai 2 : " + n2);

        // change nilai n2 

        n2.setValue(100);

        // berapa nilai n1 dan n2 sekarang ? 

        System.out.println("Nilai 1 : " + n1);
        System.out.println("Nilai 2 : " + n2);

        System.out.println("object n1:");
        n1.info();
    }
}


// create class Nilai
class Nilai {

    // data
    private int value;

    // constructor
    public Nilai() { this.value = 0; }
    public Nilai(int value) { this.value = value; }
    
    // setter
    public void setValue(int newValue) { this.value = newValue; }
    
    // getter
    public int getValue() { return this.value; }    
    
    // method (override)
    @Override
    public String toString() {
        return String.format("%s", value);
    }

    // method
    public void info() {
        System.out.println("Value : " + value);
    }
}