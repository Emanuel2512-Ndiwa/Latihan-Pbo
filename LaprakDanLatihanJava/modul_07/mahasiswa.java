package modul_07;

// Kelas mahasiswa memiliki atribut-atribut yang merepresentasikan data mahasiswa.
// Setiap atribut memiliki akses modifier protected dan tipe data yang sesuai dengan nilainya.
public class mahasiswa {
    protected String nama;
    protected String nim;
    protected String tanggalLahir;
    protected double uts1;
    protected double uts2;
    protected double uas;

    // Konstruktor ini menginisialisasi nilai atribut-atribut kelas mahasiswa.
    // Konstruktor ini memiliki parameter yang sesuai dengan atribut-atribut tersebut.
    // Subkelas atau kelas turunan dari kelas Mahasiswa harus memiliki konstruktor yang sama dengan
    // menambahkan anotasi super.
    public mahasiswa(String nama, String nim, String tanggalLahir, double uts1, double uts2, double uas) {
        // Menggunakan kata kunci 'this' untuk merujuk kepada atribut dari kelas Mahasiswa.
        //dan juga mencegah variabel shadowing
        this.nama = nama;
        this.nim = nim;
        this.tanggalLahir = tanggalLahir;
        this.uts1 = uts1;
        this.uts2 = uts2;
        this.uas = uas;
    }

    // Method get digunakan untuk mengembalikan nilai dari setiap atribut kelas Mahasiswa.
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public double getUts1() {
        return uts1;
    }

    public double getUts2() {
        return uts2;
    }

    public double getUas() {
        return uas;
    }

    // Method ini menghitung nilai akhir mahasiswa berdasarkan bobot nilai uts dan uas.
    public double nilaiFinal() {
        return 30 * uts1 / 100 + 30 * uts2 / 100 + 40 * uas / 100;
    }

    // Method ini mengkonversi nilai akhir menjadi huruf grade berdasarkan nilai yang diperoleh.
    //dan juga bisa di overide di kelas induknya 
    public void konversi(double nilaiFinal) {
        if (nilaiFinal >= 99) {
            System.out.println("Nilai: B");
        } else {
            System.out.println("Nilai: A");
        }
    }
}
