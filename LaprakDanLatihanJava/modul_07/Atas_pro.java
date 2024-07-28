package modul_07;
//membuat sebuah kelas bernama kelas pro sebagai induk kelas
public class Atas_pro {

//kelas ini memiliki satu atribut bertipe integer dan memiliki nilai default = 5
//akses modifier atau ruang akses dari kelas ini adlaah protected 
//yang dimana bisa di akses oleh kelas ini sendiri dan kelas turunannya
    protected int a =5;

    Atas_pro(){//membuat konstruktor biasa 

    };
    public void cetak11(){//membuat method yang mencetak nilai atribut dan sedikit pernyataan 
        System.out.println("ADA DI KELAS ATAS");
        System.out.println("a = "+a);
    }
    
}
