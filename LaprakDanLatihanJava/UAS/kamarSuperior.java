package UAS;

import java.util.Scanner;

public class kamarSuperior extends Hotel {

    public kamarSuperior(String nama, String lokasi, double harga) {
        super(nama, lokasi, harga);

    }

    @Override
    public void inisialisasiHotel() {
        setKetersediaan(0, true);
        setKetersediaan(1, true);
        setKetersediaan(2, true);
        setKetersediaan(3, true);
        setKetersediaan(4, true);
        setKetersediaan(5, true);
        setKetersediaan(6, true);
    }

    @Override
    public void tampilkanDetail() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\tHotel Budget \t: " + getNamaHotel() + ",\tLokasi\t: " + lokasi + ",\tHarga per Malam\t: " + harga);
    }

    @Override
    public void pesan(AplikasiPemesananHotel aplikasi, Scanner masuk) {
        System.out.println("Masukkan nama Anda:");
        setNamatamu(masuk.nextLine());
        // tambahkan logika pesanan di sini
    }

}
