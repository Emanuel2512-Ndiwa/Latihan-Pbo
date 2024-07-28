package UAS;
import java.util.*;

public abstract class Hotel implements fitur {
    Scanner masuk = new Scanner (System.in);
    protected String namaHotel;
    protected String lokasi;
    protected double harga;
    protected String namatamu, nikKtp, Ttl, Umur, Alamat, NomorHp;
    protected boolean[] ketersediaanKamar;

    public Hotel(String nama, String lokasi, double harga) {
        this.namaHotel = nama;
        this.lokasi = lokasi;
        this.harga = harga;
        this.ketersediaanKamar = new boolean[7];
    }

    public Hotel(String namatamu, String nikKtp, String ttl, String umur, String alamat, String nomorHp) {
        this.namatamu = namatamu;
        this.nikKtp = nikKtp;
        Ttl = ttl;
        Umur = umur;
        Alamat = alamat;
        NomorHp = nomorHp;
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

    public String getNamatamu() {
        return namatamu;
    }

    public String getNikKtp() {
        return nikKtp;
    }

    public String getTtl() {
        return Ttl;
    }

    public String getUmur() {
        return Umur;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getNomorHp() {
        return NomorHp;
    }

    public boolean[] getKetersediaanKamar() {
        return ketersediaanKamar;
    }

    public void setNamatamu(String namatamu) {
        this.namatamu = namatamu;
    }

    public void setNikKtp(String nikKtp) {
        this.nikKtp = nikKtp;
    }

    public void setTtl(String ttl) {
        Ttl = ttl;
    }

    public void setUmur(String umur) {
        Umur = umur;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public void setNomorHp(String nomorHp) {
        NomorHp = nomorHp;
    }

    public abstract void tampilkanDetail();


    public void setKetersediaan(int hari, boolean tersedia) {
        if (hari >= 0 && hari < 7) {
            ketersediaanKamar[hari] = tersedia;
        }
    }

    @Override
    public void tampilkanKetersediaanDefult() {
        for (int i = 0; i < ketersediaanKamar.length; i++) {
            System.out.println(fitur.Hari_Dalam_Seminggu[i] + ": " + ketersediaanKamar[i]);
        }
    }

    public void tampilkanKetersediaan() {
        System.out.println("Ketersediaan kamar di " + namaHotel + ":");
        for (int i = 0; i < 7; i++) {
            System.out.println("Hari: " + fitur.Hari_Dalam_Seminggu[i] + ", Tersedia: " + ketersediaanKamar[i]);
        }
    }

    public boolean cekKetersediaan(int hari) {
        if (hari >= 0 && hari < 7) {
            return ketersediaanKamar[hari];
        }
        return false;
    }
    @Override
    public void pesan (AplikasiPemesananHotel aplikasi ,Scanner masuk){
        



    }

    

}
