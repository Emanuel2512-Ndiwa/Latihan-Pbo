package modul_09;

public class manajer extends pegawai implements email {
    private double tunjanganJabatan, lemburan;

    double getTunJab() {
        return tunjanganJabatan;
    }

    double getLembur() {
        return lemburan;
    }

    void setTunJab(double honJab) {
        tunjanganJabatan = honJab;
    }

    void setLembur(double overtime) {
        lemburan = overtime;
    }

    @Override
    double hitungGaTot() {
        return getGajiPokok() + tunjanganJabatan + lemburan;
    }

    @Override
    double getTunjangan() {
        return tunjanganJabatan + lemburan;
    }

    @Override
    String getStatus() {
        return "Manajer";
    }

    @Override
    public String getEmail() {
        return "nip@manajer.usd.ac.id";
    }
}
