package modul_03;

//kelas buku main 
//kelas ini berisi method mainn atau main program yang menjalankan semua program yang kita buat dan hanya bisa di jalankan di kelas ini
public class bukumain {
    public static void main(String[] args) {

        // membuat objek dari kelas penerbit dan mengisi tiap parameternya
        penerbit lengkapi = new penerbit("PT Gramedia Pustaka Utama",
                "Gedung Gramedia Lt. 3 Jl. Palmerah Barat No. 33-37 Jakarta Pusat 10270", 2002);

        // membuat objek dari kelas buku dan mengisikan parameternya
        // ketika di parameter objek dari kelas buku ini kita mengisinya juga dengan
        // objek dari kelas penerbit
        // kenapa demikian karena buku ini penerbitnya itu berada di objek dari kelas
        // penerbit ini
        // ini membuat kita tidak salah memasukan data penerbit ketika kita memiliki
        // buku yang banyak
        // karena kita langsung mengaksesnya menggunakan obejk dari kelas buku ini unutk
        // setiap atribut dari kelas penerbit
        buku input = new buku(9786020633176L, 2019, "Atomic Habits", "James Clear", lengkapi);
        System.out.println("___________________________________________________");
        // menampilkan semua data buku yang kita miliki
        System.out.println("---------------------------------------------------");
        System.out.println("\t\tData Buku ");
        System.out.println("---------------------------------------------------");
        // mengakses atribut dari buku menggunakan obejek dari kelas buku
        System.out.println("Judul Buku\t:" + input.getJudul());
        System.out.println("Nama Pengarang\t:" + input.getNamapengarang());
        System.out.println("Tahun Terbit\t:" + input.getTahunterbit());
        System.out.println("Kode Buku\t:" + input.getKoodebuku());
        // kemudian di bagian ini kita mengakses data penerbit dari kelas penerbit
        // menggunakan objek dari kelas kelas buku
        // kita mengakses menggunakan objek dari kelas buku karena kita sudah mengisi
        // objek dari kelas penerbit di dalam
        // konstruktor dari kelas buku
        System.out.println("Penerbit\t:" + input.getDatapenerbit().getNamapenerbit());
        System.out.println("Alamat Penerbit\t:" + input.getDatapenerbit().getAlamat());
        System.out.println("Tahun Berdiri\t:" + input.getDatapenerbit().getTahunberdiri());
        System.out.println("---------------------------------------------------");
        System.out.println("Kategori Buku");
        System.out.println("-------------");
        if (input.getTahunterbit() < 2014) {
            System.out.println("Buku Lama");
        } else {
            System.out.println("Buku Baru");
        }
        System.out.println();
        System.out.println("__________________________________________________");
        System.out.println();

        penerbit penerbit = new penerbit("Gramedia.com",
                "Gramedia Sudirman, Jl. Jend. Sudirman No.54-56, Kotabaru, Kec. Gondokusuman, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55224",
                1970);
        buku buku = new buku(9786026486929L, 2010, "The Psychology Of Emotion", "David J. Lieberman", penerbit);

        System.out.println("---------------------------------------------------");
        System.out.println("\t\tData Buku ");
        System.out.println("---------------------------------------------------");
        System.out.println("Judul Buku\t:" + buku.getJudul());
        System.out.println("Nama Pengarang\t:" + buku.getNamapengarang());
        System.out.println("Tahun Terbit\t:" + buku.getTahunterbit());
        System.out.println("Kode Buku\t:" + buku.getKoodebuku());
        System.out.println("Penerbit\t:" + buku.getDatapenerbit().getNamapenerbit());
        System.out.println("Alamat Penerbit\t:" + buku.getDatapenerbit().getAlamat());
        System.out.println("Tahun Berdiri\t:" + buku.getDatapenerbit().getTahunberdiri());
        System.out.println("---------------------------------------------------");
        System.out.println("Kategori Buku");
        System.out.println("-------------");
        if (buku.getTahunterbit() < 2014) {
            System.out.println("Buku Lama");
        } else {
            System.out.println("Buku Baru");
        }
        System.out.println("___________________________________________________");

        //di dalam kelas yang berisi main ini 
        //ketika saya ingin mengubah nilai variabel yang ada di method buku
        //maka perlu unutk membuat objek baru dan mengisinya lagi dengan nilai yang berbeda
        //sebenarnya program ini akan lebih efisien ketika kita menggunakan looping dan array 

        //kemudian ketika kita ingin mengakses semua atribut dan method yang ada di kelas penerbit
        //kita tidak perlu mengaksesnya menggunakan objek dari kelas penerbit tetapi langsung kita akses 
        //menggunakan objek dari kelas buku
        //mengapa demikian,hal ini bisa terjadi karena kelas penerbit itu kita gunakan menjadi atribut daari kelas buku
        

    }

}
