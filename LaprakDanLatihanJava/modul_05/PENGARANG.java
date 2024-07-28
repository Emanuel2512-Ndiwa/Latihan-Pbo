package modul_05;

public class PENGARANG {
    //atribut dari kelas pengarang 
    private String nik;//unutk mentimpan data nik
    private String nama;//unutk mentimpan data nik
    private String alamat;//unutk mentimpan data nik

    public void setNik(String nik) {
        this.nik = nik;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public PENGARANG (){
        
    }
    public PENGARANG(String nik, String nama, String alamat) {//unutk mengisi value dari setiap atribut dari kelas pengarang
        //method ini disikan ketika object dari kelas pengarang pertama kali dibuat
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
    }
    //lalu membuat method get dari tiap atribut
    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

}
