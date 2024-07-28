package Modul_02;

public class BankMain {
//ini adlaah kelas bank main di dalam kelas ini berisikan method main
    public static void main( String args[] ){
        //membuat objek dari rekeningbank dengan tipe objeknya RekeningBank dan nilai parameternya "123456"
        RekeningBank rekeningbudi =new RekeningBank("123456");
        System.out.println("_______________________________________");
        System.out.println("Rekening Budi\t="+rekeningbudi.cekSaldo());
        System.out.println("-------------------------------------");
        System.out.println("Menabung Rp 50.000");
        System.out.println("-------------------------------------");
            //mengakses method tabung menggunakan objek
            rekeningbudi.tabung(50_000);
        System.out.println("Rekening Budi Sekarang\t="+rekeningbudi.cekSaldo());
        System.out.println("-------------------------------------");
        System.out.println("Mengambil Rp 20.000");
        System.out.println("------------------------------------");
            //mengakses method ambil menggunakan objek
            rekeningbudi.ambil(20_000);
        System.out.println("Rekening Budi Sekarang\t="+rekeningbudi.cekSaldo());
        System.out.println("________________________________________");
 }
}
