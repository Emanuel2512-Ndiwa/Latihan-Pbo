package UAS.Kelompok03;


import java.util.Scanner;

public class implementasiKelas {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        aplikasiPemesananHotel aplikasi = new aplikasiPemesananHotel();
        Hotel[] h = new Hotel[3];
        pengunjungHotel[] t = new pengunjungHotel[4];
        for (int a = 0; a < h.length; a++) {
            
        }

        // Menambahkan hotel ke dalam aplikasi
        aplikasi.tambahHotel(new kamarDeluxe("Deluxe Hotel", "Jakarta", 1000000));
        aplikasi.tambahHotel(new kamarSuperior("Superior Hotel", "Bandung", 750000));
        aplikasi.tambahHotel(new kamarVip("VIP Hotel", "Bali", 1500000,
                new String[] { "Free Wifi", "Kolam Renang", "Bar", "Paket Lengkap Makan(Pagi,Siang,Malam)" }));

        System.out.println("============ Selamat Datang Di Aplikasi Pemesanan Hotel ======");
        System.out.println();
        System.out.print("Apakah Anda Ingin Memeriksa Ketersediaan Kamar (Ya/Tidak): ");
        String jawab = masuk.nextLine();
        if (jawab.equalsIgnoreCase("Ya")) {
            aplikasi.tampilKetersediaanKamar();
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

    private static void pesanKamar(aplikasiPemesananHotel aplikasi, Scanner masuk) {
        System.out.print("Berapa Orang Yang Ingin Memesan Kamar: ");
        int jumlahOrang = masuk.nextInt();
        masuk.nextLine(); // consume newline character

        for (int i = 0; i < jumlahOrang; i++) {
            System.out.println("\nLengkapi Data Diri Anda");
            System.out.print("Nama                      \t: ");
            String nama = masuk.nextLine();
            System.out.print("Tempat, Tanggal Lahir     \t: ");
            String ttl = masuk.nextLine();
            System.out.print("Alamat Saat Ini           \t: ");
            String alamat = masuk.nextLine();
            System.out.print("Nomor Induk Kependudukan  \t: ");
            int nik = masuk.nextInt();
            System.out.print("Nomor Hp                  \t: ");
            int nomorHp = masuk.nextInt();
            masuk.nextLine(); // consume newline character

            pengunjungHotel pengunjung = new pengunjungHotel(nama, ttl, nik, alamat, nomorHp);

            // Memilih kategori hotel
            String pilih;
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

            // Memilih hari
            System.out.print("Masukkan hari (Senin/Minggu): ");
            String hari = masuk.nextLine();

            // Pesan kamar berdasarkan kategori dan hari yang dipilih
            aplikasi.pesanKamar(pilih, hari);
        }
    }
}
