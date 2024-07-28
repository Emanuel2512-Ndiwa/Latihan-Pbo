package UAS.Kelompok03;

public class kamarDeluxe extends Hotel {
    private boolean termasukSarapan = true;

    public kamarDeluxe(String namaKamar, String lokasi, double hargaKamar) {
        super(namaKamar, lokasi, hargaKamar);
    }

    @Override
    public void tampilKetersediaan() {
        System.out.println("------------- Hotel -------------");
        System.out.println("Nama Kamar    \t:" + getNamaHotel());
        System.out.println("Lokasi        \t:" + getLokasi());
        System.out.println("Harga         \t:" + getHarga());
        System.out.println("----------------------------------");
        System.out.println("Fasilitas     \tTermasuk Sarapan\t:" + termasukSarapan);
    }
    @Override
    public void inisiasiKetersediaan() {
        for (int i = 0; i < ketersediaanKamar.length; i++) {
            ketersediaanKamar[i] = true;
        }
    }
}
