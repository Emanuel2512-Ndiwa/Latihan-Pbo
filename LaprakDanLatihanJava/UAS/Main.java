package UAS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        AplikasiPemesananHotel aplikasi = new AplikasiPemesananHotel();
        

        System.out.println("============ Selamat Datang Di Aplikasi Pemesanan Hotel ================");
        System.out.println();

        System.out.print("Apakah Anda Ingin Memeriksa Ketersediaan Kamar (Ya/Tidak): ");
        String jawab = masuk.nextLine();
        if (jawab.equalsIgnoreCase("Ya")) {
            aplikasi.tampilkanHotel();
            System.out.println();
        }

        System.out.print("Apakah Anda Ingin Memesan Kamar (Ya/Tidak): ");
        jawab = masuk.nextLine();
        if (jawab.equalsIgnoreCase("Ya")) {
            pesanKamar(aplikasi, masuk);
        } else {
            System.out.println("Terima kasih ....");
        }

        masuk.close();
    }

    private static void pesanKamar(AplikasiPemesananHotel aplikasi, Scanner masuk) {
        System.out.print("Berapa Orang Yang Ingin Memesan Kamar: ");
        int jumlahOrang = masuk.nextInt();
        masuk.nextLine(); // consume newline character
        Hotel[] simpanDataHotel = new Hotel[jumlahOrang];
        String pilih;
        String nama, nik, alamat, umur, ttl, nomor;

        // Memilih kategori hotel
        do {
            System.out.print("Pilihlah Kategori Hotel Berikut: ");
            System.out.println();
            System.out.println("===========================================");
            System.out.println("""
                    1. Vip
                    2. Deluxe
                    3. Superior
                    """);
            System.out.print("Pilihan: ");
            pilih = masuk.nextLine();

            if (!pilih.equalsIgnoreCase("Vip") && !pilih.equalsIgnoreCase("Deluxe")
                    && !pilih.equalsIgnoreCase("Superior")) {
                System.out.println("Pilihan Anda Salah, Silahkan Masukan Ulang");
            }
        } while (!pilih.equalsIgnoreCase("Vip") && !pilih.equalsIgnoreCase("Deluxe")
                && !pilih.equalsIgnoreCase("Superior"));

        // Memasukkan data untuk setiap orang
        for (int a = 0; a < simpanDataHotel.length; a++) {
            System.out.println();
            System.out.print("Masukan Nama Anda: ");
            nama = masuk.nextLine();
            System.out.print("Masukan Nik: ");
            nik = masuk.nextLine();
            System.out.print("Masukan Tempat-Tanggal Lahir: ");
            ttl = masuk.nextLine();
            System.out.print("Alamat: ");
            alamat = masuk.nextLine();
            System.out.print("Nomor Hp: ");
            nomor = masuk.nextLine();
            System.out.println();

            // Buat objek Hotel baru sesuai kategori yang dipilih
            Hotel hotel = null;
            if (pilih.equalsIgnoreCase("Vip")) {
                hotel = new kamarVVip("VVIP Hotel", "Lokasi", 1500000, new String[]{"Spa", "Kolam Renang", "Bar"});
            } else if (pilih.equalsIgnoreCase("Deluxe")) {
                hotel = new kamarDeluxw("Deluxe Hotel", "Lokasi", 1000000, true);
            } else if (pilih.equalsIgnoreCase("Superior")) {
                hotel = new kamarSuperior("Superior Hotel", "Lokasi", 750000);
            }

            // Simpan data hotel ke dalam array
            simpanDataHotel[a] = hotel;

            // Tambahkan ke aplikasi pemesanan hotel
            aplikasi.tambahHotel(hotel);
        }

        System.out.println("Pemesanan selesai. Terima kasih!");
    }
}
