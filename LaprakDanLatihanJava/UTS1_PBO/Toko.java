package UTS1_PBO;

import java.util.List;

public class Toko {

    private int kodeToko;
    private String namaToko;
    private Pegawai manager;
    private List<Item> dfatarItem;
    
    public Toko(int kodeToko, String namaToko ) {
        this.kodeToko = kodeToko;
        this.namaToko = namaToko;
    }

    public Toko() {
    }

    public void setManager(Pegawai manager) {
        this.manager = manager;
    }

    public void setDfatarItem(List<Item> dfatarItem) {
        this.dfatarItem = dfatarItem;
    }

    public int getKodeToko() {
        return kodeToko;
    }

    public String getNamaToko() {
        return namaToko;
    }

    public Pegawai getManager() {
        return manager;
    }

    public List<Item> getDfatarItem() {
        return dfatarItem;
    }
    

    public void hargaTermurah (List<Item> dafItem){
       if (dafItem.isEmpty()){
        System.out.println("Tidak Ada Daftar Item");
        return;
       }
       Item hargaaTermurah = dafItem.get(0);
       for(Item item : dafItem){
        if(item.getHarga() < hargaaTermurah.getHarga()){
            hargaaTermurah = item;
        }
       }
       System.out.println();
       System.out.println();
       System.out.println("------------------------------------------------------------");
       System.out.println("\t\t\tDaftar Haarga Termurah");
       System.out.println("-------------------------------------------------------------");
       System.out.println("\t\tKode Item    \t:"+hargaaTermurah.getKodeItem());
       System.out.println("\t\tNama Item    \t:"+hargaaTermurah.getNama());
       System.out.println("\t\t\t\t\tHarga Item    \t"+"Rp"+hargaaTermurah.getHarga());
       
    }
    public void stokHabis(List<Item> stok){
        System.out.println();
        System.out.println();
        System.out.println("\t\tItem Yang Stoknya Habis");
        System.out.println("-----------------------------------------------------");
        for(int a =0; a < stok.size(); a++){
            if(stok.get(a).getStok() < 1){
                System.out.println("\t\t\t~ Nama\t:"+stok.get(a).getNama());
                System.out.println("\t\t\t~ Stok\t:"+stok.get(a).getStok());
               
            }
        }
    }
    public void dataManager(List<Item>item,Pegawai manajerr ){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\t\t\t\tData Manajer");
        System.out.println("--------------------------------------------------------------");
        System.out.println("\t\tNama            \t:"+manajerr.getNama());
        System.out.println("\t\tNo Pegawai      \t:"+manajerr.getNoPegawai());
        System.out.println("\t\tAlamat Pegawai  \t:"+manajerr.getAlamat());
        System.out.println();
        System.out.println();
        System.out.printf("%-1s%-20s %-20s %-20s %-20s %n","","Kode Item","Nama","Harga","Jumlah Stok");
        System.out.println("----------------------------------------------------------------");
        for (int a=0; a < item.size(); a++){
            System.out.println();
            System.out.println();

            System.out.printf("%-1d%-20d %-20s %-20d %-20d %n",0,item.get(a).getKodeItem(),item.get(a).getNama(),item.get(a).getHarga(),item.get(a).getStok());
        }
    }

}

