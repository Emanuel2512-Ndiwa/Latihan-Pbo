package UAS.UAS_PBO_123;

public class karyawan {
    public String nik;
    public String nama;
    public String Alamat;
    public String NoHp;
    public karyawan (){
        
    }
    public karyawan(String nik, String nama, String alamat, String noHp) {
        this.nik = nik;
        this.nama = nama;
        Alamat = alamat;
        NoHp = noHp;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getNoHp() {
        return NoHp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Id Karyawan\t\t: %s\n", getNik()));
        sb.append(String.format("Nama\t\t\t: %s\n", getNama()));
        sb.append(String.format("Nomor Hp\t\t: %s\n", getNoHp()));
        sb.append(String.format("Alamat\t\t\t: %s\n", getAlamat()));
        return sb.toString();
    }

}
