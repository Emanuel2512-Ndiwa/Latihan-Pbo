package Modul_02;

public class SegitigaMain {
    //ini adalah kelas segitiga main di dalam kelaa ini berisikan method main
    public static void main(String[] args) {
        //membuat objek dari kelas Segitiga dan tipe dari objek ini adlaah Segitiga
        Segitiga seg1 = new Segitiga();

        //mengakses atribut dari kelas segitiga menggunakan objek seg1 dan mengisinya dengan nilai
        seg1.x1 = 1;
        seg1.y1 = 2;

        seg1.y2 = 2;
        seg1.x2 = 7;

        seg1.x3 = 7;
        seg1.y3 = 9;

        //mengakses method hitung luas menggunakan objek seg1 kemudian langsung di cetak
        System.out.println("Luas segitiga dengan titik (1,2) (7,2) dan (7,9) adalah :" + seg1.hitungLuas());

        //membuat objek baru lagi dari kelas segitiga dengna tipe objek Segitiga dan nama objeknya seg2
        Segitiga seg2 = new Segitiga();

        //mengakses atribut dari kelas segitiga menggunakan objek seg2 dan mengisikan nilai dari atribut tersebut
        seg2.x1 = 0;
        seg2.y1 = 0;
        seg2.x2 = 5;
        seg2.y2 = 4;
        seg2.x3 = 8;
        seg2.y3 = 2;

            //mengakses method hitung luas menggunakan objek seg2 kemudian langsung di cetak
        System.out.println("Luas segitiga dengan titik (0,0)(5,4) dan (8,2) adalah :" + seg2.hitungLuas());

    }

}
