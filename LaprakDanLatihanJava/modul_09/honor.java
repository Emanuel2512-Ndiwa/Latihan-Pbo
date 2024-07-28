package modul_09;

public class honor extends pegawai implements email{

    private double lemburan;

    double getLembur() {
        return lemburan;
    }

    void setLembur(double myLembur) {
        lemburan = myLembur;
    }

    @Override
    double hitungGaTot() {
        return getGajiPokok() + lemburan;
    }

    @Override
    double getTunjangan() {
        return lemburan;
    }

    @Override
    String getStatus() {
        return "Honor";
    }
    @Override
    public String getEmail() {
        return "nip@honorer.usd.ac.id";
    }
}
