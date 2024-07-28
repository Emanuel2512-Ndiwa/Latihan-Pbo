package modul_07;

//membuat sebuah kelas yang merupakan kelas induk nama dari kelas ini adalah karyawan
//di sini kita akan mengimplementasikan ruang lingkup sebuah kelas atau lebih sederhananya akses modifikasi yang di ijinkan
//dari sebuah kelas baik itu akses atribut maupun akses methodnya
//di dlaam kelas ini memiliki 4 atribut dan semuanya memiliki acses modifier protected 
//menggunakna acses modifier ini karena kita ingin data atribut kita ini hanya bisa digunakan 
//pada induk kelas dan sub kelasnya unutk setiap tipe data dari atributnya itu berbeda beda ada yang integer ada yang String
public class karyawan {
    protected static int subsidiAnak = 100_000;// atribut dengan nama subsidi memiliki tipe data integer dan memiliki
                                               // nilai defult 100000
    protected int npp;// atribut dengna nama npp dan bertipe integer
    protected String nama;// atrinut dengan nama Nama dan tipe datanya string
    protected int jumlahAnak;// atribut dengan nama jumlah anak dan bertipe integer

    // kemudian unutuk mengisi semua nilai yang di butuhkan dari setiap atribut kita
    // membutuhkan method set
    // menggunakan method ini karena kita sudha melakukan yang namanya enskapsulasi
    // di dalam kelas ini
    // selain itu kita juga membuat method get untuk dapat kembali mengambil sebuah
    // nilai yang sudah di masukan di dalam method set
    // unutk itu kita tidak bisa sembarangan mengubah dan mengambil data sembarangan
    // kit aharu smelalui sebuah prosedur yang sudah
    // disediakan di dalam bahasa java yaitu method set dan get
    public void setNpp(int npp) {
        this.npp = npp;
    }


    public karyawan(int npp, String nama, int jumlahAnak) {
        this.npp = npp;
        this.nama = nama;
        this.jumlahAnak = jumlahAnak;
    }


    public karyawan() {
    }


    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public int getNpp() {
        return npp;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    // kita memnbuat sebuah method yang memiliki fungsi untuk menghitung nilai
    // tunjangan anak berdasarkan hasil perkalian
    // dari jumlah anak dan nilai subsidi ,kita mendeklarasikan method ini di dalam
    // kelas induk dengan alasan
    // kelas turunan dari kelas ini akan menggunakan method yang sama
    // fungsionalitasnya
    // untuk itu kita tidak perlu membuat method yang samafungsinya di dalam kelas
    // turunannya karena semua atribut dan method yang ada di kelas induk bisa di akses di semua kelas turunannya 
    

    public int hitungTunjangAnak() {
        int tunjangAnak = getJumlahAnak() * subsidiAnak;
        return tunjangAnak;

    }

}
