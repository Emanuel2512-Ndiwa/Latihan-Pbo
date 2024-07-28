package modul_07;


//membuat kelas turunan dari kelas karyawan yang bernama karyawan tetap 
//unutk membuat kelas turunan kita membutuhkan kata kunci extends kemudian di ikuti nama kelas induknya 
public class karyawanTetap extends karyawan {// kelas ini memiliki acsess modifier public
    // didalam kelas ini hanya memiliki satu atribut yang bertipe private aksesnya
    // dan tipe datanya integer
    // lalu atribut ini kita buatkan method set dan get
    private int gajiPokok;

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // kita membuat sebuah fungsi bernama hitung gaji total
    // memiliki nama yang sama dari kelas turunan yang satu yaitu kelas karyawan
    // kontrak
    // tetapi proses aritmatika di dlaamnya berbeda
    public void hitungTotalGaji() {
       
    
        int total = getGajiPokok() + hitungTunjangAnak();// menghitung gaji total dari perkalian gaji pokok dan nilai tunjangan yang
                                             // di dapat kemudian nilainya di simpan di dlaam variabel total
        System.out.println(
                "-------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\tTotal Gaji Anda\t:" + total);

    }

}
