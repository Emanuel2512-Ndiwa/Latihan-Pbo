package modul_09;

public class pemasaran extends pegawai implements email {
    private double bonus;

    double getBonus() {
        return bonus;
    }

    void setBonus(double myBonus) {
        bonus = myBonus;
    }

    @Override
    double hitungGaTot() {
        return getGajiPokok() + bonus;
    }

    @Override
    double getTunjangan() {
        return bonus;
    }

    @Override
    String getStatus() {
        return "Pemasaran";
    }

    @Override
    public String getEmail() {
        return "nip@marketing.usd.ac.id";

    }

}
