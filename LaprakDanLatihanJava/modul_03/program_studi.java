package modul_03;

public class program_studi {
    // membuat variabel bertipe string
    private String kodeprodi;
    private String namaProdi;
    private ketua ketuaProdi;

    // membuat konstruktor programstudi
    public program_studi(String kodeprodi, String namaProdi, ketua ketuaProdi) {
        this.kodeprodi = kodeprodi;
        this.namaProdi = namaProdi;
        this.ketuaProdi = ketuaProdi;
    }
    // membuat method setkode prodi
    public void setKodeprodi(String kodeprodi) {
        this.kodeprodi = kodeprodi;
    }
    // membuat method setnamaprodi
    public void setNamaProdi(String namaProdi) {
        this.namaProdi = namaProdi;
    }
    // membuat method set ketua prodi
    public void setKetuaProdi(ketua ketuaProdi) {
        this.ketuaProdi = ketuaProdi;
    }
    //membuat method get kodeprodi
    public String getKodeprodi() {
        return kodeprodi;
    }

    // membuat method getnamaprodi
    public String getNamaProdi() {
        return namaProdi;
    }
    // membuat method getketuaprodi
    public ketua getKetuaProdi() {
        return ketuaProdi;
    }

}
