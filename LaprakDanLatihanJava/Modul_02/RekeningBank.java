package Modul_02;

public class RekeningBank {

    //ini adlaah atribut dari kelas rekening bank
    //dan acsses modifier atributnya private
    //tipe data dari atributnya adalah string dan int
    private String nomorRekening;
    private int saldo;

    //ini adalah contruktor dari kelas rekening bank
    //constructornya memiliki parameter dengna tipe data string
    //fungsinya adalah menerima inputan nomor 
    //kemudian nilai dari nomor ini di terima oleh variabel nomor rekening

    public RekeningBank(String nomor) { 
        nomorRekening = nomor;
        saldo = 0;
    }

    //ini adalah method yang memiliki nilai balikan integer method ini mengembalikan nilai saldo
    public int cekSaldo() {
        return saldo;
    }

    //ini adlaah method tanpa nilai balikan yang memiliki parameter ,parameternya bertipe integer
    //method ini berfungsi unutk menjumlahkan saldo 
    public void tabung(int jumlah) {
        saldo = saldo + jumlah;
    }

    //ini method tanpa nilai balikan yang memili parameter,tipe data dari parameternya adalah integer
    //method ini berfungsi unutk mengurangkan saldo
    public void ambil(int jumlah) {
        saldo = saldo - jumlah;
    }
}
