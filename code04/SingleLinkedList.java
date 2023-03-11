public class SingleLinkedList {

   private Node head;
   private Node tail;
   private int count;

   public SingleLinkedList() {
      head = null;
      tail = null;
      count = 0;
   }

   public boolean isEmpty() {
      return count == 0;
   }

   public int getCount() {
      return count;
   }

   public void add(String nis, String nama) {
      Siswa siswa = new Siswa(nis, nama);
      Node node = new Node(siswa);
      if (isEmpty()) {
         head = node;
         tail = node;
      } else {
         tail.setNext(node);
         tail = node;
      }
      count++;
   }

   public void add(Siswa siswa) {
      Node node = new Node(siswa);
      if (isEmpty()) {
         head = node;
         tail = node;
      } else {
         tail.setNext(node);
         tail = node;
      }
      count++;
   }

   public boolean searchByNIS(String nis) {
      if (!isEmpty()) {
         Node p = head;
         while (p != null) {
            if (p.getItem().getNis().equalsIgnoreCase(nis)) return true;
            p = p.getNext();
         }
      }
      return false;
   }

   public boolean searchByNama(String nama) {
      if (!isEmpty()) {
         Node p = head;
         while (p != null) {
            if (p.getItem().getNama().equalsIgnoreCase(nama)) return true;
            p = p.getNext();
         }
      }
      return false;
   }

   public Siswa findSiswa(String nis) {
      Siswa siswa = null;
      if (!isEmpty()) {
         Node p = head;
         while (p != null) {
            if (p.getItem().getNis().equalsIgnoreCase(nis)) {
               siswa = p.getItem();
               break;
            }
            p = p.getNext();
         }
      }
      return siswa;
   }

   public Node getHead() {
      return head;
   }

   public Node getTail() {
      return tail;
   }

   public Siswa getFirstItem() {
      if (!isEmpty())
         return head.getItem();
      return null;
   }

   public Siswa getLastItem() {
      if (!isEmpty())
         return tail.getItem();
      return null;
   }

   public Siswa[] getAllData() {
      if (!isEmpty()) {
         Siswa[] arr = new Siswa[count];
         int idx = 0;
         Node p = head;
         while (p != null) {
            arr[idx++] = p.getItem();
            p = p.getNext();
         }
         return arr;
      }
      return null;
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      if (!isEmpty()) {
         int idx = 1;
         Node p = head;
         while (p != null) {
            sb.append(String.format("%2d. %s\n", idx++, p.getItem()));
            p = p.getNext();
         }
      }
      return sb.toString();
   }

}
