package UAS.Kelompok03;

public class kamarSuperior extends Hotel {
    private boolean termasukWifi = true;

    public kamarSuperior(String namaKamar, String lokasiHotel, double Harga) {
        super(namaKamar, lokasiHotel, Harga);

    }

    public boolean isTermasukWifi() {
        return termasukWifi;
    }

    @Override
    public  void tampilKetersediaan(){
        System.out.println("------------- Hotel -------------");
        System.out.println("Nama Kamar    \t:"+getNamaHotel());
        System.out.println("Lokasi        \t:"+getLokasi());
        System.out.println("Harga         \t:"+getHarga());
        System.out.println("----------------------------------");
        System.out.println("Fasilitas     \t:Free Wifi\t:"+termasukWifi);

    }
    @Override
    public void inisiasiKetersediaan() {
        for (int i = 0; i < ketersediaanKamar.length; i++) {
            ketersediaanKamar[i] = true;
        }
    }

}
