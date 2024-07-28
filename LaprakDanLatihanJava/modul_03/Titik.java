package modul_03;

//membuat kelas titik yang berisi atribut dan method untuk keperluan 
//mengeksekusi atribut yang di miliki
public class Titik {

    // mendeklarasikan atribut dari kelas titik
    // tipe data dari atributnya integer
    // akses modifikasinya private
    private int x, y;

    public Titik(int x, int y)
    // constructor Titik
    // ini adlaah method yang pertama kali dijalankan ketika sebuah
    // objek dari kelas ini dibuat
    {

        // fungsi dari this adalah mencegah terjadinya shadowing variabel
        // yang dimana jika kita membuat ssebuah variabel yang namanya sama persis
        // ketika tidak menggunakan this maka komputer kita kebingungan unutk
        // membaca data variabel mana yang kita maksud keetika di panggil
        this.x = x;
        this.y = y;
    }
    //method set dari variabel x yang memiliki parameter bertipe integer
    public void setX(int x) {
        this.x = x;
    }
    //method dari variabbel y yang memiliki parameter bertipe integer
    public void setY(int y) {
        this.y = y;
    }

    //method get variabel x dan y tipe data dari method ini adalah integer
    //method ini mengembalikan nilai bertipe integer ketika kita mengaksesnya
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
