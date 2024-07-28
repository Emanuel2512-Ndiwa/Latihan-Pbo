package modul_03;

//membuat kelas ketua
public class ketua {
    // membuat atribut darii kelas ketua
    private String nip;
    private String nama;
    private String email;
    private String gelar;

    // membuat konstruktor dari ketua
    public ketua(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    // membuat method getnip bertipe string
    public String getNIP() {
        return nip;
    }

    // method getnama bertipe string
    public String getNama() {
        return nama;
    }

    // method getemail bertipe string
    public String getEmail() {
        return email;
    }

    // membuat method set email
    public void setEmail(String email) {
        this.email = email;
    }

    // membuat method setgelar
    public String getGelar() {
        return gelar;
    }

    // membuat method setgelar
    public void setGelar(String gelar) {
        this.gelar = gelar;
    }
}
