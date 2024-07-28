package UAS.Kelompok03;

public class kamarVip extends Hotel {
    private String[]fasilitas;


    public kamarVip(String namaKamar, String lokasi, double harga, String[] fasilitas ) {
        super(namaKamar, lokasi, harga);
    }

    @Override
    public void tampilKetersediaan() {
        System.out.println("------------- Hotel -------------");
        System.out.println("Nama Kamar    \t:" + getNamaHotel());
        System.out.println("Lokasi        \t:" + getLokasi());
        System.out.println("Harga         \t:" + getHarga());
        System.out.println("----------------------------------");
        System.out.println("Fasilitas   \t:"+getFasilitas() );
    }
    
    @Override
    public void inisiasiKetersediaan() {
        for (int i = 0; i < ketersediaanKamar.length; i++) {
            ketersediaanKamar[i] = true;
        }
    }

    public String[] getFasilitas() {
        return fasilitas;
    }

}
