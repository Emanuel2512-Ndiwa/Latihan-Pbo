package modul_09;

//membuat kelas pegawai menjadi kelas abstrak 
//yang dimana di dlama program ini terdapat tida method abstrak dan ketika method ini akan di voeride oleh sub kelasnya agar jelas isi implementasi dari method abstrak ini
public abstract class pegawai {
    private int npp;
    private String nama;
    private double gajiPokok;

    public int getNpp() {
        return npp;
    }

    public void setNpp(int npp) {
        this.npp = npp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    abstract String getStatus();

    abstract double getTunjangan();

    abstract double hitungGaTot();

}
