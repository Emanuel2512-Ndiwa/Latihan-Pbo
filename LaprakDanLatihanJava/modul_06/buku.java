package modul_06;

import modul_05.*;//import modul 5 unutk mengakse kelas pengarang

import java.util.*;//import java util unutuk mengkases array list

public class buku {
    //semua atribut dari kelas buku ini akses modifier yang digunakan adlaah private 
    //dengan alasan unutk mengimplementasikan proses enskapsulasi sebagai pemograman berorientasi object 
    //lalu membuat method get dari setiap atribut dari kelas buku ini 
    //ada satu atribut di dalam kelas buku ini yang tipe datanya bukan primitif tetapi tipe datanya adalah 
    //array of object dari kelas pengarang 
    //lalu array yang di gunakan adlaah array list
    //alasan menggunakan aray list adalah fleksibelitas pengisian jumlah data yang kita inginkan 
    //kita tidak perlu menginisiasi atau menentukan secara defult di awal berapa jumlah data array yagn akan kita simpan di dalamnya 
    private int kodeBuku;
    private String judul;
    private int tahunTerbit;
    private List<PENGARANG> daftarPengarang;//array of object dari kelas pengarang 

    //di dalam kelas buku ini saya membuat dua buah konstruktor yang dimana konstruktor yang pertama menggunakan parameter
    //sedangkan yang kedua konstruktor tanpa parameter
    //dua konstruktor memiliki fungsi yang berbeda 
    //konstruktor yang pertama digunakan untuk memasukan nilai yang nantinya akan di simpan ke dalam atribut dari kelas kita 
    ///sedangkan konstruktor yang kedua di gunakan sebagai unutk membuat object yang tugasnya untuk memanggil atribut ataupun method dari kelas ini
    //kenapa demikian karena ketika kita sudah membuat object menggunakan pemanggilaan konstruktor yang pertama ketika kita ingin mengakses method yang lain di luar looping tidak bisa 
    //karena kita membuat object dengan konstruktor yang ada parameternya ini di dalam looping 
    //sederhananya konstruktor yang tanpa parameter ini di gunakan unutk menginisiasi bahwa ini adalah object dari kelas buku 
    //lalu pada saat kita ingin memanggil kontruktor yang ada parameternya di dlaam looping kita tinggal mengisikan parameternya saja 
    public buku(int kodeBuku, String judul, int tahunTerbit, List<PENGARANG> daftarPengarang) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.daftarPengarang = daftarPengarang;
    }

    // public buku() {

    // }

    public List<PENGARANG> getDaftarPengarang() {//untuk mendapatkan semua daftar pengarang yang sudah di isi 
        return daftarPengarang;
    }

    public void tambahPengarangBaru(PENGARANG pengarangBaru) {//method unutuk menambahkan pegawai baru di dalam array dari kelas of object pengarnag 
        daftarPengarang.add(pengarangBaru);
    }

    public int getKodeBuku() {
        return kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Method untuk menampilkan jumlah buku diterbitkan pada tahun tertentu
     public static void tampilkanJumlahBukuTahunTertentu(List<buku> daftarBuku, Scanner masukan) {
        System.out.println();
        System.out.print("Masukkan tahun yang ingin dicari: ");
        int tahunCari = masukan.nextInt();

        int jumlahBukuTahun = 0;
        for (buku buku : daftarBuku) {//menggunakan looping for each unutk menghitung jumlah buku
            if (buku.getTahunTerbit() == tahunCari) {//percabangan yang kondisinya unutuk memeriksa bahwa tahun yang di cari user itu ada di dalam data array kita
                jumlahBukuTahun++;//setiap kali looping berjalan jika kondisi terpenuhi maka variabel ini dijumlahkan 1 terus 
            }
        }
        System.out.println("");
        System.out.println("Jumlah buku yang diterbitkan pada tahun " + tahunCari + ": " + jumlahBukuTahun);
        System.out.println();
        System.out.println();
    }

    // Method untuk menampilkan buku terbitan paling lama menggunakan parameter array list dari buku
    public static void tampilkanBukuTerlama(List<buku> daftarBuku) {
        if (daftarBuku.isEmpty()) {//memastikan bahwa buku yanng kita punya itu ada datanya 
            System.out.println("Tidak ada buku.");
            return;
        }

        buku bukuTerlama = daftarBuku.get(0);//menginisiasi object bukuTerlama itu berada di indeks ke 0
        for (buku buku : daftarBuku) {//looping for each
            if (buku.getTahunTerbit() < bukuTerlama.getTahunTerbit()) {
                bukuTerlama = buku;
            }
        }

        System.out.println("\t\t\t\t\t\t    Buku terbitan paling lama:");
        System.out.println("...................................................................");
        System.out.println("\t\t\t\t\t\t\tKode Buku      : " + bukuTerlama.getKodeBuku());
        System.out.println("\t\t\t\t\t\t\tJudul Buku     : " + bukuTerlama.getJudul());
        System.out.println("\t\t\t\t\t\t\tTahun Terbit   : " + bukuTerlama.getTahunTerbit());
        System.out.println(".....................................................................");
    }

    // Method untuk menampilkan buku terbitan paling akhir
    public static void tampilkanBukuTerakhir(List<buku> daftarBuku) {
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku.");
            return;
        }

        buku bukuTerakhir = daftarBuku.get(0);
        for (buku buku : daftarBuku) {
            if (buku.getTahunTerbit() > bukuTerakhir.getTahunTerbit()) {
                bukuTerakhir = buku;
            }
        }

        System.out.println("\t\t\t\t\t\t\t      Buku terbitan paling akhir:");
        System.out.println("\t\t\t\t\t\t\tKode Buku     : " + bukuTerakhir.getKodeBuku());
        System.out.println("\t\t\t\t\t\t\tJudul Buku    : " + bukuTerakhir.getJudul());
        System.out.println("\t\t\t\t\t\t\tTahun Terbit  : " + bukuTerakhir.getTahunTerbit());
    }

    public static void tampilDataBuku(List<buku> daftarBuku) {//menampilkan semua data buku daik pengarang lama dan pengarang baru di tambah juga di cetak 

        System.out.println("\t\t\t\tData Buku Beserta Pengarang ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        for (int a = 0; a < daftarBuku.size(); a++) {
            System.out.println("\t\tData Buku ke ---->\t" + (a + 1));
            System.out.println("\t\t\t~ Kode Buku       \t:" + daftarBuku.get(a).getKodeBuku());
            System.out.println("\t\t\t~ Judul Buku      \t:" + daftarBuku.get(a).getJudul());
            System.out.println("\t\t\t~ Tahun Terbit    \t:" + daftarBuku.get(a).getTahunTerbit());
            List<PENGARANG> pengarang = daftarBuku.get(a).getDaftarPengarang();//unutk mendapatkan semua data-data penngarang kita perlu membuat sebuah
            //array list sebagai array of object dari kelas pengarang dan kita mengisikannya dengan object dari kelas buku yang mengakses method get daftar pengarang
            System.out.println("...........................................................................................................................");
            for (int b = 0; b < pengarang.size(); b++) {//ini adalah looping unttuk mendapatkan semua data-data pengarang 

                System.out.println("Daftar Pengarang ke =>\t" + (b + 1) + " " + "Dari Buku ke\t" + (a + 1));
                System.out.println("\t\t\t\tNik     \t:" + pengarang.get(b).getNik());
                System.out.println("\t\t\t\tNama    \t:" + pengarang.get(b).getNama());
                System.out.println("\t\t\t\tAlamat  \t:" + pengarang.get(b).getAlamat());

            }

        }
        //unutuk program yang saya gunakan semua fungsi untuk menampilkan dan memasukan dat athun yang ingin di cari semua nya saya 
        //implementasikan di dalam kelas ini dlaam bentuk sebuah method mengapa demikian karena jika ingin menggunakan method yang sama fungsinya seperti
        //menampilkan data buku dan pengarang ataupun method untuk mencari tertiban buku tahun tertentu kita tidak perlu membuat method baru yang sama fungsinya
        //kita hanya perlu memanggilnya menggunkaan nama object dari kelas ini atau pun menggunakan nama dari kelas ini
        //di dalam kelas ini ada empat method yang saya gunakan kata kunci static dengan alasan saya hanya ingin method ini di gunakan oleh sebuah kelas lain yang berada di dlaam package yang sama

    }

}
