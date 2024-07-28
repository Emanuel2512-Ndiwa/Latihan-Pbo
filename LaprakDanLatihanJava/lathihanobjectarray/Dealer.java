package lathihanobjectarray;
public class Dealer {
    private String namadealer;
    private String namaalamat;
    private String pemilik;
    private String npwp;
    private  mobil[] daftar;
    public Dealer(mobil[] daftar) {
        this.daftar = daftar;
    }
    public void setDaftar(mobil[] daftar) {
        this.daftar = daftar;
    }
    public mobil[] getDaftar() {
        return daftar;
    }
    public String getNamadealer() {
        return namadealer;
    }
    public void setNamadealer(String namadealer) {
        this.namadealer = namadealer;
    }
    public String getNamaalamat() {
        return namaalamat;
    }
    public void setNamaalamat(String namaalamat) {
        this.namaalamat = namaalamat;
    }
    public String getPemilik() {
        return pemilik;
    }
    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }
    public String getNpwp() {
        return npwp;
    }
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }
   
   
   
    
}
