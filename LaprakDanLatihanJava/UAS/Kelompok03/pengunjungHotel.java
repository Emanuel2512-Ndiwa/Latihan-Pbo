package UAS.Kelompok03;

public class pengunjungHotel {
    public String namaTamu;
    public String ttl;
    public int nik;
    public String alamatTinggalSaatIni;
    public int nomorHp;
    public pengunjungHotel(String namaTamu, String ttl, int nik, String alamatTinggalSaatIni, int nomorHp) {
        this.namaTamu = namaTamu;
        this.ttl = ttl;
        this.nik = nik;
        this.alamatTinggalSaatIni = alamatTinggalSaatIni;
        this.nomorHp = nomorHp;
    }
    public String getNamaTamu() {
        return namaTamu;
    }
    public String getTtl() {
        return ttl;
    }
    public int getNik() {
        return nik;
    }
    public String getAlamatTinggalSaatIni() {
        return alamatTinggalSaatIni;
    }
    public int getNomorHp() {
        return nomorHp;
    }
    
    
}
