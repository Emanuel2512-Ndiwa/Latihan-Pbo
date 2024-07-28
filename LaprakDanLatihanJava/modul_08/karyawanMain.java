package modul_08;

import java.util.Scanner;
import java.util.ArrayList;

public class karyawanMain {

    public static void main(String[] args) {
        // DALAM PROGRAM INI MENGGUNAKAN ARRAY LIST ALASAN MENGGUNAKAN ARRAY LIST ADALAH
        // AGAR KETIKA INGIN MEMASUKAN DATA BARU KAPAN PUN KITA MAU KITA TIDAK PERLU
        // KAWATIR DENGAN BATAS JUMLAH DATA ARAAY
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Selamat Datang Di Kelas Karyawan");
        System.out.println();
        System.out.print("Masukan Banyaknya Jumlah Karyawan\t: ");
        int angkaData = scanner.nextInt();// VARIABEL UNUTKJ MENYIMPAN NILAI DARI USER SEBAGAI PANJANG ARRAY KITA

        ArrayList<Karyawan> data = new ArrayList<>();// ARRAY OF OBJEJECT ARRAY LIST DARI KELAS KARYAWAN

        for (int a = 0; a < angkaData; a++) {// LOOPING UNUTK MEMASUKAN DATA-DATA DARI SEMUA KELAS KARYAWAN
            scanner.nextLine();
            System.out.print("Nama              \t: ");
            String nama = scanner.nextLine();
            System.out.print("Npp               \t: ");
            int npp = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Jumlah Anak       \t: ");
            int jumlahAnak = scanner.nextInt();
            scanner.nextLine();

            String jabatan;
            do {// LOOPING DO WHILE BERJALAN KETIKA USER SALAH MEMASUKAN DATA DAN AKN BERHENTI
                // KETIKA USER SUDAH BENAR MEMASUKAN DATA NYA
                System.out.print("Jabatan(Kontrak / Tetap): ");
                jabatan = scanner.next().toLowerCase();
                if (!jabatan.equals("kontrak") && !jabatan.equals("tetap")) {
                    System.out.println("Anda Salah Menginput Data");
                }
            } while (!jabatan.equals("kontrak") && !jabatan.equals("tetap"));

            if (jabatan.equals("kontrak")) {// PWERCABANGAN UNUTK MEMERIKSA USER MEMASUKAN DAT AITU TERGOLONG KELAS YANG
                                            // MANA
                System.out.print("\tJumlah Hari Kerja\t: ");
                int hari = scanner.nextInt();
                System.out.print("\tUpah Harian Anda \t: ");
                int upahHarian = scanner.nextInt();
                data.add(new kk(nama, npp, jumlahAnak, upahHarian, hari));
            } else if (jabatan.equals("tetap")) {
                System.out.print("\tGaji Pokok: ");
                int gaji = scanner.nextInt();
                data.add(new kt(nama, npp, jumlahAnak, gaji));
            }
        }

        System.out.println("Berikut Data Karyawan");
        for (Karyawan karyawan : data) {// MENGGUNAKAN LOOPING FOR EACH UNUTK MENAMPILKAN DATA KARYAWAN
            if (karyawan instanceof kk) {
                kk kontrak = (kk) karyawan;
                System.out.println("\t Karyawan Kontrak");
                System.out.println("\tUpah Harian: " + kontrak.getUpahHarian());
                System.out.println("\tJumlah Hari Masuk: " + kontrak.getJumlahHariMasukKerja());
            } else if (karyawan instanceof kt) {
                kt tetap = (kt) karyawan;
                System.out.println("==> Jabatan Karyawan Tetap");
                System.out.println("Gaji Pokok: " + tetap.getGajiPokok());
            }
            System.out.println("Nama                \t: " + karyawan.getNamaKaryawan());
            System.out.println("Npp                 \t: " + karyawan.getNppKaryawan());
            System.out.println("Jumlah Anak         \t: " + karyawan.getJumlahAnakKaryawan());
            System.out.println("Tunjangan Anak      \t: " + karyawan.AnakTunjang());
            System.out.println("Total Gaji          \t: " + karyawan.hitungGatot());
            System.out.println();
        }

        System.out.println("Data Karyawan dengan Gaji di Bawah 1.000.000:");
        for (Karyawan karyawan : data) {
            if (karyawan.hitungGatot() < 1000000) {
                System.out.println("Nama        \t: " + karyawan.getNamaKaryawan());
                System.out.println("Total Gaji  \t: " + karyawan.hitungGatot());
            }
        }
    }

}
