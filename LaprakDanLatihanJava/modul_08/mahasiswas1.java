package modul_08;

public class mahasiswas1 extends mahasiswa {

    // Konstruktor untuk kelas turunan MahasiswaS1.
    // Konstruktor ini menggunakan kata kunci super untuk memanggil konstruktor
    // kelas induk.
    public mahasiswas1(String nama, String nim, String tanggalLahir) {
        super(nama, nim, tanggalLahir);
    }    // Override method konversi nilai dari kelas Mahasiswa.
    // Tujuan overriding adalah untuk menyesuaikan fungsi konversi nilai dengan
    // standar penilaian program S1.
    @Override
    public String konversi() {
        double nilaiFinal = nilaiFinal();
        if (nilaiFinal >= 80) {
            return "A";
        } else if (nilaiFinal >= 70 && nilaiFinal < 80) {

            return "B";

        } else if (nilaiFinal >= 56 && nilaiFinal < 70) {

            return "C";

        } else if (nilaiFinal >= 45 && nilaiFinal < 56) {

            return "D";
        } else {

            return "E";
        }

    }

    @Override
    public boolean isLulus() {
        return konversi().equals("A") || konversi().equals("B") || konversi().equals("C");
    }
}
