package Modul_02;

public class S_EGITIG_A {
    // atribut dari kelas S_EGITI_A dengan tipe datanya double
    // unutk atribut ini acsess modifiernya adlaah private
    private double x1, y1, x2, y2, x3, y3;

    // constructor dari kelas S_EGITI_A
    // contruktor ini memiliki parameter dan tipe data dari parameternya adlaah
    // double
    public S_EGITIG_A(double x1, double y1, double x2, double y2, double x3, double y3) {
        // nilai dari parameter contruktor ini kemudian di terima juga oleh atribut
        // unutk mencegah shadowing variabel atau komputer kebingungan membaca variabel
        // mana yang akan di akses
        // di siini kita menggunakan kata kunci this
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    //didalam kelas ini kita menggunakan method acsesor dan mutator dengan tujuan agar terhindar dari 
    //orang yang tidak berhak untuk merubah nilai ataupun fungsi yang kita buat dari atribut yang kita punya
    //jika mereka ingin merubah mereka harus memiliki ijin dan ijin ini dijembantani menggunakan akses mutator(set) unutk mengubah nilai
    //dan unutk mengakses nilai ini menggunakan acsesor (get)

    // ini adalah method mutator
    // method ini memiliki parameter yang bertipe double
    public void setX1(double x1) {
        this.x1 = x1;
    }

    // ini adalah method mutator
    // method ini memiliki parameter yang bertipe double
    public void setY1(double y1) {
        this.y1 = y1;
    }

    // ini adalah method mutator
    // method ini memiliki parameter yang bertipe double
    public void setX2(double x2) {
        this.x2 = x2;
    }

    // ini adalah method mutator
    // method ini memiliki parameter yang bertipe double
    public void setY2(double y2) {
        this.y2 = y2;
    }

    // ini adalah method mutator
    // method ini memiliki parameter yang bertipe double
    public void setX3(double x3) {
        this.x3 = x3;
    }

    // ini adalah method mutator
    // method ini memiliki parameter yang bertipe double
    public void setY3(double y3) {
        this.y3 = y3;
    }

    // ini adalah method acsesor
    // method ini meiliki nilai balikan yang bertipe double
    public double getX1() {
        return x1;
    }

    // ini adalah method acsesor
    // method ini meiliki nilai balikan yang bertipe double
    public double getY1() {
        return y1;
    }

    // ini adalah method acsesor
    // method ini meiliki nilai balikan yang bertipe double
    public double getX2() {
        return x2;
    }

    // ini adalah method acsesor
    // method ini meiliki nilai balikan yang bertipe double
    public double getY2() {
        return y2;
    }

    // ini adalah method acsesor
    // method ini meiliki nilai balikan yang bertipe double
    public double getX3() {
        return x3;
    }

    // ini adalah method acsesor
    // method ini meiliki nilai balikan yang bertipe double
    public double getY3() {
        return y3;
    }


    //ini adalah method unutk menghitung sisi
    //method ini memiliki nilai balikan double dan memiliki parameter 
    //isi dari parameternya bertipe double

    public double hitungSisi(double xa, double ya, double xb, double yb) {
        return Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));

    }

    //method ini unutk menghitung keliling
    //method ini memiliki nilai balikan dan tidak memiliki parameter
    public double hitungKeliling() {
        return hitungSisi(x1, y1, x2, y2) + hitungSisi(x2, y2, x3, y3) + hitungSisi(x3, y3, x1, y1);

    }

    //method ini unutk menghitung luas 
    //method ini tidak memiliki parameter dan method ini memiliki nilai balikan double
    public double hitungLuas() {
        double s = hitungKeliling();
        return Math.sqrt(s * (s - hitungSisi(x1, y1, x2, y2)) * (s - hitungSisi(x2, y2, x3, y3))
                * (s - hitungSisi(x3, y3, x1, y1)));

    }
}
