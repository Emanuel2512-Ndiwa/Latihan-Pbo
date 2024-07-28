package UAS.UAS_PBO_123;

public class terapis {
    public String sertifikatTerapis;

    public String namaKaryawan;

    public terapis(String sertifikatTerapis, String namaKaryawan) {
        this.sertifikatTerapis = sertifikatTerapis;
        this.namaKaryawan = namaKaryawan;
    }

    public String getSertifikatTerapis() {
        return sertifikatTerapis;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    @Override
    public String toString() {
        return getNamaKaryawan() + "\n" + "Setifikat\t:"+"\n" + getSertifikatTerapis();
    }

}
