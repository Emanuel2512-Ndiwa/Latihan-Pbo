package modul_03;

//membuat kelas penerbit
public class penerbit {

    // membuat atribut dari kelas penerbit
    // bertipe string dan int
    // semua atributnya memiliki akses modifiier private
    private String namapenerbit;
    private String alamat;
    private int tahunberdiri;

    // membuat kontruktor dari kelas penerbit
    public penerbit(String namapenerbit, String alamat, int tahunberdiri) {
        //menggunakan this unutk mencegah shadowing variabel
        //shadowing variabel itu adlaah ketika kita ingin mengakses suatu nama variabel tetapi 
        //komputer kebingungan variabel mana yang kita maksudkan
        //jadi ketika kita membuat sebuah variabel baru di dlam suatu kelas dan kita ingin membuat
        //nama variabelnya sama agar kita tidak bingung maka perlu menggunakan this 
        this.namapenerbit = namapenerbit;
        this.alamat = alamat;
        this.tahunberdiri = tahunberdiri;
    }

    // membaut method get dari namapenerbit bertipe string
    public String getNamapenerbit() {
        return namapenerbit;
    }

    // membaut method setnamapenerbit
    public void setNamapenerbit(String namapenerbit) {
        this.namapenerbit = namapenerbit;
    }

    // membuat method getalamat
    public String getAlamat() {
        return alamat;
    }

    // membaut method set alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // membaut method gettahunberdiri
    public int getTahunberdiri() {
        return tahunberdiri;
    }

    // membaut method set tahun berdiri
    public void setTahunberdiri(int tahunberdiri) {
        this.tahunberdiri = tahunberdiri;
    }

    // di sini kita membuatuhkan method set dan get dengan tujuan agar setip atribut
    // yang kita miliki tidak bisa di modifikasi oleh orang-orang yang tidak berhak

    //method set digunakan unutk mengubah suatu nilai yang sudah kita miliki sebelumnya atau yang sudah kita
    //masukan di dalam construktor
    
    //sedangkan method get adalah metode yang digunkaan unutuk mendapatkan atau mengambil nilai
    //yang sudah kita masukan di suatu variabel method set 

}
