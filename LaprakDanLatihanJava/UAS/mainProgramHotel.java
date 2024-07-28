package UAS;

import java.util.Scanner;

public class mainProgramHotel {
    public static void main(String[] args) {

        AplikasiPemesananHotel aplikasi = new AplikasiPemesananHotel();
        Scanner scanner = new Scanner(System.in);
        Hotel[] h = new Hotel[10];
        System.out.println("Pilih Jenis Kamar Untuk Memperbaharui Data kamar ");
        String j = scanner.nextLine();
        // for (int a = 0; a < h.length; a++) {
            // if (j.equalsIgnoreCase("Kamar Deluxe")) {
                // h[a] = new kamarDeluxw("Kamar Deluxe1", "Maguwoharjo", 500000, true);
                // h[a] = new kamarDeluxw("Kamar Deluxe2", "Bantul", 450000, true);
                // h[a] = new kamarDeluxw("Kamar Deluxe1", "Jakarta", 500000, true);
            // }

        

        // Menambahkan hotel-hotel ke dalam aplikasi
        kamarDeluxw hotelDeluxe = new kamarDeluxw("Kamar Deluxe1", "Maguwoharjo", 500000, true);
        kamarDeluxw hotelDeluxe2 = new kamarDeluxw("Kamar Deluxe2", "Bantul", 450000, true);
        kamarDeluxw hotelDeluxe3 = new kamarDeluxw("Kamar Deluxe1", "Jakarta", 500000, true);
        kamarSuperior hotelSuperior = new kamarSuperior("Superior Lodge", "Bandung", 400000);
        kamarVVip hotelVVip = new kamarVVip("VIP Palace", "Bali", 2000000,
                new String[] { "Kolam Renang", "Spa", "Gym" });
// 
        // aplikasi.tambahHotel(hotelDeluxe);
        // aplikasi.tambahHotel(hotelDeluxe2);
        // aplikasi.tambahHotel(hotelDeluxe3);
        aplikasi.tambahHotel(hotelSuperior);
        aplikasi.tambahHotel(hotelVVip);

        // Menampilkan daftar hotel
        System.out.println("Berikut Daftar Hotel Tersedia:");
        aplikasi.tampilkanHotel();

        // Memesan
        System.out.println("Apakah Ada Kamar Yang Ingin Di Pesan");
        System.out.println();
        System.out.println("Jawam(YA / TIDAK)");
        String jawab = scanner.nextLine();
        if (jawab.equalsIgnoreCase("YA")) {
            System.out.println();
            System.out.print("\nMasukkan nama hotel yang ingin dipesan\t:");
            String namaHotel = scanner.nextLine();
            hotelDeluxe.setKetersediaan(0, true);
            hotelDeluxe.setKetersediaan(1, true);
            hotelDeluxe.setKetersediaan(2, true);
            hotelDeluxe.setKetersediaan(3, true);
            System.out.println("\nMasukkan nama hotel untuk melihat ketersediaan Kamar Di Hari Tertentu:");
            namaHotel = scanner.nextLine();
            aplikasi.tampilkanKetersediaanHotel(namaHotel);
            System.out.println("Masukkan hari (Senin-Minggu) untuk pemesanan:");
            String hari = scanner.nextLine();
            aplikasi.pesanHotel(namaHotel, hari);
        } else {
            System.out.println("Terimakasih");
        }
    }
}
