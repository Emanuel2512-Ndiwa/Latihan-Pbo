package modul_07;

// Ini adalah contoh penerapan inheritance di mana kita memiliki kelas induk dan kelas anak.
// Kelas ini merupakan kelas induk.
// Di dalam kelas ini terdapat konstruktor dan method cetak.

public class Atas {
    Atas(){}; // Konstruktor
    // Jika di kelas induknya memiliki konstruktor, maka di kelas 
    // turunannya tidak bisa secara otomatis mewarisi konstruktor ini tanpa
    // menggunakan anotasi super.

    public void cetak1() { // Ini adalah method cetak yang dapat digunakan oleh kelas turunannya 
        // atau dapat di-overide jika diperlukan.
        System.out.println("Ada di class Atas...");
    }
}
