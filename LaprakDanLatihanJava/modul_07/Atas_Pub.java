package modul_07;
//di sini kita membuat sebuah kelas bernama atas pub yang bertujuan untuk mengimplentasikan acses modifier public 
//pada inheritens
//di kelas ini memiliki sebuah atribut yang bertipe integer dan memiliki acses modifiernya public
//ruang lingkup aksesnya bisa di akses di kelas manapun
public class Atas_Pub {
    public int i = 5;

    public Atas_Pub() {//konstruktor dari kelas atas
        
    }
    public void cetak1(){//membuat method cetak1
        System.out.println("Ada Di kelas ATAS..");
        System.out.println("i\t:"+i);

    }
    
}
