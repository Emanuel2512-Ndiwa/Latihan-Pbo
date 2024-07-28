package modul_06;

//import array list dan list serta import kelas pegawai dari modul 02
import java.util.ArrayList;
import java.util.List;

import Modul_02.*;

public class peprusahaan {

    private String namaPerusahaan;//variabel dengan tipe data string dan nama variabelnya nama Perusahaan 

    private String alamat;//variabel dengan tipe data string dan nama variabelnya alamat
    private String pemilik;//variabel dengan tipe data string dan namanya pemilik
    private int npwp;//variabel dengan nama npwp dan tipe datanya integer
    private List<pegawai> daftarPegawai;//variabel dengan nama daftarPegawai dengan tipe array of Object dari kelas pegawai array yang digunakan array List

    //membuat konstruktor biasa 
    //konstruktor ini dibutuhkan ketika di kelas main saya ingin menginisiasi sebuah object dari kelas perusahaan ini 
    //karena di kelas perusahaan ini ada dua konstruktor dan konstruktor yang satunya memiliki parameter yang berisi variabel variabel yang nilainya nanti unutk mengisi 
    //nilai dari atribut dari kela sperusahaan ini 
    public peprusahaan() {//konstruktor 1

    }

    public peprusahaan(String namaPerusahaan, String alamat, String pemilik, int npwp, List<Karyawan> daftarPegawai) {//konstruktor 2
        this.namaPerusahaan = namaPerusahaan;
        this.alamat = alamat;
        this.pemilik = pemilik;
        this.npwp = npwp;
        this.daftarPegawai = daftarPegawai;
    }

    public void tmpilanProfil() {//method unutk menampilkan dat aperusahaan 
        System.out.println("\t\t\tProfil Perusahaan");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("==>" + "\tNama        \t\t:" + getNamaPerusahaan());
        System.out.println("==>" + "\tPemilik     \t\t:" + getPemilik());
        System.out.println("==>" + "\tNpwp        \t\t:" + getNpwp());
        System.out.println("==>" + "\tAlamat      \t\t:" + getAlamat());
        System.out.println("--------------------------------------------------------------------------------------------------------------------");

    }

    public void rataRataGajiPegawai(List<Karyawan> dfPegawaii) {//method  unutk menghitung rata-rata gaji seluruh pegawai dari perusahaan 
        int jumlahGaji = 0;//menginisiasi variabel jumlahgaji =0 sebelum digunakan dalam perhitungan kita harus memiliki nilai default

        int rataRata = 0;//menginisiasi variabel rata-rata  =0 sebelum digunakan dalam perhitungan kita harus memiliki nilai default
        for (int a = 0; a < dfPegawaii.size(); a++) {
            //menjumlahkan total gaji seluruh pegawai yang di mulai dari pegawai indeks ke nol
            jumlahGaji += dfPegawaii.get(a).htiunggtotal(dfPegawaii.get(a).getGolongan(), dfPegawaii.get(a).getStatus(), dfPegawaii.get(a).getJumlahanak());
        }
        //menghitung rata-rata pegawai dengan membagi semua jumlah total gajii yang di dapat  dengan panjang array atau total pegawai yang ada di perusahaan 
        rataRata = jumlahGaji / dfPegawaii.size();

        //menampilkan rata-rata gaji yangn di daparkan 
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\tRata-rata gaji seluruh pegawai " + "\t\t\t\tRp" + rataRata);
        System.out.println("\t\tCatatan !!!!");
        System.out.println("\t\t-->>> Rata -rata gaji dihitung berdasarkan gaji total yang di dapatkan(bukan berdasarkan gaji pokok)");
    }

    public void gajiTertinggiDanTerendah(List<Karyawan> gajiPegawai) {//method unutuk menghitung gaji tertinggi
        //membuat object baru dari  kelas pegawai dengan nama tertinggi dan menginisiasinya dengan array indeks ke nol
        //kita menginisiasinya dengan array indeks ke nol karena variabel ini nantinya akan di gunakan unutk menyimpan hasil perbandignan dari tiap iterasi 
        //yang di mulai dari indeks ke nol
        pegawai tertinggi = gajiPegawai.get(0);

        for (int i = 0; i < gajiPegawai.size(); i++) {
            //membnuat variabel baru unutk menghitung total gaji dengan cara array of object yang menjadi parameter memanggil method hitung total gaji dari kelas pegawai 
            int totalGaji = gajiPegawai.get(i).htiunggtotal(gajiPegawai.get(i).getGolongan(), gajiPegawai.get(i).getStatus(), gajiPegawai.get(i).getJumlahanak());
            //membandingakan variabel total gaji dengan object dengan nama tertinggi 
            if (totalGaji > tertinggi.htiunggtotal(gajiPegawai.get(i).getGolongan(), gajiPegawai.get(i).getStatus(), gajiPegawai.get(i).getJumlahanak())) {
                //jika memenuhi object tertinggi menyimpan alamat gaji tertinggi itu terdapat di indeks ke i 
                tertinggi = gajiPegawai.get(i);

            }
        }
        //menampilkan pendapatan gaji tertinggi lengkap dengan data pegawainya 
        System.out.println("\t\t\t\tDaftar Pendapatan Gaji Tertinggi");
        System.out.println("\t\tTertinggi");
        System.out.println("\t\t--------------------");
        System.out.println("\t\t\t~Di peroleh atas nama     \t:" + tertinggi.getNama());
        System.out.println("\t\t\t~Golongan                 \t:" + tertinggi.getGolongan());
        System.out.println("\t\t\t~Tunjangan Keluarga       \t:" + "Rp" + tertinggi.hitungtungtunjangankeluarga(tertinggi.getStatus(), tertinggi.getJumlahanak()));
        System.out.println("\t\t\t~Gaji Pokok               \t:" + "Rp" + tertinggi.hitunggajipokok(tertinggi.getGolongan()));
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\tTotal Gaji Yang Ia Kumpulakan\t:" + "Rp" + tertinggi.htiunggtotal(tertinggi.getGolongan(), tertinggi.getStatus(), tertinggi.getJumlahanak()));
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    public void tambahPegawaiBaru(Karyawan pegawaiBaru) {//method unutk menambahkan pegawai baru kedalam sebuah array 
        //menginisiasi array list 
        daftarPegawai = new ArrayList<>();
        daftarPegawai.add(pegawaiBaru);//menambahkan alamat obejct baru ke dalam array list menggunakan metode yang sudah di sediakan array list yaitu add
    }

    public List<Karyawan> getDaftarPegawai() {
        return daftarPegawai;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getPemilik() {
        return pemilik;
    }

    public int getNpwp() {
        return npwp;
    }

    public void tampilkanDataPegawai(List<Karyawan> daftarPegawai) {//method unutuk menampilkan data-data pegawai dari kelas pegawai dengan menggunakan method get dari tiap atribut 
        //di sini looping yang saya gunakan itu looping for each
        System.out.println("\t\t\t\tData Pegawai dan Gaji");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-20s | %-10s | %-10s | %-15s | %-15s | %-15s |%n", "Nama", "NPWP", "Golongan", "Status", "Jumlah Anak", "Total Gaji");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        for (pegawai pegawai : daftarPegawai) {
            int totalGaji = pegawai.htiunggtotal(pegawai.getGolongan(), pegawai.getStatus(), pegawai.getJumlahanak());
            System.out.printf("| %-20s | %-10s | %-10s | %-15s | %-15s | %-15s |%n",
                    pegawai.getNama(), pegawai.getNpp(), pegawai.getGolongan(), pegawai.getStatus(), pegawai.getJumlahanak(), totalGaji);
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------");
    }

}
