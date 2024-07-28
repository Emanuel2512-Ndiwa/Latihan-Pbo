package UAS;

import java.util.Scanner;

public class kamarVVip extends Hotel {
    String[] fasilitas;

    public kamarVVip(String nama, String lokasi, double harga, String[] fasilitas) {
        super(nama, lokasi, harga);
        this.fasilitas = fasilitas;
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
        System.out.print("\tHotel Mewah\t: " + getNamaHotel() + ",\tLokasi\t: " + lokasi + ",\tHarga per Malam\t: " + harga
                + ",\tFasilitas\t: ");
        
        for (String fasilitas : fasilitas) {
            System.out.print(fasilitas + "\t");
        }
        System.out.println();
    }

    @Override
    public void pesan(AplikasiPemesananHotel aplikasi, Scanner masuk) {
        System.out.println("Masukkan nama Anda:");
        setNamatamu(masuk.nextLine());
    }

}
