package Modul_02;

import java.util.Scanner;
import modul_06.*;

public class SegitigaMainn{

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.println("___________________________________________________________________________");
        System.out.println("\t\t Memasukan Tiga Pasang Titik Koordinat");

        System.out.println("\t\tMasukan Nilai");
        System.out.println("--------------");

        Segitiga[] segitigaArray = new Segitiga[3]; // Inisialisasi array of objects

        for (int i = 0; i < 3; i++) {//looping unutuk memasukan nilai segitiga
            System.out.println("Masukan Titik ke-" + (i + 1));
            System.out.print("\t\tX1: ");
            double x1 = masuk.nextDouble();
            System.out.print("\t\tY1: ");
            double y1 = masuk.nextDouble();
            System.out.print("\t\tX2: ");
            double x2 = masuk.nextDouble();
            System.out.print("\t\tY2: ");
            double y2 = masuk.nextDouble();
            System.out.print("\t\tX3: ");
            double x3 = masuk.nextDouble();
            System.out.print("\t\tY3: ");
            double y3 = masuk.nextDouble();
            segitigaArray[i] = new Segitiga(x1, y1, x2, y2, x3, y3);//membuat array dan mengisikan parameter dimulai dari index ke nol
        }

        System.out.println("---------------");
        System.out.println("  ");
        System.out.println("Tabel Nilai Dari Titik Koordinat ");
        System.out.println("______________________");
        System.out.printf("%-1s %-5s %-2s %-9s %-1s%n", "|", "Titik ", "|", "Nilai", "|");
        System.out.println("------------------------");

        for (int i = 0; i < 3; i++) {//looping untuk menampilkan nilai segitiga
            System.out.println("Segitiga ke-" + (i + 1));
            System.out.println("X1: " + segitigaArray[i].x1 + ", Y1: " + segitigaArray[i].y1);
            System.out.println("X2: " + segitigaArray[i].x2 + ", Y2: " + segitigaArray[i].y2);
            System.out.println("X3: " + segitigaArray[i].x3 + ", Y3: " + segitigaArray[i].y3);
            System.out.println("------------------------");
        }
        System.out.println("________________________");

        System.out.println("-------------------------------------");
        System.out.println("Berikut Adalah Hasil Perhitungannya");
        System.out.println("-------------------------------------");
        for (int i = 0; i < 3; i++) {//ini looping unutk menampilkan hasil perhitungannya
            System.out.println("\t\tSegitiga ke-" + (i + 1));
            System.out.println("\t\t\tKeliling Segitiga Adalah\t:" + String.format("%.2f", segitigaArray[i].hitungKeliling()));
            System.out.println("\t\t\tLuas Segitiga Adalah    \t:" + String.format("%.2f", segitigaArray[i].hitungLuas()));
            System.out.println("-------------------------------------");
        }

        KumpulanSegitiga kumpulan = new KumpulanSegitiga(3);//membuat object dari kelas kumpulan dan mengisikan jumlah segitiga 
        for (int i = 0; i < 3; i++) {//looping unutk menambahkan segitiga
            kumpulan.tambahSegitiga(segitigaArray[i]);
        }

        System.out.println("\t\t\tRata-rata luas semua segitiga dalam kumpulan adalah\t: " + String.format("%.2f", kumpulan.hitungRatarata()));

        Segitiga terluas = kumpulan.Terluas();//membuat object dari kelas seitiga danmengakses method terluas 
        System.out.println("\t\t\t\tSegitiga terluas memiliki luas  \t: " + terluas.hitungLuas());

        Segitiga terkecil = kumpulan.Terkecil();//membuat object dari kelas seitiga danmengakses method terkecil                
        System.out.println("\t\t\t\tSegitiga terkecil memiliki luas \t: " + terkecil.hitungLuas());
    }
}
