package Modul_02;

public class Segitiga {
    //ini adalah atribut dari kelas segitiga
    //tipe data dari atributnya adalah double
    //acses modifiernya public
    public double x1,y1,x2,y2,x3,y3;

    public Segitiga() {
    }

    public Segitiga(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    //ini adalah method unutk menghitung sisi
    //method ini memiliki nilai balikan bertipe double 
    //dan method ini juga memili parameter isi dari parameternya ada 4 variabel
    //dan tipe data dari setiap nilainya adlaah double
    public double hitungSisi(double xa,double ya,double xb,double yb){
        return Math.sqrt(Math.pow(xa-xb,2)+Math.pow(ya-yb,2));

    }

    //ini adalah method unutuk menghitung keliling
    //method ini memiliki nilai balikan bertipe double dan method ini tidak memiliki parameter
    public double hitungKeliling(){
        return hitungSisi(x1, y1, x2, y2)+hitungSisi(x2, y2, x3, y3)+hitungSisi(x3, y3, x1, y1);

    }
    //ini adalah method unutk menghitung luas
    //method ini memiliki nilai bailikan bertipe double
    //method ini tidak memiliki parameter
    public double hitungLuas(){
        double s = hitungKeliling();
        return Math.sqrt( s *(s-hitungSisi(x1, y1, x2, y2))*(s-hitungSisi(x2, y2, x3, y3))*(s-hitungSisi(x3, y3, x1, y1)));
       
        
    }
}
