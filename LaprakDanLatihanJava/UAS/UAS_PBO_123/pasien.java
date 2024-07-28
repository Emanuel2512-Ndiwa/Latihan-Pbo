package UAS.UAS_PBO_123;

public class pasien {
    public String idPasien;
    public String namaPasien;
    public String alamat;
    public pasien(){
        
    }

    public pasien(String idPasien, String namaPasien, String alamat) {
        this.idPasien = idPasien;
        this.namaPasien = namaPasien;
        this.alamat = alamat;
    }

    public String getIdPasien() {
        return idPasien;
    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public String getAlamat() {
        return alamat;
    }

}
