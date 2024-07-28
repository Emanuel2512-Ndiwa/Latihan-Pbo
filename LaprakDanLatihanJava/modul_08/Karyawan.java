package modul_08;
//unutk membuat koleksi heterogen di sini kita akan membuat seebuh kelas menjadi abstrak 

//dengan membuat sebuah kelas menjadi abstrak maka kelas induk akan memiliki sebuah method yang abstrak dan juga kelas anaknya akan mengoveride method ini 
//di kelas karyawan ini memiliki 4 atribut dan semua atributnya menggunakan akses modifikasi protected
//di sini saya menggunakan konsep kelas abstrak dan polimorfisme yang dimana tujuan membuat kelas abstrak adalah agar kita 
//tidak kesusahan saat melakukan konsep heterogen yang dimana induk kelas ingin mengakses method ataupun atribut dari anak kelas dengan harus melakukan casting berulang kali
//di kelas karyawan ini method yang di abstrak adalah hitung gaji total kenapa methodini
// karena method yang sama ini juga akan di gunakan di dlaam sub kelasnya yaitu karyawan kontrak dan tetap 

public abstract class Karyawan {
    protected int subsidi= 100_000;
    protected String nama;
    protected int npp;
    protected int jumlah;

    // membuat method get dari ke empat atribut yang kita miliki
    public int getSubsidiAnakKaryawan() {
        return subsidi;
    }

    public String getNamaKaryawan() {
        return nama;
    }

    public int getNppKaryawan() {
        return npp;
    }

    public int getJumlahAnakKaryawan() {
        return jumlah;
    }

    // membuat method tunjangan
    // method ini kita letakan di kelas induknya karena unutk menghitung tunjangna
    // keluarga berdasarkan jumlah anak akan di gunakan baik di kelas induk mauoun
    // sub kelasnya agar method ini bis adi akses baik oleh kelas induk ataupun
    // kelas turunannya maka kita letakan di kelas induk saja jika di letakan di
    // kelas turunannya maka kelas induk kita tidak dapat mengaksesnya jika tidak
    // kita abstrakan
    public int AnakTunjang() {
        System.out.println();
        int totalTunjangan = getJumlahAnakKaryawan() * getSubsidiAnakKaryawan();
        return totalTunjangan;

    }

    // method kosong hitung gaji total penanda kalau kelas ini adalah kelas yang
    // abstrak karena kita belum tau implementasi yang jelas dari method ini
    // maka di kelas turunannya kita harus untuk mengoveridenya
    abstract int hitungGatot();

}
