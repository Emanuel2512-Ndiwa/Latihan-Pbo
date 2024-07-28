package modul_05;

public class BUKU {
//membuat atribut yang dibutuhkan di dlama kelas buku
//dalam satu buku ini memiliki banyak pengarang pengarangnya bisa lebih dari satu
//kemudian di dalam kelas buku ini memiliki interaksi dengan kelas pengarang interaksi yang terjadi adalah agregasi
//relasi ini ditandai dengan kelas buku berelasi dengan kelas pengarang melalui objek-objeknya
//ketika di main program setelah kita mengakses dan menginisiasi tiap atributnya menggunakan objeck
//kita mengakses setiap atribut dari kelas pengarang yang sudah di inisiasi ini menggunakan onjeck dari kelas buku

    //membuat variabel yang menjadi atribut dari kelas buku
    private String kodeBuku;//unutk mengisi kode buku
    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setDaftarPengarang(PENGARANG[] daftarPengarang) {
        this.daftarPengarang = daftarPengarang;
    }


    private String judul;//unutk mengisi judul dari buku

    private String tahunTerbit;//unutk mengisi tahun terbit dari buku
    private PENGARANG[] daftarPengarang;//ini adalah tanda relasi antara kelas buku dan kelas pengarang

    //membuat konstruktor 
    //khusus parameter kontruktor dengan nama variabel jumlah pengarang memiliki fungsi unutuk menghitung berpaa banayak 
    //jumlah data atribut yang akan di masukan di dlaam kelas pengarang yang nantinya kita gunakan untuk kuantor dalam looping
    //atau panajng array dalam looping
    public BUKU(String kodeBuku, String judul, String tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;

    }

    public BUKU() {

    }

    public PENGARANG[] getDaftarPengarang() {
        return daftarPengarang;
    }

    //dengan membuat arayy of object dari kelas pengarang di dalam kelas buku dengan tujuan unutk mendapatkan
    //semua data-data atribut dari kelas pengarang yang begitu banayak menggunakan objeck dari kelas buku 
    //membuat method set dari setiap atribut dari kelas buku 
    public String getKodeBuku() {//mendapatkan value dari kode buku yang sudah kita inisiasi atau kita isi di dalam konstruktor
        return kodeBuku;
    }

    public String getJudul() {//mendapatkan value dari judul yang sudah kita isi di konstruktor 
        return judul;
    }

    public String getTahunTerbit() {//mendapatkan value dari tahun terbit yang sudah kita issi di konstruktor
        return tahunTerbit;
    }
// 
    // method unutuk mendapatkan  semua data atribut dari kelas pengarang
    // method ini mempermudah kita ketika kita melakukan looping di main program unutk mengakses semua value yang dimiliki di dlama kelas pengarang
    // selain itu kita langsung menghitung berapa banyak pengarang yang dimiliki dari buku ini 
    // method ini juga mengantisipasi agar tidak terjadinya kelebihan data yang kita masukan 
    // public void tambahPengarang(PENGARANG pengarang) {
    // if (jumlahPengarang < daftarPengarang.length) {
    // daftarPengarang[jumlahPengarang] = pengarang;
    // jumlahPengarang++;
    // } else {
    // System.out.println("Jumlah pengarang sudah mencapai batas.");
    // }
    // }


    public void tambahpengarang(int a, PENGARANG pengarang) {
        // Membuat array baru dengan ukuran yang lebih besar
        PENGARANG[] newArray = new PENGARANG[daftarPengarang.length + 1];
    
        // Menyalin semua elemen dari array daftar pengarang yang sudah ada ke array baru
        for (int i = 0; i < daftarPengarang.length; i++) {
            newArray[i] = daftarPengarang[i];
        }
    
        // Menambahkan pengarang baru ke posisi yang ditentukan
        newArray[a] = new PENGARANG(pengarang.getNik(), pengarang.getNama(), pengarang.getAlamat());
    
        // Mengganti referensi array daftar pengarang dengan array baru yang sudah diperbarui
        daftarPengarang = newArray;
    }
    

    //method unutk menampilkan semua data buku kita setiap  satu buku bisa memiliki lebih dari satu pengarang 
    //method ini mempermudahkan kita unutuk menampilkan dengan benar data pengarang dari setiap buku degnan relasi agregasi
    public void tampilkanInfo() {
        BUKU buku = new BUKU();
        System.out.println("\t\tData Buku");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Kode Buku   \t: " + kodeBuku);
        System.out.println("Judul       \t: " + judul);
        System.out.println("Tahun Terbit\t: " + tahunTerbit);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("\t\tDaftar Pengarang Dari Buku");
        System.out.println("--------------------------------------------------------------------------");
        for (int i = 0; i < daftarPengarang.length; i++) {

            System.out.println("- " + "Nama Pengarang" + "\t" + (i + 1) + "\t:" + daftarPengarang[i].getNama());
            System.out.println("- " + "Nik Pengarang\t" + "\t" + (i + 1) + "\t:" + daftarPengarang[i].getNik());
            System.out.println("- " + "Alamat Pengarang" + "\t" + (i + 1) + "\t:" + daftarPengarang[i].getAlamat());
        }
        System.out.println();

    }
}
