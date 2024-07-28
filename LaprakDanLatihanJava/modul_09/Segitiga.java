package modul_09;
// Kelas untuk segitiga
class Segitiga extends BangunDatar {
    double sisi1;
    double sisi2;
    double sisi3;

    Segitiga(double sisi1, double sisi2, double sisi3) {
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
        // Menggunakan rumus Heron
        double s = (sisi1 + sisi2 + sisi3) / 2;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }
}
