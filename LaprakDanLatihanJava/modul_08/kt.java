package modul_08;

//membuat  kelas turunan yang kedua yaitu kelas kariawan tetap 
//sama halnya kelas ini merupakan kelas turunan dari abstrac kelas oleh karena itu kita di wajibkan unutk menoveride method hitung gaji total
//di dlaam kelas ini hanya memiliki saatu atribut dan acses modifiernya adlaah private
public class kt extends Karyawan {
    private int gajiPokok;

    public kt(String namaKaryawan, int nppKaryawan, int jumlahAnakKaryawan, int gaji) {
        //membuat construktor
        this.nama = namaKaryawan;
        this.npp = nppKaryawan;
        this.jumlah = jumlahAnakKaryawan;
        this.gajiPokok = gaji;

    }
    // lalau membuat method get dan set dari atribut yang kita punya di kelas ini
    // dengna tujuan agar bisa mendapatkan nilai dan juga bisa di inisiasikan
    // nilainya di kelas lain

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    @Override
    // ini adalah method hitung gaji total yang sudah di overide sesuaikebutuhan
    // operasi dari kelas ini
    public int hitungGatot() {
        int total = getGajiPokok() + AnakTunjang();
        return total;

    }
}
