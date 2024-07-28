package modul_08;

//berikut adalah modifikasi kelas mahasiswa mengunakan kelas abstrak
//unutuk atributnya masih sama seperti modul sebelumnnya dan seluruh acses modiier atributnya juga protected
public abstract class mahasiswa {
    protected String nama;
    protected String nim;
    protected String tanggalLahir;
    protected double uts1;
    protected double uts2;
    protected double uas;

    // constructor
    public mahasiswa(String nama, String nim, String tanggalLahir) {
        this.nama = nama;
        this.nim = nim;
        this.tanggalLahir = tanggalLahir;

    }

    // method untuk menyimpan nilai uts sampai nilai uas
    // di sini say apisahkan unutk mengisikan nilai uas nya itu tidak menggunakan
    // construktor
    // karena setel;ah di coba saat di dlaam kondisi percabangan dalam program main
    // saya tidak dapat memanggila construktpr yang kedua
    public void nilai(double uts1, double uts2, double uas) {
        this.uts1 = uts1;
        this.uts2 = uts2;
        this.uas = uas;
    }

    // membuat method get
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setNama(String nama) {
        this.nama = nama;
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

    // method unutk mengitung nilaifinal
    public double nilaiFinal() {
        return 30 * uts1 / 100 + 30 * uts2 / 100 + 40 * uas / 100;
    }

    // method unutk mengetahui gelar mahasiswa
    public String getGelar() {
        return this instanceof mahasiswas1 ? "S1" : "S2";
    }

    // berikut adalah method abstrak dari kelas mahasiswa ini
    abstract boolean isLulus();

    abstract String konversi();
    // kelas ini menjadi berbeda dengna kelas sebelumnnya karena pada kelas yang ini
    // kita menggunakan konsep abstraksi yang di mana kelas ini menjadi abstrak
    // unutk dapat membuat kelas ini menjadi abstrak adalah dengan membuat minimal
    // satu method abstrak
    // dan di kelas ini terdapat dua method abstrak

}
