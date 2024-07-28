package UAS.Kelompok03;

import java.util.List;

public abstract class Hotel implements fitur {
    protected String namaHotel;
    protected String lokasi;
    protected double harga;
    protected List<pengunjungHotel> tamu;
    protected boolean[] ketersediaanKamar;
    protected String[] hari = { "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu" };

    public Hotel(String namaHotel, String lokasi, double harga) {
        this.namaHotel = namaHotel;
        this.lokasi = lokasi;
        this.harga = harga;
        this.ketersediaanKamar = new boolean[7];
    }

    public String getNamaHotel() {
        return namaHotel;
    }

    public String getLokasi() {
        return lokasi;
    }

    public double getHarga() {
        return harga;
    }

    public boolean[] getKetersediaanKamar() {
        return ketersediaanKamar;
    }

    public String[] getHari() {
        return hari;
    }

    @Override
    public void tampilKetersediaan() {
        System.out.println("Ketersediaan Kamar");
        System.out.println("Nama Kamar\t:" + namaHotel);
        System.out.println("----------------------------------");
        System.out.println("Hari");
        for (int a = 0; a < 7; a++) {
            System.out.print("\t:" + getHari()[a] + "\t:" + getKetersediaanKamar()[a]);

        }

    }

    @Override
    public void setKetersediaan(int hari, boolean tersedia) {
        if (hari >= 0 && hari < 7) {
            ketersediaanKamar[hari] = tersedia;
        }
    }

    @Override
    public boolean cekKetersediaan(int hari) {
        if (hari >= 0 && hari < 7) {
            return ketersediaanKamar[hari];
        }
        return false;
    }
    
    
    
     public List<pengunjungHotel> getTamu() {
        return tamu;
    }

    public void setTamu(List<pengunjungHotel> tamu) {
        this.tamu = tamu;
    }

    abstract public  void inisiasiKetersediaan();
    

}
