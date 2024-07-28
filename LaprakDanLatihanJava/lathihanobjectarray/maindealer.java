package lathihanobjectarray;
import java.util.Scanner;
public class maindealer {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        mobil[]mbl=new mobil[3];
        for(int a=0; a < mbl.length;a++){
            System.out.println("Masukan Merk mobil\t:");
            String merk=masuk.nextLine();
            System.out.println("Masukan Warna Mobil\t:");
            String warna = masuk.nextLine();

            mbl[a]=new mobil(merk, warna);
            
        }
    }
    
}
