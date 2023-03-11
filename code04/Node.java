public class Node {
      
   private Siswa item;
   private Node next;

   public Node(Siswa item) {
      this.item = item;
      next = null;
   }

   public Siswa getItem() {
      return item;
   }

   public Node getNext() {
      return next;
   }

   public void setItem(Siswa item) {
      this.item = item;
   }

   public void setNext(Node next) {
      this.next = next;
   }

   @Override
   public String toString() {
      return this.item.toString();
   }

}
