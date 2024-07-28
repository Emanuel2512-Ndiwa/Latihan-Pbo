package modul_08;

//membuat kelas karyawan kontrak yang dimamna kela ini adlaah kelas turunan dari kelas karyawan 
//di dalam kela sini kita hanya memiliki du aatribut kedua atributnya menggunakan akses modifier private 
//di kela sini kita membuat konstruktor dari kelas ini sendiri kita tidak menggunakan konstruktor dari kelas induk yang enggunakan kata kunci super karena 
//sya aingin menyimpan data ketika looping ke dalam konstruktor itu sesuai kebutuhan dair masing masing sub kelasnya
//contohnya di kelas ini ada atribut upah harian dan jumlah hari kerja dan kedua atribut ini saya ingin masukan juga di parameter konstruktor 
//jika kita menggunakan konstruktor seperti di kelas induk maka kedua atribut ini tidak dpaat kita isi melalui konstruktor
public class kk extends Karyawan {
    private int upahHarian;
    private int jumlahHariMasukKerja;

    public kk(String namaKaryawan, int nppKaryawan, int jumlahAnakKaryawan, int upah, int hari) {
        // ini adalah construktor dari kelas karyawan kontrak
        this.nama= namaKaryawan;
        this.npp = nppKaryawan;
        this.jumlah = jumlahAnakKaryawan;
        this.upahHarian = upah;
        this.jumlahHariMasukKerja = hari;
    }

    // membuat method get dari kedua atribut yang kita miliki
    public int getUpahHarian() {
        return upahHarian;
    }

    public int getJumlahHariMasukKerja() {
        return jumlahHariMasukKerja;
    }

    /// membuat method di kelas karyawan yang abstrak atau yang belum memiliki isi
    /// menjadi memiliki fungsi perhitungan gaji dari karyawan kontrka ini
    // kit amembuat nya dengna cara di overide terlebih dahulu
    @Override
    public int hitungGatot() {
        int total = (upahHarian * jumlahHariMasukKerja) + AnakTunjang();
        return total;
    }

    
    

}
