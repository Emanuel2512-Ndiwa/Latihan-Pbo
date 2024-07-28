package modul_05;
//mengimport kelas scanner dan kelas pegawai 

import Modul_02.pegawai;
import java.util.Scanner;

public class kelola_perusahaan {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);//membuat object dari kelas scanner 
        perusahaan nama = new perusahaan("Pertamina", "Maguwoharjo,jln paingan,no 143", "Emanuel", "eeeeeee");
        //membuat object dari kelas perusahaan dan mengisi parameter dari konstruktor 01 nya sesuai tipe data yang di berikan 

        //mencetak data dari setiap atribut perusahaan kecuali array ofobject dari kelas buku 
        //kita belum bis amencetaknya karena kita belum mengkasesnya melalui konstruktor 02 yang kita miliki 
        System.out.println("\t\tProfil Perusahaan");
        System.out.println("---------------------------------------------");
        System.out.println("Nama    Perusahaan\t:" + nama.getNamaperusahaan());
        System.out.println("Pemilik Perusahaan\t:" + nama.getPemilik());
        System.out.println("Alamat  Perusahaan\t:" + nama.getAlamat());
        System.out.println("NPWP    Perusahaan\t:" + nama.getNpwp());
        System.out.println("------------------------------------------------");
        System.out.println("-------------------------------");
        System.out.println("Masukan Banyaknya Data Pegawai");
        System.out.print("Jumlah\t:");
        int jumlah = masuk.nextInt();

        //membuat array of object dari kelas pegawai dan mengisikan panjang arraynya menggunakan variabel jumlah yang valuenya didapatkan dari inputan user 
        pegawai[] pegawai_bni = new pegawai[jumlah];
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println("Lengkapi Data Diri Setiap Pegawai Berikut");
        System.out.println("----------------------------------------------");

        //melakukan looping unutk mengisi setiap data atribut dari kelas pegawai yang kemudian di simpan didalam 
        //array of object dari kelas pegawai yang di mulai dari index ke nol 
        //banyaknya data bergantung dari berpaa inputan user yang nilainya di dimpan di dlaam variabel jumlah 
        for (int a = 0; a < pegawai_bni.length - 1; a++) {
            pegawai_bni[a] = new pegawai();//kita membuat object dari kelas pegawai dan menyimpannya di mulai dari index ke a 
            masuk.nextLine();
            System.out.print("Masukan Nama Pegawai     \t" + (a + 1) + "\t:");
            String namapegawai = masuk.nextLine();
            pegawai_bni[a].setNama(namapegawai);

            System.out.print("Masukan Npp Pegawai     \t" + (a + 1) + "\t:");
            String npp = masuk.nextLine();
            pegawai_bni[a].setNpp(npp);

            System.out.print("Masukan Golongan Pegawai\t" + (a + 1) + "\t:");
            int golongan = masuk.nextInt();
            masuk.nextLine();
            pegawai_bni[a].setGolongan(golongan);

            System.out.print("Masukan Status Pegawai   \t" + (a + 1) + "\t:");
            String status = masuk.nextLine();
            pegawai_bni[a].setStatus(status);

            System.out.print("Masukan Jumlah Anak      \t" + (a + 1) + "\t:");
            int jumlahanak = masuk.nextInt();
            masuk.nextLine();
            pegawai_bni[a].setJumlahanak(jumlahanak);
            masuk.nextLine();

        }

        //membaut object baru dari kelas perudahaan dengan menggunakan parameter kontruktor 02 
        //yang diamana paramternya adlaah berisikan argumen array of object dair kelas pegawai 
        perusahaan peru = new perusahaan(pegawai_bni);
        System.out.println("\t\tMasukan Data Pegawai Baru");
        System.out.println("-----------------------------------------------------------------");
        System.out.println();
        masuk.nextLine();
        System.out.print("\tNama      \t\t\t:");
        String namab = masuk.nextLine();

        System.out.print("\tNpp       \t\t\t:");
        String nppb = masuk.nextLine();

        System.out.print("\tStatus    \t\t\t:");
        String Statusb = masuk.nextLine();

        System.out.print("\tGolongan  \t\t\t:");
        int gol = masuk.nextInt();
        masuk.nextLine();

        System.out.print("\tJumlah Anak\t\t\t:");
        int jumlahb = masuk.nextInt();
        masuk.nextLine();
        System.out.println("-------------------------------------------------------------------");
        pegawai baru = new pegawai(nppb, namab, gol, Statusb, jumlahb);
        peru.tambahpegawaibaru(pegawai_bni.length - 1, baru);
        pegawai[] mngset = peru.getPegawai();//di sini kita membuat objeck array dari kelas pegawai dan  nilai array dari object kelas pegawai ini
        //di dapatkan melalui object perusahaan yang mengakses semua atribut dari kelas pegawai

        //menampilkan semua daftar pegawai yagn didapatkan melalui object perusahaan 
        //yang mengakses semua data2 atribut baik atribut dari kelas perushaaan itu ataupun dari kelas pegawai 
        System.out.println("Daftar Pegawai Perusahaan" + nama.getNamaperusahaan());
        System.out.println("===================================================================================");
        System.out.printf("| %-15s | %-10s | %-9s | %-10s | %-12s |\n", "Nama", "NPP", "Golongan", "Status", "Jumlah Anak");
        System.out.println("===================================================================================");
      

        for (int i = 0; i < mngset.length; i++) {

            System.out.printf("| %-15s | %-10s | %-9d | %-10s | %-12d |\n",
                    mngset[i].getNama(), mngset[i].getNpp(), mngset[i].getGolongan(),
                    mngset[i].getStatus(), mngset[i].getJumlahanak());
        }
        System.out.println("===================================================================================");
        
        System.out.println("Rincian Pendapatan Pegawai");
        System.out.println("------------------------------");
        System.out.println();
        peru.rata_rata(mngset);//mengakkses method arata-rata menggunakan object dari kelas perusahaan 
        masuk.close();
        System.out.println("===================================================================================");
  
    }
}
