package Modul_02.lathianmembuatclassdanobject;

public class Fakultas_saintek {
    private String kodeprodi;
    private String namaProdi;

    //deklarasi sebuah variabel bernama kaprodi bertipe dosen 
    //dan memiliki aksesibilitas private
    //ini adalah variabel instance 
    private ketuaprodi ketuaProdi;

    public void setKodeprodi(String kodeprodi) {
        this.kodeprodi = kodeprodi;
    }

    public void setNamaProdi(String namaProdi) {
        this.namaProdi = namaProdi;
    }

    public void setKetuaProdi(ketuaprodi ketuaProdi) {
        this.ketuaProdi = ketuaProdi;
    }

    public String getKodeprodi() {
        return kodeprodi;
    }

    public String getNamaProdi() {
        return namaProdi;
    }

    public ketuaprodi getKetuaProdi() {
        return ketuaProdi;
    }

    Fakultas_saintek(String kodeprodi, String namaProdi, ketuaprodi ketuaProdi) {
        this.kodeprodi = kodeprodi;
        this.namaProdi = namaProdi;
        this.ketuaProdi = ketuaProdi;
    }

}
