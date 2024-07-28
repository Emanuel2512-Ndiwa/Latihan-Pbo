package UTS1_PBO;

public class Item {
    private int kodeItem;
    private String nama;
    private int harga;
    private int stok;
    
    public Item(int kodeItem, String nama,int harga ,int stok) {
        this.kodeItem = kodeItem;
        this.nama = nama;
        this.harga=harga;
        this.stok=stok;
    }
    
    public Item() {
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public int getKodeItem() {
        return kodeItem;
    }
    public String getNama() {
        return nama;
    }
    public int getHarga() {
        return harga;
    }
    public int getStok() {
        return stok;
    }
 
   
   
   
   

    
}
