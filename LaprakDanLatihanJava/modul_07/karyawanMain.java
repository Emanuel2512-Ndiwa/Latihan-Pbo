package modul_07;

import java.util.Scanner;

import SDL.array.input;

public class karyawanMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Data Karyawan ");
        System.out.println();
        System.out.println();
        System.out.println("\tMasukan Data Karyawan Tetap");
        karyawanTetap kt = new karyawanTetap();
        System.out.println();
        System.out.print("\t\t=> Masukan Nama           \t:");
        String nama = input.nextLine();
        kt.setNama(nama);
        System.out.print("\t\t=> Masukan Npp            \t:");
        int npp = input.nextInt();
        input.nextLine();
        kt.setNpp(npp);
        System.out.print("\t\t=> Masukann Jumlah Anak   \t:");
        int jumlahAnak = input.nextInt();
        input.nextLine();
        kt.setJumlahAnak(jumlahAnak);
        System.out.print("\t\t=> Masukann Gaji Pokok    \t:");
        int gajiPokok = input.nextInt();
        input.nextLine();
        kt.setGajiPokok(gajiPokok);
        System.out.println();
        System.out.println();

        
        System.out.println("\tMasukan Data Karyawan Kontrak");
        karyawanKontrak kk = new karyawanKontrak();
        System.out.println();
        System.out.print("\t\t=> Masukan Nama           \t:");
        String nama1 = input.nextLine();
        kk.setNama(nama1);
        System.out.print("\t\t=> Masukan Npp            \t:");
        int npp1 = input.nextInt();
        input.nextLine();
        kk.setNpp(npp1);
        System.out.print("\t\t=> Masukann Jumlah Anak   \t:");
        int jumlahAnak1 = input.nextInt();
        input.nextLine();
        kk.setJumlahAnak(jumlahAnak1);
        System.out.print("\t\t=> Masukann Upah Harian   \t:");
        int upah = input.nextInt();
        input.nextLine();
        kk.setUpahHarian(upah);
        System.out.print("\t\t=> Masukann Jumlah Hari Masuk\t:");
        int jumlahMasuk = input.nextInt();
        input.nextLine();
        kk.setJumlahHariMasuk(jumlahMasuk);

        System.out.println();
        System.out.println("Berikut Data Lengkap Kedua Karyawan");
        System.out.println();
        System.out.printf("%-2s %-20s %-2s %-20s %-2s %-20s %-2s %-20s %-2s %-30s %-2s%n", "|", "Nama", "|",
                "Jenis Karyawan", "|", "Npp", "|", "Jumlah Anak", "|", " Gaji Atau Upah Harian", "|");
        System.out.println(
                "----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-2s %-20s %-2s %-20s %-2s %-20d %-2s %-20d %-2s %-30d %-2s%n", "|", kt.getNama(), "|",
                "Karyawan Tetap", "|", kt.getNpp(), "|", kt.getJumlahAnak(), "|", kt.getGajiPokok(), "|");
        kt.hitungTotalGaji();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tTunjangan Anak\t:" + kt.hitungTunjangAnak());
        System.out.println(
                "----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.printf("%-2s %-20s %-2s %-20s %-2s %-20s %-2s %-20s %-2s %-30s %-2s  %-20s %-2s%n", "|", "Nama", "|",
                "Jenis Karyawan", "|", "Npp", "|", "Jumlah Anak", "|", " Gaji Atau Upah Harian", "|",
                "Jumlah Hari Masuk", "|");
        System.out.println(
                "----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-2s %-20s %-2s %-20s %-2s %-20d %-2s %-20d %-2s %-30d %-2s  %-20d  %-2s%n", "|",
                kk.getNama(), "|", "Karyawan Tetap", "|", kk.getNpp(), "|", kk.getJumlahAnak(), "|", kk.getUpahHarian(),
                "|", kk.getJumlahHariMasuk(), "|");
        kk.hitungTotalGaji();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tTunjangan Anak\t:" + kk.hitungTunjangAnak());
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------------------------------------------");
        input.close();
    }
    

}
