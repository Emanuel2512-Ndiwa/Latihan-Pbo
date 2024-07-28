package Modul_02;
//ini adlaah kelas kalkulator yang berisi atribut dan method yang bisa di akses di kelas lainnya
public class kalkulator {

    //ini adlaah atribut dari kelas kalkulator
    //atributnya bertipe double semua
    //dan acsess modifiernya privatee
    private double angka1,angka2;

    //membuat method acsesor dari tiap atribut dari kelas kalkulator
    public double getAngka1() {
        return angka1;
    }

    public double getAngka2() {
        return angka2;
    }

    //membuat method acsesor dari tiap atribut kelas kalkulator
    public void setAngka1(double angka1) {
        this.angka1 = angka1;
    }

    public void setAngka2(double angka2) {
        this.angka2 = angka2;
    }


    //membuat method unutk menghitung penjumlahan 
    //methodo ini memiliki nilai balikan double dan memiliki parameter yagn bertipe double juga
    public static double penjumlahan(double angka1,double angka2){
        double jumlah = angka1+angka2;
        return jumlah;
    }

    //membuat method untuk menghitung pembagian 
    //method ini memiliki nilai balikan double dan method ini memiliki parameter yang bertipe double
    public static double pembagian(double angka1,double angka2){
        double pembagian = angka1/angka2;
        return pembagian;
    }
    //membuat method untuk menghitung perkalian 
    //method ini memiliki nilai balikan double dan method ini memiliki parameter yang bertipe double
    public static double perkalian(double angka1,double angka2){
        double perkalian= angka1*angka2;
        return perkalian;
    }
    //membuat method untuk menghitung pengurangan
    //method ini memiliki nilai balikan double dan method ini memiliki parameter yang bertipe double
    public static double pengurangan(double angka1,double angka2){
        double pengurangan=angka1/angka2;
        return pengurangan;
    }



}
