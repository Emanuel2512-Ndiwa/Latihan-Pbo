package modul_09;

import java.util.Scanner;

public class MainBangunDatar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bangun Datar");
        System.out.println();
        System.out.println();
        System.out.println("Input");
        System.out.println();
        System.out.print("Jumlah Bangun Datar Anda\t:");
        int jumlah = input.nextInt();
        BangunDatar[] datar = new BangunDatar[jumlah];
        System.out.println("\tSilahkan Pilih Dari Menu Dibawah Ini");
        System.out.println("------------------------------------------------------");

        int pilih;
        System.out.println("""
                1.Segitiga
                -----------
                2.SegiEmpat
                -----------
                3.Lingkaran
                ----------
                """);
        System.out.println();

        for (int a = 0; a < datar.length; a++) {
            do {
                System.out.print("--> Pilih\t:");
                pilih = input.nextInt();
                if (pilih > 3 || pilih < 1) {
                    System.out.println("Silahkan Masukan Ulang Pilihan Anda");
                }
            } while (pilih > 3 || pilih < 1);
            if (pilih == 1) {
                System.out.println();
                System.out.print("Sisi 1\t:");
                int s1 = input.nextInt();
                System.out.print("Sisi 2\t:");
                int s2 = input.nextInt();
                System.out.print("Sisi 3\t:");
                int s3 = input.nextInt();
                datar[a] = new Segitiga(s1, s2, s3);
            } else if (pilih == 2) {
                System.out.println();
                System.out.print("Panjang\t:");
                int p = input.nextInt();
                System.out.print("Lebar\t:");
                int l = input.nextInt();
                datar[a] = new SegiEmpat(p, l);
            } else if (pilih == 3) {
                System.out.println();
                System.out.print("Jari-jari\t:");
                double j = input.nextDouble();
                datar[a] = new Lingkaran(j);
            }

        }
        input.close();

        // Menampilkan hasil perhitungan keliling dan luas
        System.out.println("=================================================");
        System.out.println("No. Bangun datar   Keliling   Luas");
        System.out.println("-----------------------------------------------------------------------------------------");
        for (int i = 0; i < datar.length; i++) {
            System.out.printf("%d.  %-15s %.2f     %.2f\n", i + 1, datar[i].getClass().getSimpleName(),
                    datar[i].hitungKeliling(), datar[i].hitungLuas());
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
