package modul_03;

//membuat kelas buku
public class buku {
    // ini adalah atribut dari kelas buku
    // setiap atribut dari kelas ini memilik akses modifier private
    // menggunakan private unutuk mencegah orang yang tidak berhak untuk
    // memodifikasi setiap atribut ini
    private long koodebuku;// variabel kode buku bertipe long
    private int tahunterbit;//// variabel tahun terbit bertipe integer
    private String judul;// variabel judul bertipe string
    private String namapengarang;// variabel nama pengarang bertipe string
    penerbit datapenerbit;// variabel data penerbit bertipe penerbit
    // menggunakan kelas penerbit sebagai atribut dari kelas buku

    // membuat kontruktor dari kelas buku kontruktor ini memiliki parameter
    // isi dari parameternya adalah kodebuku tahunterbit judul namapengarang dan
    // penerbit
    // didalam parameter ini kita mengakses kelas penerbit yang artinya ketika
    // pertama kali kita
    // membuat objek kita mengisi parameter ini kita juga mengisinya dengan semua
    // atribut yang ada di kelas penerbit
    // dan nantinya kita mengakses kelas penerbit ini menggunakan objek dari kelas
    // buku
    // kita membuat demikian karena setiap buku itu hanya memiliki satu penerbit
    public buku(long koodebuku, int tahunterbit, String judul, String namapengarang, penerbit datapenerbit) {
        this.koodebuku = koodebuku;
        this.tahunterbit = tahunterbit;
        this.judul = judul;
        this.namapengarang = namapengarang;
        this.datapenerbit = datapenerbit;
    }

    // membuat method get dari penerbit
    public penerbit getDatapenerbit() {
        return datapenerbit;
    }

    // method set dari penerbit
    public void setDatapenerbit(penerbit datapenerbit) {
        this.datapenerbit = datapenerbit;
    }

    // method get kodebuku
    public long getKoodebuku() {
        return koodebuku;
    }

    // method set kodebuku
    public void setKoodebuku(long koodebuku) {
        this.koodebuku = koodebuku;
    }

    // method get tahun
    public int getTahunterbit() {

        return tahunterbit;
    }

    // method set tahun terbit
    public void setTahunterbit(int tahunterbit) {
        this.tahunterbit = tahunterbit;

    }

    // method get judul
    public String getJudul() {
        return judul;
    }

    // method set judul
    public void setJudul(String judul) {
        this.judul = judul;
    }

    // method get namapengarang
    public String getNamapengarang() {
        return namapengarang;
    }

    // method set namapengarang
    public void setNamapengarang(String namapengarang) {
        this.namapengarang = namapengarang;
    }

    // didalam program kelas buku ini kita menjadikan kelas penerbit sebagai atribut
    // ini membuat ketika mudah ketika kita ingin mengakses kelas penerbit
    // menggunakan objek
    // karena kita bisa mengaksesnya menggunakan objek dari buku ini memnbuat
    // program kita lebih efisien datanya
    // karena setiap data penerbit buku itu hanya dimiliki buku ini penerbit ini
    // tidak bisa di akses oleh objek buku lainnya ketika di kelas main

}
