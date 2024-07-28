package modul_03;

public class SegitigaMain {
    public static void main(String[] args) {
        // membuat objek dari kelas Titik nama objeknya adalah A dan mengisi nilai
        // parameter dari kontruktor kelas Titik ini
        Titik A = new Titik(1, 2);

        // membuat objek dari kelas Titik nama objeknya adalah A dan mengisi nilai
        // parameter dari kontruktor kelas Titik ini
        Titik B = new Titik(7, 2);

        // membuat objek dari kelas Titik nama objeknya adalah A dan mengisi nilai
        // parameter dari kontruktor kelas Titik ini
        Titik C = new Titik(7, 9);

        //mem buat oobjek dari kelas segitiga dan mengisi nilai parameternya dari objek kelas Titik
        Segitiga seg1 = new Segitiga(A, B, C);

        //menampilkan hasil perhitungan luas segiitiga
        System.out.println();
        System.out.println("Luas Segitiga\t:" + seg1.hitungLuas());

    }
}
