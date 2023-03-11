public class Siswa {
   
   private String nis;
   private String nama;

   public Siswa() {}

   public Siswa(String nis, String nama) {
      this.nis = nis;
      this.nama = nama;
   }

   public String getNis() {
      return nis;
   }

   public String getNama() {
      return nama;
   }

   public void setNis(String nis) {
      this.nis = nis;
   }

   public void setNama(String nama) {
      this.nama = nama;
   }

   @Override
   public String toString() {
      return String.format("%s, %s", this.nis, this.nama);
   }

}
