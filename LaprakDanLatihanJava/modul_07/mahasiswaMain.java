package modul_07;

import java.util.ArrayList;
import java.util.Scanner;

public class mahasiswaMain {

    public class MainMahasiswa {
        public static void main(String[] args) {
            Scanner masuk = new Scanner(System.in);
            System.out.println("\t------ Mahasiswa UST ------");
            System.out.println();
            System.out.println("\t\tData Mahasiswa S1");
            System.out.println();
            System.out.print("\t\t\tMasukan Banyak Mahasiswa\t:");
            int banyakS1 = masuk.nextInt();// mnyimpan data nilai sebagai banyaknya mahasiswa yang di dapat dari user
            System.out.println();

            ArrayList<mahasiswaS1> listMhsS1 = new ArrayList<>();// membuat array of object dari kelas mahasiswa
                                                                 // s1 menggunakan array list

            for (int i = 0; i < banyakS1; i++) {// looping untuk memasukan semua data atribut dari kelas s1 di dalam
                                                // looping ini kita tidak hanya mengakses atribut dari kelas mahasiswa
                                                // s1 tetapi atribut dari kelas mahasiswa sebagai kelas induk juga
                                                // diakses
                // kita perlu membuat variabel baru unutk menyimpan smeua nilai yang di masukan
                // user sesuai kebutuhan atribut yang kita miliki
                // unutk tipe data dari setiap variabel ini menyesuaikan tipe data dari atribut
                // yang kita deklarasikan
                System.out.println();
                System.out.println("\tData Diri Mahasiswa S1 Ke =>\t" + (i + 1));
                masuk.nextLine();
                System.out.print("\t\t\t\t---> Nama              \t:");
                String nama = masuk.nextLine();
                System.out.print("\t\t\t\t---> Nim               \t:");
                String nim = masuk.nextLine();
                System.out.print("\t\t\t\t--->Tempat,Tanggal Lahir     \t:");
                String tanggal = masuk.nextLine();
                System.out.println();
                System.out.println("\t\t\tData Nilai Mahasiswa S1 Ke =>\t" + (i + 1));
                System.out.print("\t\t\t\t\tNilai Uts1              \t:");
                double uts1 = masuk.nextDouble();
                System.out.print("\t\t\t\t\tNilai Uts2              \t:");
                double uts2 = masuk.nextDouble();
                System.out.print("\t\t\t\t\tNilai Uas               \t:");
                double uas = masuk.nextDouble();
                // lalu kita mengakses method add menggunakan array of object dair kelas
                // mahasiswa s1
                // metho dad ini untuk menambahkan atau menyimpan semua nilai atribut yang kita
                // masukan itu yang akan kita inisiasikan di dlaam konstruktpr
                // setiap klai looping berjalan maka nilai parameter yang selalau diperbarui
                // seiring berjalannya looping terus di simpan di dlaam array list sebgai array
                // of object
                listMhsS1.add(new mahasiswaS1(nama, nim, tanggal, uts1, uts2, uas));
            }

            System.out.println();
            System.out.println("\t\tData Mahasiswa S2");
            System.out.println();
            System.out.print("\t\t\tMasukan Banyak Mahasiswa s2\t:");
            int banyakS2 = masuk.nextInt();
            System.out.println();

            ArrayList<mahasiswaS2> listMhsS2 = new ArrayList<>();// membuat array of obejct dari kelas mahasiswa
                                                                 // konstruktor menggunakan array list

            for (int i = 0; i < banyakS2; i++) {
                // looping untuk memasukan semua data atribut dari kelas s2 di dalam
                // looping ini kita tidak hanya mengakses atribut dari kelas mahasiswa
                // s2 tetapi atribut dari kelas mahasiswa sebagai kelas induk
                System.out.println();
                System.out.println("\tData Diri Mahasiswa S2 Ke =>\t" + (i + 1));
                // kita perlu membuat variabel baru unutk menyimpan smeua nilai yang di masukan
                // user sesuai kebutuhan atribut yang kita miliki
                // unutk tipe data dari setiap variabel ini menyesuaikan tipe data dari atribut
                // yang kita deklarasikan
                masuk.nextLine();
                System.out.print("\t\t\t\t\t+ Nama                 \t:");
                String nama = masuk.nextLine();
                System.out.print("\t\t\t\t\t+ Nim                  \t:");
                String nim = masuk.nextLine();
                System.out.print("\t\t\t\t\t+ Tempat,Tanggal Lahir \t:");
                String tanggal = masuk.nextLine();
                System.out.println("\t\tData Nilai Mahasiswa S2 ke \t" + (i + 1));
                System.out.print("\t\t\t\t\tUts1          \t:");
                double uts1 = masuk.nextDouble();
                System.out.print("\t\t\t\t\tUts2          \t:");
                double uts2 = masuk.nextDouble();
                System.out.print("\t\t\t\t\tUas           \t:");
                double uas = masuk.nextDouble();
                // lalu kita mengakses method add menggunakan array of object dair kelas
                // mahasiswa s2
                // metho dad ini untuk menambahkan atau menyimpan semua nilai atribut yang kita
                // masukan itu yang akan kita inisiasikan di dalamm konstruktor
                // setiap klai looping berjalan maka nilai parameter yang selalau diperbarui
                // seiring berjalannya looping terus di simpan di dlaam array list sebgai array
                // of object
                listMhsS2.add(new mahasiswaS2(nama, nim, tanggal, uts1, uts2, uas));
            }

            System.out.println();
            System.out.println("Data Lengkap Seluruh Mahasiswa S1");

            for (mahasiswaS1 mhs : listMhsS1) {// menggunakan looping for each untuk menampilkan semua data mahasiswa s1
                // dan juga menggunakan method get unutk mendapatkan smeua nilai yang sudah
                // dimasukan di atributdari kelas ini
                double nilaiFinal = mhs.nilaiFinal();
                System.out.println();
                System.out.println("\t\tNama            \t:" + mhs.getNama());
                System.out.println("\t\tNim             \t:" + mhs.getNim());
                System.out.println("\t\tTanggal Lahir   \t:" + mhs.getTanggalLahir());
                System.out.println("\t\t====== Nilai Yang Di Peroleh ======");
                System.out.println("\t\tUts 1   \t:" + mhs.getUts1());
                System.out.println("\t\tUts 2   \t:" + mhs.getUts2());
                System.out.println("\t\tUas     \t:" + mhs.getUas());
                System.out.println();
                System.out.println("\t\t\t====== Akumulasi Nilai ======");
                System.out.println("\t\t\t\tTotal Nilai Akhir Yang Di Peroleh \t=" + nilaiFinal);
                mhs.konversi(nilaiFinal);

                System.out.println();
                System.out.println();
            }

            System.out.println();
            System.out.println("Data Lengkap Seluruh Mahasiswa S2");

            for (mahasiswaS2 mhs : listMhsS2) {
                // menggunakan looping for each unutk membaca data dari kelas mahasiswa s2
                // dan juga menggunakan method get unutk mendapatkan smeua nilai yang sudah
                // dimasukan di atributdari kelas ini
                double nilaiFinal = mhs.nilaiFinal();
                System.out.println();
                System.out.println("\t\tNama            \t:" + mhs.getNama());
                System.out.println("\t\tNim             \t:" + mhs.getNim());
                System.out.println("\t\tTanggal Lahir   \t:" + mhs.getTanggalLahir());
                System.out.println("\t\t====== Nilai Yang Di Peroleh ======");
                System.out.println("\t\tUts 1   \t:" + mhs.getUts1());
                System.out.println("\t\tUts 2   \t:" + mhs.getUts2());
                System.out.println("\t\tUas     \t:" + mhs.getUas());
                System.out.println();
                System.out.println("\t\t\t====== Akumulasi Nilai ======");
                System.out.println("\t\t\t\tTotal Nilai Akhir Yang Di Peroleh \t=" + nilaiFinal);
                mhs.konversi(nilaiFinal);

            }

            masuk.close();// menutup scanner
        }
    }

}
