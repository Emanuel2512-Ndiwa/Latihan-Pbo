package Modul_02;

//unutk mengakses kelas scanner di sini perlu mengimpornya terlebih dahulu
import java.util.Scanner;

public class kalkulatorMain {
    // kelas kalkulator mian ini berisikan method main
    public static void main(String[] args) {
        // membuat objec dari kelas kalkulator yang nama objeknya adlaah input
        kalkulator input = new kalkulator();
        // membuat objek dari kelas scanner
        Scanner masuk = new Scanner(System.in);
        System.out.println("____________________________________________________");
        System.out.println("\t\tKalkulator Mini");
        System.out.println("____________________________________________________");
        System.out.println("");

        // meminta user memasukan angka yang akan digunakan unutk perhitungan
        System.out.print("Mausukan Angka1\t=");
        double A = masuk.nextDouble();
        System.out.println("--------------------------");
        System.out.print("Masukan Angka2\t=");
        double a = masuk.nextDouble();

        // mengkases method mutator menggunakan objec input
        // dan nilai dari methodnya itu di isi menggunkaan variabel yang nilainya di
        // termia dari inputan user
        input.setAngka1(A);
        input.setAngka2(a);

        // mengakses method acsesor menggunakan objek input
        // kemudian nilainya di simpan di variabel angka 1 dan angka 2
        // variabel angka 1 dan angka 2 bertipe double karena method acsesor dari kelas
        // kalkulator
        // bertipe double
        double angka1 = input.getAngka1();
        double angka2 = input.getAngka2();

        // membuat variabel baru bertipe double variabel baru ini unutk mengakses method
        // yagn ada di kelas kalkulator
        // bertipe double karena di kelas kalkulator method ini di deklarasikan bertipe
        // double
        // dan memiliki nilai balikan double
        double penjumlahan = kalkulator.penjumlahan(angka1, angka2);

        double perkalian = kalkulator.perkalian(angka1, angka2);

        double pembagian = kalkulator.pembagian(angka1, angka2);

        double pengurangan = kalkulator.pengurangan(angka1, angka2);

        // menampilkan hasil perhitungan dari nilai yang di berikan
        System.out.println("-------------------------------");
        System.out.println("\tHasil Kalkulator");
        System.out.println("-------------------------------");
        System.out.println(angka1 + "\t" + "+" + "\t" + angka2 + "\t=" + String.format("%.1f", penjumlahan));
        System.out.println(angka1 + "\t" + "*" + "\t" + angka2 + "\t=" + String.format("%.1f", perkalian));
        System.out.println(angka1 + "\t" + ":" + "\t" + angka2 + "\t=" + String.format("%.1f", pembagian));
        System.out.println(angka1 + "\t" + "-" + "\t" + angka2 + "\t=" + String.format("%.1f", pengurangan));
        System.out.println("-------------------------------");

    }

}
