package latihaninharintance;
//inhwritance adalah pewarisan 
//yang dimana kelas anak hanya memiliki satu ortu sedangkan kelas ortu boleh memiliki banyak anak
//saat sebuah kelas diturunkan maka secara otomatis
//semua value dari kelas ortu itu juga dimiliki di kelas anak
//kata kunci pewarisannya adalah extends

class orangtua {

    private String nama, pekerjaan;
    private int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void kategori(int umur) {
        this.umur = umur;
        if (umur > 30) {
            System.out.println("Anda Mulai Memasuki Masa Menapouse");
        }
    }

    class anak extends orangtua {

    }

    public static void main(String[] args) {
        orangtua ortu = new orangtua();
        ortu.setNama("Andi Gegu");
        ortu.setPekerjaan("Mabok");
        ortu.setUmur(40);
        ortu.kategori(40);
        System.out.println("Nama Ortu\t:" + ortu.getNama());
        System.out.println("Umur\t:" + ortu.getUmur());
        System.out.println("Pekerjaan\t:" + ortu.getPekerjaan());
        //ini pengaruh di dlaam kelas yang sama maka bentukan sintaksnya begini 
        //jika di kelas yang beda tinggal di buatkan saja langsung object baru dari anak
        orangtua.anak satu = ortu.new anak();
        satu.setNama("almira");
        satu.setPekerjaan("Mabok");
        satu.setUmur(40);
        satu.kategori(40);
        System.out.println("Nama Ortu\t:" + satu.getNama());
        System.out.println("Umur\t:" + satu.getUmur());
        System.out.println("Pekerjaan\t:" + satu.getPekerjaan());

    }
}
