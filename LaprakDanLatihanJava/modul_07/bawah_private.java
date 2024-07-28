package modul_07;
//kita membuat kelas bawh private yang merupakan turunan dari kelas atas private 

public class bawah_private extends Atas_private {
    public void cetak2() {// di dalam kelas ini hanya meiliki sebuah method cetak kelas ini tidak memiliki
                          // atribut
        // dan ketika kita ingin mencetak atau mengakses atribut dari kelas atas private
        // di sini kita memiliki eror karena kendali aksesnya atribut kelas atas private
        // dan jika private berarti visibel dan hanya bisa di akses di kelas tesebut di
        // deklarasikan
        System.out.println("Ada DI Kelas Bawah Private");
        System.out.println("I\t=" + i);
        // ketika kita membuat kelas induk dengan tipe data private maka di sub kelasnya
        // tidak dapat mengakses atribut ataupun methodnya

    }

}
