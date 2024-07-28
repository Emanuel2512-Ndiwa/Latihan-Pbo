package javaRegex;
import java.util.regex.*;
import java.util.Scanner;

public class HotelBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input pengguna
        System.out.println("Masukkan Nama:");
        String name = scanner.nextLine();

        System.out.println("Masukkan Email:");
        String email = scanner.nextLine();

        System.out.println("Masukkan Nomor Telepon:");
        String phone = scanner.nextLine();

        System.out.println("Masukkan Tanggal Pemesanan (format: yyyy-mm-dd):");
        String date = scanner.nextLine();

        // Validasi email
        boolean isEmailValid = Pattern.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", email);

        // Validasi nomor telepon (hanya angka, minimal 10 digit)
        boolean isPhoneValid = Pattern.matches("^\\d{10,}$", phone);

        // Validasi tanggal (format sederhana: yyyy-mm-dd)
        boolean isDateValid = Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$", date);

        if (isEmailValid && isPhoneValid && isDateValid) {
            System.out.println("Pemesanan Berhasil!");
            System.out.println("Nama: " + name);
            System.out.println("Email: " + email);
            System.out.println("Nomor Telepon: " + phone);
            System.out.println("Tanggal Pemesanan: " + date);
        } else {
            System.out.println("Pemesanan Gagal. Silakan periksa kembali input Anda:");
            if (!isEmailValid) {
                System.out.println("Email tidak valid.");
            }
            if (!isPhoneValid) {
                System.out.println("Nomor telepon tidak valid.");
            }
            if (!isDateValid) {
                System.out.println("Tanggal pemesanan tidak valid.");
            }
        }

        scanner.close();
    }
}
