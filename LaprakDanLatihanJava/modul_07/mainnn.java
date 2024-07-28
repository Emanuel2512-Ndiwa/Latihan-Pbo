package modul_07;
//di sini kita membuat sebuah kelas bernama main
//kelas main ini berisikan method main yang menjadi pusat pertama jika suatu program di jalankan 

public class mainnn {
    public static void main(String[] args) {
        Bawah bwh = new Bawah();//mendeklarasikan dan membuat object dari kelas bawah
        //object dari kelas bawah memanggil method cetak 1 yang merupakan method yang tersedia di kelas Atas(kels induk)
        System.out.println("Program Kelas Atas");
        bwh.cetak1();
        System.out.println();
        System.out.println();
        //lalu object dari kelas bawah memanggil method dari kelas nya sendiri 
        System.out.println("Program Kelas Bawah");
        bwh.cetak2();
        System.out.println();
        //jadi ketika kita menggunakan inheritens jika kita inggin memanggil
        // method dari kelas induknya kita tidak perlu membuat object terlebih dahulu dari kelas tersebut
        //kita dapat semua metode maupun atribut dari kelas induk menggunakan object dari kelas anaknya 


        bawah_private b = new bawah_private();//membuat object dari sub kelas atas private 
        System.out.println("Kelas Atas Private ");
        b.cetak1();//object dari sub kelas memanggil method dari kelas induk
        System.out.println();
        System.out.println();
        System.out.println("Kelas Bawah Private");
        b.cetak2();//object dari sub kelas memanggil method dari kelasnya sendiri 
        System.out.println();
        System.out.println();
        System.out.println();

        Bawah_pro bawahp = new Bawah_pro();//membuat object menggunakan anak kelas bawah pro
        System.out.println("kelas atas pro");
        bawahp.cetak11();//menggunakan object dari anak kelas dan mengakses method cetak11 dari kelas induk
        System.out.println();
        System.out.println("kelas bawah pro");
        bawahp.CETAK22();//object dari kelas bawah pro yang merupakan anak kelas mengakses methodnys sendiri


        Bawah_Pub bwah = new Bawah_Pub();//membuat object dari kelas bawah pub yang merupakan kelas turunan atas pub
        System.out.println("kelas Atas Pub..");
        bwah.cetak1();//object dari kelas bawah pub memanggil method dari kelas atas pub
        System.out.println("Kelas Bawah Pub...");
        bwah.cetak2();//object dari kelas bawah memanggil method yang ada dikelasnya sendiri
     
    }
    
}
