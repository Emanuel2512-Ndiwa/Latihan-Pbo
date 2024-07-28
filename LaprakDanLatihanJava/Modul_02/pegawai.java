package Modul_02;

//membuat kelas dengan nama pegawai
public class pegawai {
    // ini adalah atribut dari kelas ini
    // tiap atributnya memiliki acses modifier private

    private String npp;// tipe data dari atribut ini adalah integer
    private String nama;// bertipe string
    public pegawai (){

    }
    public pegawai(String npp, String nama, int golongan, String status, int jumlahanak) {
        this.npp = npp;
        this.nama = nama;
        this.golongan = golongan;
        this.status = status;
        this.jumlahanak = jumlahanak;
    }

    private int golongan;// bertipe integer
    private String status;// bertipe status
    private int jumlahanak;// bertipe int

    // membuat method mutator dari tiap atribut
    public void setNpp(String npp) {
        this.npp = npp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setJumlahanak(int jumlahanak) {
        this.jumlahanak = jumlahanak;
    }

    // membuat method acsesor dari tiap atribut
    public String getNpp() {
        return npp;
    }

    public String getNama() {
        return nama;
    }

    public int getGolongan() {
        return golongan;
    }

    public String getStatus() {
        return status;
    }

    public int getJumlahanak() {
        return jumlahanak;
    }

    // membuat method untuk menghitung gaji pokok berdasarkan golongan
    // method ini memiliki nilai balikan integer dan memiliki parameter yang bertipe
    // integer
    public int hitunggajipokok(int golongan) {
        if (golongan == 1) {
            return 1300000;

        } else if (golongan == 2) {
            return 1700000;

        } else if (golongan == 3) {
            return 2000000;

        } else {
            return 0;
        }

    }

    // method unutk menghitung tunjangna keluarga berdasarkan status dan jumlah anak
    // method ini memiliki nilai balikan integer dan memiliki parameter bertipe
    // integer
    public int hitungtungtunjangankeluarga(String status, int jumlahanak) {
        
        if (status.equalsIgnoreCase("Menikah")) {
            return 300_000 + (jumlahanak * 100_000);

        } else {

            return 0;
        }

    }

    // method unutk menghitung gaji total
    // method ini memiliki parameter bertipe integer dan string
    // method ini juga memiliki nilai balikan bertipe integer
    public int htiunggtotal(int golongan, String status, int jumlahanak) {
        int gaji_pokok = hitunggajipokok(golongan);
        int tunjangan_keluarga = hitungtungtunjangankeluarga(status, jumlahanak);

        return gaji_pokok + tunjangan_keluarga;
    }

}
