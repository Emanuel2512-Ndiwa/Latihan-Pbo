package UAS.UAS_PBO_123;

import java.text.DecimalFormat;

public class jasaTerapi {
    public String jenisTerapi;
    public double tarif;
    public terapis terapi;

    public jasaTerapi(String jenisTerapi, double tarif, terapis terapi) {
        this.jenisTerapi = jenisTerapi;
        this.tarif = tarif;
        this.terapi = terapi;
    }

    public String getJenisTerapi() {
        return jenisTerapi;
    }

    public double getTarif() {
        return tarif;
    }

    public terapis getTerapi() {
        return terapi;
    }

    @Override
    public String toString() {
        return String.format(
                "\nJenis Terapi:\n%s\nTarif Setiap Kali Konsultasi:\nRp %,d\nAhli Terapi:\n%s\n",
                getJenisTerapi(),
                (long) getTarif(), // Konversi ke long untuk menghindari format desimal jika tidak diperlukan
                getTerapi());

    }
}
