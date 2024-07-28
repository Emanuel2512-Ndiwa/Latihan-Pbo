package modul_04;

public class buku {
    //membaut variaabel dari kelas buku dengan tipe data string dan acses modifiernya adlaah private
    //si sini langsung di gabungkan menjadi satu karena semuanya memiliki tipe data yang sama 
    private String kodebuku, judul, tahunterbit, nama;

    ///kemudian kita membuat method get dan set dari semua atribut  yang kita punya
    //dan jangan lupa ketika kita ada membuat nama variabel yang sata degnan atribut atau pun method kita 
    //kita harus menggunakan kata kunci this agar tidak terjadinya shadoeing variabel 
    //ini terjadi karen akomputer bingung ketika kita mengakses nama variabel yang sama variabel maana yang mau dia tunjukan
    public String getKodebuku() {
        return kodebuku;
    }

    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTahunterbit() {
        return tahunterbit;
    }

    public void setTahunterbit(String tahunterbit) {
        this.tahunterbit = tahunterbit;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}
