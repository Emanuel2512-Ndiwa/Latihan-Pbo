package UAS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplikasiPemesananHotel {
    public List<Hotel> daftarHotel;
    Scanner m = new Scanner(System.in);

    public AplikasiPemesananHotel() {
        daftarHotel = new ArrayList<>();
    }

    public void tambahHotel(Hotel hotel) {
        daftarHotel.add(hotel);
    }

    public void tampilkanHotel() {
        for (Hotel hotel : daftarHotel) {
            hotel.tampilkanDetail();
        }
    }

    public void pesanHotel(String nama, String hari) {
        int indexHari = getIndexHari(hari);
        if (indexHari == -1) {
            System.out.println("Hari tidak valid.");
            return;
        }

        for (Hotel hotel : daftarHotel) {
            if (hotel.namaHotel.equalsIgnoreCase(nama)) {
                if (hotel.cekKetersediaan(indexHari)) {
                    hotel.pesan(this, m);
                } else {
                    System.out.println("Hotel " + nama + " tidak tersedia pada hari " + hari + ".");
                }
                return;
            }
        }
        System.out.println("Hotel tidak ditemukan.");
    }

    public void tampilkanKetersediaanHotel(String nama) {
        for (Hotel hotel : daftarHotel) {
            if (hotel.namaHotel.equalsIgnoreCase(nama)) {
                hotel.tampilkanKetersediaan();
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

    public List<Hotel> getDaftarHotel() {
        return daftarHotel;
    }
}
