package modul_07;

// Kelas MahasiswaS1 merupakan turunan dari kelas Mahasiswa.
// Tujuan dari kelas ini adalah untuk merepresentasikan mahasiswa program S1.
public class mahasiswaS1 extends mahasiswa {

    // Konstruktor untuk kelas turunan MahasiswaS1.
    // Konstruktor ini menggunakan kata kunci super untuk memanggil konstruktor kelas induk.
    public mahasiswaS1(String nama, String nim, String tanggalLahir, double uts1, double uts2, double uas) {
        super(nama, nim, tanggalLahir, uts1, uts2, uas);
    }

    // Override method konversi nilai dari kelas Mahasiswa.
    // Tujuan overriding adalah untuk menyesuaikan fungsi konversi nilai dengan standar penilaian program S1.
    @Override
    public void konversi(double nilaiFinal) {
        if (nilaiFinal >= 80) {
            System.out.println("\t\t\t\tHasil Konversi Nilai        \t= A");
        } else if (nilaiFinal >= 70 && nilaiFinal < 80) {
            System.out.println("\t\t\t\tHasil Konversi Nilai        \t= B");
         
        } else if (nilaiFinal >= 56 && nilaiFinal < 70) {
            System.out.println("\t\t\t\tHasil Konversi Nilai        \t= C");
           
        } else if (nilaiFinal >= 45 && nilaiFinal < 56) {
            System.out.println("\t\t\t\tHasil Konversi Nilai        \t= D");
        } else {
            System.out.println("\t\t\t\tHasil Konversi Nilai        \t= E");
        }
    }   
}
