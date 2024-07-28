package modul_03;

//kelas segitiga 
public class Segitiga {

    // ini adalah atribut dari kelas segitiga
    // membuat variabel titik yang bertipe TITIK ini yang dinamakan komposisi
    // dalam program ini komposisi atau pembungkusan adalah sebuah kelas titik kita
    // gunakan atribut di ddalam kelas segitiga
    private Titik titikA, titikB, titikC;

    // membuat variabel sisi A,B,C yang bertipe double
    private double sisiA, sisiB, sisiC;
    // akses modifier atribut dari kelas ini semuanya adalah private

    public Segitiga(Titik titikA, Titik titikB, Titik titikC) {// constructor segitiga yang memiliki parameter bertipe
                                                               // TITIK
        this.titikA = titikA;
        this.titikB = titikB;
        this.titikC = titikC;
    }

    // method unutk menghitung sisi
    // method ini memiliki tipe data double yang artiinya ia juga akan
    // mengembalikan nilai bertipe double,method ini memiliki parameter tipe data
    // dari parameter ini adalah TITIk
    public double hitungSisi(Titik A, Titik B) {
        // membuat variabbel baru bertiipe integer
        int x1, y1, x2, y2;
        x1 = A.getX();
        // menyalin nilai yang ada di titik A ke variiabel x1
        // yang artinya value yang dimasukan ke dalam variabel A ini ,akan juga di
        // isikan ke dalam variabel x1

        y1 = A.getY();
        // menyalin nilai yang ada di titik A ke variiabel y1
        // yang artinya value yang dimasukan ke dalam variabel A ini ,akan juga di
        // isikan ke dalam variabel y1

        x2 = B.getX();
        // menyalin nilai yang ada di titik B ke variiabel x2
        // yang artinya value yang dimasukan ke dalam variabel A ini ,akan juga di
        // isikan ke dalam variabel x1

        y2 = B.getY();
        // menyalin nilai yang ada di titik B ke variiabel y2
        // yang artinya value yang dimasukan ke dalam variabel B ini ,akan juga di
        // isikan ke dalam variabel y2

        // mengembalikan nilai double dari hasil peprhitungan sisi menggunakan rumus
        // yang disediakan library java
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    // metthod unutk menghitung keliling
    // method ini memiliki tipe data double
    public double hitungKeliling() {
        // membuat variabel sisi A,B,C setiap variabel ini memiliki tipe data yang sama
        // yaitu double
        // variabel ini berfungsi unutk menyalin nilai dari hasil perhitungan dari
        // method hitung sisi
        // dan di simpan nilainya itu ke variabel ini

        double sisiA = hitungSisi(titikA, titikB);
        // hasil perhitungan dari method sisi nilainya juga di simpan di variabel sisiA

        double sisiB = hitungSisi(titikA, titikC);
        // hasil perhitungan dari method sisi nilainya juga di simpan di variabel sisiB

        double sisiC = hitungSisi(titikB, titikC);
        // hasil perhitungan dari method sisi nilainya juga di simpan di variabel sisiC

        // mengembalikan nilai double dari hasil perhitungan penjumlahan setiap sisi
        return (sisiA + sisiB + sisiC);
    }
    //methtod unutk menghitung luas 
    //method ini memiliki tipe data double 
    public double hitungLuas() {
        //membuat variabel baru unutk membuat perhitungan hitung keliling di bagi 2
        //nilai dari hasil perhitungan ini di simpan di variabel s yang nantinya variabel s ini 
        //bisa digunakan unutk perhitungan yang lainnya
        double s = hitungKeliling() / 2;

        //mengembalikan nilai double dari hasil perhitungan hitungluas menggunakan rumus yang sudah disediakan library java
        return Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));
    }
}
