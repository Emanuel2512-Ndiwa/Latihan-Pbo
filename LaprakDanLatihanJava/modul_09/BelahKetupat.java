package modul_09;

public class BelahKetupat extends BangunDatar {
    double d1, d2, sisi1, sisi2, sisi3;
    

    public BelahKetupat(double d1, double d2, double sisi1, double sisi2, double sisi3) {
        this.d1 = d1;
        this.d2 = d2;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    @Override
    double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }

    @Override
    double hitungLuas() {
        return 1 / 2 * d1 * 1 / 2 * d2;
    }

}
