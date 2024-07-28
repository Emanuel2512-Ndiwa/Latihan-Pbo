package UAS.UAS_PBO_123;

import java.util.ArrayList;
import java.util.List;

public class perawatan {
    public String idPerawatan;
    public pasien pasien;
    public karyawan kasir;
    public List<jasaTerapi> daftarTerapi;
    public List<jasaTerapi> jumlahTerapi;

    public perawatan(String idPerawatan, pasien pasien, karyawan kasir, List<jasaTerapi> daftarTerapi,
            List<jasaTerapi> jumlahTerapi) {
        this.idPerawatan = idPerawatan;
        this.pasien = pasien;
        this.kasir = kasir;
        this.daftarTerapi = daftarTerapi;
        this.jumlahTerapi = jumlahTerapi;
    }

    public String getIdPerawatan() {
        return idPerawatan;
    }

    public pasien getPasien() {
        return pasien;
    }

    public karyawan getKasir() {
        return kasir;
    }

    public List<jasaTerapi> getDaftarTerapi() {
        return daftarTerapi;
    }

    public List<jasaTerapi> getJumlahTerapi() {
        return jumlahTerapi;
    }

    public void addTerapi(jasaTerapi terapi) {
        daftarTerapi.add(terapi);

    }

    public void totalBiaya() {
        double total = 0;
        System.out.println(
                "----------------------------------------------------------------------------------------------------");
        for (int a = 0; a < daftarTerapi.size(); a++) {
            System.out.printf("%-30s %-20.2f%n", daftarTerapi.get(a).getJenisTerapi(), daftarTerapi.get(a).getTarif());

            total += daftarTerapi.get(a).getTarif();

        }
        System.out.println(
                "----------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\tTotal Biaya\t:" + "Rp" + total);

    }

}
