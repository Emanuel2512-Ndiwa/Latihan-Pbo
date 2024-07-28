package UAS;

import java.util.Scanner;

public class kamarDeluxw extends Hotel {
    private boolean termasukSarapan;

    public kamarDeluxw(String nama, String lokasi, double harga, boolean termasukSarapan) {
        super(nama, lokasi, harga);
        this.termasukSarapan = termasukSarapan;

    }

    @Override
    public void inisialisasiHotel() {
        setKetersediaan(0, false);
        setKetersediaan(1, false);
        setKetersediaan(2, false);
        setKetersediaan(3, false);
        setKetersediaan(4, false);
        setKetersediaan(5, false);
        setKetersediaan(6, false);
    }

    @Override
    public void tampilkanDetail() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\tHotel Budget\t: " + getNamaHotel() + ",\tLokasi\t: " + lokasi + ",\tHarga per Malam\t: " + harga
                + ",\tTermasuk Sarapan\t: " + termasukSarapan);
    }

    @Override
    public void pesan(AplikasiPemesananHotel aplikasi, Scanner masuk) {
        System.out.println("Lengkapi Data Diri Anda");
        System.out.println("Nama\t:");
        setNamatamu(masuk.nextLine());
        System.out.println("Nik \t:");
        setNikKtp(masuk.nextLine());
        System.out.println("Alamat (Sesuai Ktp)\t:");
        setAlamat(masuk.nextLine());
        System.out.println("Nomor Hp\t:");
        setNomorHp(masuk.nextLine());

    }

}
