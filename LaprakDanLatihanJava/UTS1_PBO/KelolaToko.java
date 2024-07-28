package UTS1_PBO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class KelolaToko {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("\t~ Masukan Jumlah Item\t:");
        int jumlahItem=masuk.nextInt();
        Item daftarItem = new Item();

        List<Item> dataItem = new ArrayList<>();
        System.out.println("\t\t\tLengkapi Data Item Berikut ");
        System.out.println("--------------------------------------------------------------------------------------------------");
        for(int a =0; a < jumlahItem; a++){
            masuk.nextLine();
            System.out.print("\t\t--> Kode Item     \t:");
            int kode= masuk.nextInt();
            masuk.nextLine();

            System.out.print("\t\t--> Nama Item     \t:");
            String nama= masuk.nextLine();

            System.out.print("\t\t--> Harga         \t:");
            int harga=masuk.nextInt();
            masuk.nextLine();
            
            System.out.print("\t\t--> Stok Barang   \t:");
            int Stok = masuk.nextInt();
            masuk.nextLine();

           daftarItem = new Item(kode, nama, harga, Stok);
           dataItem.add(daftarItem);
        }
        System.out.println();
        System.out.println();

        System.out.println("Input data Toko");
        System.out.println();
        System.out.print("\tKode Toko\t:");
        int kode1 = masuk.nextInt();
        masuk.nextLine();
        System.out.print("\tNama Toko\t:");
        String nama1 = masuk.nextLine();
        Toko Roti = new Toko(kode1,nama1);

        
        System.out.println();
        System.out.println();
        
        System.out.println("Input data Manajer");
        System.out.println();
        System.out.print("\tKode Pegawai\t:");
        int kode = masuk.nextInt();
        masuk.nextLine();
        System.out.print("\tNama Pegawai\t:");
        String nama = masuk.nextLine();
        Pegawai managerToko = new Pegawai(kode, nama);
        System.out.print("\tAlamat      \t:");
        String alamat = masuk.nextLine();
        managerToko.setAlamat(alamat);


       

        Roti.setManager(managerToko);
        Roti.setDfatarItem(dataItem);
       
        Roti.dataManager(dataItem, managerToko);
        Roti.hargaTermurah(dataItem);
        Roti.stokHabis(dataItem);


      


    }
    
}
