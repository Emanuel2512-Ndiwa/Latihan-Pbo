package modul_09;

import java.util.Scanner;

public class kelasBangunMain {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.println("Selamat Datang DI kelas Bangun Datar");
        BangunDatar[] b = new BangunDatar[4];
        System.out.println("Pilihan Bangun Datar\t:(Lingkaran,\tSegitiga,\tSegiEmpat,\tBelahKetupat)");
        String pilih ;
        for (int a = 0; a < b.length; a++) {
            do {
                System.out.print("-------Pilih------\t:");
                pilih = m.nextLine();
                if (!pilih.equalsIgnoreCase("Lingkaran") && !pilih.equalsIgnoreCase("Segitiga")
                        && !pilih.equalsIgnoreCase("SegiEmpat") && !pilih.equalsIgnoreCase("BelahKetupat")) {
                    System.out.println("Silahkan Masukan Ulang Pilihan Anda");
                }
            } while (!pilih.equalsIgnoreCase("Lingkaran") && !pilih.equalsIgnoreCase("Segitiga")
                    && !pilih.equalsIgnoreCase("SegiEmpat") && !pilih.equalsIgnoreCase("BelahKetupat"));
            if (pilih.equalsIgnoreCase("Segitiga")) {
                System.out.println();
                System.out.print("Sisi 1\t:");
                int s1 = m.nextInt();
                System.out.print("Sisi 2\t:");
                int s2 = m.nextInt();
                System.out.print("Sisi 3\t:");
                int s3 = m.nextInt();
                b[a] = new Segitiga(s1, s2, s3);
            } else if (pilih.equalsIgnoreCase("SegiEmpat")) {
                System.out.println();
                System.out.print("Panjang\t:");
                int p = m.nextInt();
                System.out.print("Lebar\t:");
                int l = m.nextInt();
                b[a] = new SegiEmpat(p, l);
            } else if (pilih.equalsIgnoreCase("BelahKetupat")) {
                System.out.println();
                System.out.print("d1\t:");
                double d1 = m.nextDouble();

                System.out.print("d2\t:");
                double d2 = m.nextDouble();

                System.out.print("s1\t:");
                double s1 = m.nextDouble();
                System.out.print("s2\t:");
                double s2 = m.nextDouble();
                System.out.print("s3\t:");
                double s3 = m.nextDouble();

                b[a] = new BelahKetupat(d1, d2, s1, s2, s3);
            } else if (pilih.equalsIgnoreCase("Lingkaran")) {
                System.out.print("Jari-jari\t:");
                double jari = m.nextDouble();
                b[a] = new Lingkaran(jari);

            }

        }
        m.close();

        // Menampilkan hasil perhitungan keliling dan luas
        System.out.println("=================================================");
        System.out.println("No. Bangun datar   Keliling   Luas");
        System.out.println("-----------------------------------------------------------------------------------------");
        for (int i = 0; i < b.length; i++) {
            System.out.printf("%d.  %-15s %.2f     %.2f\n", i + 1, b[i].getClass().getSimpleName(),
                    b[i].hitungKeliling(), b[i].hitungLuas());
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

}
