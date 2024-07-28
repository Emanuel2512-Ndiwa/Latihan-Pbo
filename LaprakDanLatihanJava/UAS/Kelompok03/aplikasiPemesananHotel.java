package UAS.Kelompok03;

import java.util.ArrayList;
import java.util.List;

public class aplikasiPemesananHotel {
    public List<Hotel> daftarHotel;

    public aplikasiPemesananHotel() {
        daftarHotel = new ArrayList<>();
    }

    public void tambahHotel(Hotel Hotel) {
        daftarHotel.add(Hotel);
    }

    public List<Hotel> getDaftarHotel() {
        return daftarHotel;
    }

    public void pesanKamar(String nama, String hari) {
        int indexHari = getIndexHari(hari);
        if (indexHari == -1) {
            System.out.println("Hari tidak valid.");
            return;
        }
        for (Hotel hotel : daftarHotel) {
            if (hotel.getNamaHotel() == nama) {
                if (hotel.cekKetersediaan(indexHari)) {
                    pesanKamar(nama, hari);
                } else {
                    System.out.println("Hotel " + nama + " tidak tersedia pada hari " + hari + ".");
                }
                return;
            }
        }
        System.out.println("Hotel tidak ditemukan.");

    }

    private int getIndexHari(String hari) {
        switch (hari.toLowerCase()) {
            case "senin":
                return 0;
            case "selasa":
                return 1;
            case "rabu":
                return 2;
            case "kamis":
                return 3;
            case "jumat":
                return 4;
            case "sabtu":
                return 5;
            case "minggu":
                return 6;
            default:
                return -1;
        }
    }

    public void tampilKetersediaanKamar() {
        for (Hotel Hotel : daftarHotel) {

            Hotel.tampilKetersediaan();

        }

    }
}
