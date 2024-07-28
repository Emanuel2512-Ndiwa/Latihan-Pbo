package modul_07;
//membua kelas turunan dari kelas atas pub 
//cara membuat kelas turunan di java kita membuatuhkan kata kunci extends
public class Bawah_Pub extends Atas_Pub {
    public void cetak2(){//membuat method cetak2
        System.out.println("Ada Di kelas BAWAH...");
        System.out.println("i\t:"+i);
    }
    
}
