package modul_06;
import java.util.ArrayList;
import java.util.List;

import Modul_02.*;

public class KumpulanSegitiga {
   private  int jumlahSegitiga;
   public KumpulanSegitiga(int jumlahSegitiga) {
      this.jumlahSegitiga = jumlahSegitiga;
      daftarSegitiga = new ArrayList<>();
   }

   private List<Segitiga> daftarSegitiga;
   
   public KumpulanSegitiga(int jumlahSegitiga, List<Segitiga> daftarSegitiga) {
      this.jumlahSegitiga = jumlahSegitiga;
      this.daftarSegitiga = daftarSegitiga;
   }
   public void tambahSegitiga (Segitiga segitiga){
      daftarSegitiga = new ArrayList<>();
      daftarSegitiga.add(segitiga);
   }
   public double hitungRatarata(){
      double luas =0;
      for (int i =0; i < daftarSegitiga.size();  i ++){
         luas += daftarSegitiga.get(i).hitungLuas();

      }
      return luas / jumlahSegitiga;
   }


   public Segitiga Terluas (){
      Segitiga terluas = daftarSegitiga.get(0);
      double luasLuas = daftarSegitiga.get(0).hitungLuas();
      for (int a =0; a < daftarSegitiga.size(); a++){
         double luuas = daftarSegitiga.get(a).hitungLuas();
         if (luuas > luasLuas ){
            luasLuas = luuas;
            terluas = daftarSegitiga.get(a);

         }
      }
      return terluas;
   }
   
   public Segitiga Terkecil (){
      Segitiga terkecil = daftarSegitiga.get(0);
      double luaskecil = daftarSegitiga.get(0).hitungLuas();
      for (int a =0; a < daftarSegitiga.size(); a++){
         double luuas = daftarSegitiga.get(a).hitungLuas();
         if (luuas < luaskecil ){
            luaskecil = luuas;
            terkecil= daftarSegitiga.get(a);
         }
      }
      return terkecil;
   }
   

}
