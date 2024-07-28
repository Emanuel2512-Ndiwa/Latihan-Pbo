package UTS1_PBO;

public class Pegawai {
    private int noPegawai;
    private String nama;
    private String alamat;
    
    public Pegawai(int noPegawai, String nama) {
        this.noPegawai = noPegawai;
        this.nama = nama;
    }
    

    public Pegawai() {
    }


    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNoPegawai() {
        return noPegawai;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
    
    
}
