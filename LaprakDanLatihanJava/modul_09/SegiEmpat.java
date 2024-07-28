package modul_09;

// Kelas untuk segi empat
class SegiEmpat extends BangunDatar {
    double panjang;
    double lebar;

    public SegiEmpat() {
    }

    SegiEmpat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    double hitungLuas() {
        return panjang * lebar;
    }
}
