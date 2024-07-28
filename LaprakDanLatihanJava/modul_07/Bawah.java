package modul_07;

// Di sini kita membuat kelas turunan dari kelas Atas.
// Cara membuat kelas turunan adalah dengan menggunakan kata kunci extends.
// extends adalah kata kunci di Java yang menunjukkan bahwa suatu kelas merupakan turunan dari kelas lainnya.
// Contohnya di sini, kelas Bawah Extends Atas berarti kelas Bawah Merupakan Turunan Dari kelas Atas.

public class Bawah extends Atas {
    public void cetak2() { // Ini adalah method yang mirip dengan yang ada di kelas induknya, hanya saja isinya diubah.
        // Hal ini dapat disebut sebagai override.
        System.out.println("Ada di kelas Bawah...");
    }
}
