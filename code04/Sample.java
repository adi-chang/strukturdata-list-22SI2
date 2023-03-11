import java.util.Scanner;

public class Sample {

   public static void main(String[] args) {
      
      SingleLinkedList list = new SingleLinkedList();

      list.add(new Siswa("0001", "Budi"));
      list.add(new Siswa("0002", "Gunawan"));
      list.add(new Siswa("0003", "Susan"));
      list.add(new Siswa("0004", "Jeslyn"));
      list.add(new Siswa("0005", "Susanna"));
      list.add(new Siswa("0006", "Wati"));
      list.add(new Siswa("0007", "Robert"));
      list.add(new Siswa("0008", "Chandra"));
      list.add(new Siswa("0009", "Jeni"));
      list.add(new Siswa("0010", "Rina"));

      System.out.println("Daftar Registrasi Siswa:");
      System.out.println(list);
      System.out.println();

      Scanner sc = new Scanner(System.in);

      System.out.println("Search item By NIS");
      System.out.println();

      System.out.print("NIS ? ");
      String nis = sc.nextLine();

      if (list.searchByNIS(nis)) {
         System.out.println("Siswa dengan NIS: " + nis + " ditemukan dalam list.");
      }
      else {
         System.out.println("Siswa dengan NIS: " + nis + " tidak ditemukan dalam list.");
      }
      System.out.println();

      System.out.println("Search item By Nama");
      System.out.println();

      System.out.print("Nama ? ");
      String nama = sc.nextLine();

      if (list.searchByNama(nama)) {
         System.out.println("Siswa dengan nama: " + nama + " ditemukan dalam list.");
      }
      else {
         System.out.println("Siswa dengan nama: " + nama + " tidak ditemukan dalam list.");
      }
      System.out.println();

      System.out.println("Find item By NIS");
      System.out.println();

      System.out.print("NIS ? ");
      nis = sc.nextLine();

      Siswa itemSiswa = list.findSiswa(nis);

      if (itemSiswa != null) {
         System.out.println("Info siswa: " + itemSiswa);
      }
      else {
         System.out.println("Siswa dengan NIS: " + nis + " tidak ditemukan dalam list.");
      }
      System.out.println();

      sc.close();


      System.out.println("List data siswa:");
      System.out.println("----------------");
      for (Siswa item : list.getAllData()) {
         System.out.println(String.format("%s\t%s", item.getNis(), item.getNama()));
      }
      System.out.println();


   }

}