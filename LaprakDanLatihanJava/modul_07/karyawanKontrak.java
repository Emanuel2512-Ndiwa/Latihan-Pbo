package modul_07;

//kita membuat sebuah kelas turunan dari kelas karyawan 
//unutk membuat sebuah kelas turunan atau cara paling gam[ang melihat sebuah kode program 
//bahwa kelas ini adalah sebuah kelas turunan adalah melihat kata kunci extends
public class karyawanKontrak extends karyawan {// acses modifier kelas ini adalah public
    // di dlaam kelas ini kita memiliki dua atribut yang dimana semua atributnya
    // betipe private dan tipe datanya integer
    // menggunakan integer karena ini menjadi ciri khas atribut dari kelas ini dan
    // atribut ini hanya bisa di akses di kelas ini sendiri
    // lalu kita membuat method get dan set unutuk semua atribut yangn kita miliki
    // ini
    private int upahHarian;

    private int jumlahHariMasuk;

    public int getJumlahHariMasuk() {
        return jumlahHariMasuk;
    }

    public int getUpahHarian() {
        return upahHarian;
    }

    public void setUpahHarian(int upahHarian) {
        this.upahHarian = upahHarian;
    }

    public void setJumlahHariMasuk(int jumlahHariMasuk) {
        this.jumlahHariMasuk = jumlahHariMasuk;
    }

    // kita membuat sebuah funngsi unutk menghitung total gaji
    public void hitungTotalGaji() {
       // variabel total menyimpan nilai dari hasil perhitungan tunjangan anak
        // kenapa kita membuatuhkan sebuah variabel unutk menyimpan hasil perhitungan
        // dari method hitung tunjangan anak
        // karena sebuah method ini tidak dapat kita lakukan operasi hitung dengan
        // vvariabel biasa

        int upah = (upahHarian * jumlahHariMasuk) + hitungTunjangAnak();// ini adalah perhitungan mencari total gaji dari upah jumlah
                                                          // hari dan tunjangan yang di dapatnya
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\tTotal Gaji Anda\t:" + upah);

    }

}
