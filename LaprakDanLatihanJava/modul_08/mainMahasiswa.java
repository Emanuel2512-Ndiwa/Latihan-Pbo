package modul_08;

import java.util.ArrayList;
import java.util.Scanner;

//import array list dan kelas scanner 
public class mainMahasiswa {
    public static void main(String[] args) {
        // dalam program ini menggunakan array list mengggunakna ini larena lebih
        // fleksibel dalam menyimpan banyak data kita dapat menambahkan data baru
        // kapanpunkita mau seiring berjalannya progam tanpa harus membuat logika baru
        // dalam fungsi kita
        Scanner scanner = new Scanner(System.in);// deklarasi kelas scanner

        System.out.println("Selamat Datang Di Universitas RRRRRRRRR");
        System.out.println();
        System.out.print("Jumlah Mahasiswa\t: ");
        int jumlah = scanner.nextInt();// variabel penampung jumlah mahasiswa

        ArrayList<mahasiswa> mahasiswas = new ArrayList<>();// membuat aray of object mengguankan array list dari kelas
                                                            // mahasiswa

        for (int i = 0; i < jumlah; i++) {// looping untuk kmemasukan data-data mahasiswa
            scanner.nextLine();
            System.out.print("NIM                   \t: ");
            String nim =  scanner.nextLine();
            System.out.print("Nama                  \t: ");
            String nama =  scanner.nextLine();
            System.out.print("Tempat, Tanggal Lahir \t: ");
            String ttl =  scanner.nextLine();
     
            System.out.print("S1/S2                 \t: ");
            String gelar =  scanner.nextLine();
            scanner.nextLine();
            
            // looping while menunjukan jika ada data yang salah maka akan mengulang program
            // itu smapai benar memasukannya
            while (!gelar.equals("S1") && !gelar.equals("S2")) {
                System.out.println("Anda Salah Menginput");
                System.out.print("S1/S2: ");
                gelar = scanner.next().toUpperCase();
            }

            mahasiswa mahasiswa;// MENDEKLARASIKAN OBJECT MAHASISWA
            // PERCABAGNAN UNUTK MEMILIH OTOMATIS FUNGSI YANG AKAN DI JALANKAN SESUAI FUGNSI
            // DARI KELAS TERSEBUT
            if (gelar.equals("S1")) {
                System.out.print("Nilai UTS 1   \t: ");
                double uts1 = scanner.nextDouble();
                System.out.print("Nilai UTS 2   \t: ");
                double uts2 = scanner.nextDouble();
                System.out.print("Nilai UAS     \t: ");
                double uas = scanner.nextDouble();
                mahasiswa = new mahasiswas1(nama, nim, ttl);
            } else {
                System.out.print("Nilai UTS 1   \t: ");
                double uts1 = scanner.nextDouble();
                System.out.print("Nilai UTS 2   \t: ");
                double uts2 = scanner.nextDouble();
                System.out.print("Nilai UAS     \t: ");
                double uas = scanner.nextDouble();
                mahasiswa = new mahasiswas2(nama, nim, ttl);
            }
            mahasiswas.add(mahasiswa);
        }

        System.out.println("Daftar Nama, Jenjang Pendidikan, dan Nilai Huruf dari Semua Mahasiswa:");
        for (mahasiswa mahasiswa : mahasiswas) {
            System.out.println("Nama\t: " + mahasiswa.getNama() + "\t, Jenjang Pendidikan\t: " + mahasiswa.getGelar()
                    + ",\t Nilai Huruf\t: " + mahasiswa.konversi());
        }

        System.out.println("Daftar Mahasiswa S1 yang Lulus:");
        for (mahasiswa mahasiswa : mahasiswas) {
            if (mahasiswa instanceof mahasiswas1 && mahasiswa.isLulus()) {
                System.out.println("Nama: " + mahasiswa.getNama() + ", Jenjang Pendidikan: " + mahasiswa.getGelar()
                        + ", Nilai Huruf: " + mahasiswa.konversi());
            }
        }
    }
}
