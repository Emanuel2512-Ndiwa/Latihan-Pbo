package UAS;

import java.util.Scanner;

public interface fitur {
   public  void pesan(AplikasiPemesananHotel p ,Scanner m);

    String[] Hari_Dalam_Seminggu = { "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu" };

    default void tampilkanKetersediaanDefult() {
        System.out.println("Ketersediaan Defult Unutk Hari-Hari");
        for (String hari : Hari_Dalam_Seminggu) {
            System.out.println(hari + ": Tersedia");
        }
    }
    public void inisialisasiHotel();

    static void tampilkanHari() {
        for (String hari : Hari_Dalam_Seminggu) {
            System.out.println(hari);
        }
    }


}
