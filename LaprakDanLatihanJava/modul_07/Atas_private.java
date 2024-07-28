package modul_07;
//penggalan program yang ingin menerapkan konsep kendali akses 
//di dalam kelas atas private ini kit amembuat sebuah variabel yang memiliki acses modifiernya private
//yang dimana private itu visible  (sebuah atribut atau metod
//yang jika acsesnya private hanya bisa di akses di kelas tersebut di defenisikan) 
public class Atas_private {
    protected  int i =5;//mendeklarasikan sebuah variabel bertipe integer dan memiliki value = 5
    //karena acases modifiernya private berarti atribut dari kelas ini 
    //hanya bisa di akses di kelas ini saja 
    Atas_private(){};//membuat konstruktor 
    public void cetak1(){//membuat sebu8h method yang mencetak tulisan dan mencetak  nilai dari variabel i
        System.out.println("Ada Di Kelas Atas_Private");
        System.out.println("I\t="+i);
    }
    
}
