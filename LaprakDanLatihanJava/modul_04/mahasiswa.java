package modul_04;

public class mahasiswa {
    //membuat atribut dengan tipe data string dan double 
    //string untuk nim nama dan tanggal lahir 
    //double untuk uts dan uas
    private String nim, nama, tanggallahir;
    private double uts1, uts2, uas;
    //acses modifier dari atribut kelas mahasiswa ini adalah provate
    //lalau kita membuat method set dan get dari tiap atribut yang kita punya 

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(String tanggallahir) {
        this.tanggallahir = tanggallahir;
    }

    public double getUts1() {
        return uts1;
    }

    public void setUts1(double uts1) {
        this.uts1 = uts1;
    }

    public double getUts2() {
        return uts2;
    }

    public void setUts2(double uts2) {
        this.uts2 = uts2;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }
    //dlaam program ini ada sedikit tambaha yaitu membuat method unutk mencari nilai final 
    //dengan ketentuan method ini adlah bertipe double dan tidak memiliki parameter
    //acses modifiernnya adalaj publick
    public  double nilaifinal() {
        return 30*uts1/100+30*uts2/100+40*uas/100;

    }
    //membuat method unutk mencari nilai berdasarkan huruf 
    //tipe data dari method ini adalah char dan memiliki parameter 
    public  char konversi(double nilaifinal) {
        if (nilaifinal >= 80) {
            return 'A';
        } else if (nilaifinal >= 70 && nilaifinal < 80) {
            return 'B';
        } else if (nilaifinal >= 56 && nilaifinal < 70) {
            return 'C';
        } else if (nilaifinal >= 45 && nilaifinal < 56) {
            return 'D';
        } else {
            return 'E';
        }
    }

}
