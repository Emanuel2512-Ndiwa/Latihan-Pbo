package modul_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modul_05.*;

public class kelolaBuku {

    public static void main(String[] args) {
        Scanner Masuk = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Selamat Datang Di Perpustakaan E.D.M");
        System.out.println("...............................................................................................");
        System.out.println();

        System.out.println("Masukan Jumlah Buku Yang Anda Miliki");
        System.out.print("\t--->> Jumlah\t:");
        int jumlahBuku = Masuk.nextInt();

        List<buku> daftarBuku = new ArrayList<>();
      
        buku dafBuku = new buku();

        System.out.println("\t\t\t\tLengkapi Data-Data Buku Anda\t");
        System.out.println("-------------------------------------------------------------------------------------------------");
       

        for (int a = 0; a < jumlahBuku; a++) {//looping unutk memasukan data-data dari setiap atribut dari kelas buku
            Masuk.nextLine();
            System.out.print("\t=>>>Buku ke " + (a + 1));
            Masuk.nextLine();
            System.out.print("\t\t\t~ Kode Buku   \t:");
            int kodeBukku = Masuk.nextInt();
            Masuk.nextLine();
            System.out.print("\t\t\t~ Judul Buku  \t: ");
            String judulBukku = Masuk.nextLine();
            System.out.print("\t\t\t~ Tahun Terbit\t:");
            int tahunTerbit = Masuk.nextInt();
            Masuk.nextLine();
            System.out.print("\t\t\t\tBerapa Jumlah Pengarang Dari Buku Ini\t:");
            int jumlahPengarangBaru = Masuk.nextInt();
            List<PENGARANG> dataPengarang = new ArrayList<>();//membuat array list unutk menyimpan setiap bulai atribut dari kelas pengarang
            for (int b = 0; b < jumlahPengarangBaru; b++) {
                System.out.println("---------------------------------------------------------------------------------------------------");
                System.out.println("Pengarang ke\t" + (b + 1) + "\tDari Buku \t=> " + (a + 1));
                Masuk.nextLine();
                System.out.print("\t\t\t\tNik       \t:");
                String nik = Masuk.nextLine();
                System.out.print("\t\t\t\tNama      \t:");
                String nama = Masuk.nextLine();
                System.out.print("\t\t\t\tAlamat  \t:");
                String alamat = Masuk.nextLine();

                PENGARANG daftarPengarang = new PENGARANG(nik, nama, alamat);//membuat object lalau mengisikan tiap parameternya dengan nilai yang di dapat
                //dari user yang di simpan di masing variabel ketika looping berjalan tiap iterasi dari index 0
                dataPengarang.add(daftarPengarang);//aray of object dari kelas pengarnag yang merupakan array list meyimpan semua data yang sudah di simpan di object kelas 
                //pengarnag 

            }
            dafBuku = new buku(kodeBukku, judulBukku, tahunTerbit, dataPengarang);//object dari kelas buku mengakses konstruktor yang ada parameternya dan memasukan 
            //semua nilai dari tiap atribut yang di dapat dari user yang di simpan di variabel 
            daftarBuku.add(dafBuku);//array of object dari kelas buku menyimpan object daftar buku yang dimana object daftar bvuku ini 
            //memuat tiap nilai yang di butuhkan atribut dari kelas buku

        }
        //berikut adalah meminta masukan user apakah ia ingin menambahkan pengarang baru atau tidak 
        System.out.println("Apakah Ada Tambahan Pengarang Baru Dari Buku Yang Anda Miliki (Y / T)??");
        String jawab = Masuk.nextLine();
        if (jawab.equalsIgnoreCase("t")) {//percabangan unutk memeriksa apakah jawabannya ya tau tidak
            //menggunakan metod equals ignore unutk tidak memperhatikan apakah yang nilai string yan di masukan user itu 
            //huruf kapital atau tidak 
            System.out.println("---->> Terimakasih  <-----");
            System.out.println("-----Atas Jawaban Anda------");
        } else if (jawab.equalsIgnoreCase("y")) {
            //unutuk mengetahui user ingin memasukan pengarnag baru di buku yang mana 
            //saya menggunakan patokan indexs pada saat looping
            System.out.println("Masukkan Buku Ke Berapa Yang Ingin Ditambahkan Pengarang Baru:");
            int nomorBuku = Masuk.nextInt();

            // Cek apakah nomor buku yang dimasukkan pengguna valid
            if (nomorBuku < 1 || nomorBuku > daftarBuku.size()) {
                System.out.println("Nomor buku tidak valid.");
                return;
            }

            // Ambil buku yang dipilih oleh pengguna yang menggunakan acuan index ke berapa 
            buku bukuYangDipilih = daftarBuku.get(nomorBuku - 1);

            System.out.println("Masukkan data pengarang baru:");
            System.out.print("\t\t\t\tNik       \t:");
            String nik = Masuk.next();
            System.out.print("\t\t\t\tNama      \t:");
            String nama = Masuk.next();
            System.out.print("\t\t\t\tAlamat    ;\t:");
            String alamat = Masuk.next();
            Masuk.nextLine();
        

            // Tambahkan pengarang baru ke dalam buku yang dipilih
            //menggunakan cara object dari kelas buku mengakses method tambahkan pengarang 
            bukuYangDipilih.tambahPengarangBaru(new PENGARANG(nik, nama, alamat));

        }
      
        //berikut adalah obejct buku mengakses semua method yang ada di kelas buku 
        //yang di maana setiap methodnya memiliki fungsi dan tugasnya sesuai nama yang ditulis 
        buku.tampilDataBuku(daftarBuku);
        buku.tampilkanJumlahBukuTahunTertentu(daftarBuku, Masuk);
        buku.tampilkanBukuTerlama(daftarBuku);
        buku.tampilkanBukuTerakhir(daftarBuku);
    }
}
