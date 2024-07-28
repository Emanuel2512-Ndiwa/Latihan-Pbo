package modul_09;

class Lingkaran extends BangunDatar {
    double jariJari;

    public Lingkaran() {
    }

    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    @Override
    double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}