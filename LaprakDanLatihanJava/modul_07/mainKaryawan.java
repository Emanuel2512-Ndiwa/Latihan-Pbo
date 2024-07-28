package modul_07;

//import kelas scanner 
import java.util.Scanner;

//membuat kelas main karyawan 
//kelas ini berisikan main program yang akan menjalankan semua rancangan program kita baik dari kelas induk dan kelas turunan 
//yang sudah kita buat menggunakan proses enskapsulasi juga
public class mainKaryawan {
    public static void main(String[] args) {

        Scanner masuk = new Scanner(System.in);// membuat object dari kelas scanner
        System.out.println();
        System.out.println("\t\tSelamat Datang Di Profil Karyawan");
        System.out.println("---------------------------------------------------------------");
        System.out.println();
        // di sini sedikit tambahan agar program kita mendapatkan data yang lebih
        // fleksibel dan programnya lebih efisien
        // agar data yang kita punya itu bukan secara defult disikan langsung oleh kita
        // sebagai programer tetapi
        // data yang kita da[at itu bervariasi sesuai keinginan user atau sesuai
        // kebutuhan user yang menggunakannya
        // terlebih dahulu di awal program meminta berapa banyak jumlah data dari kedua
        // karyawan yang akan di masukan
        System.out.print("\tBerapa Jumlah Karyawan Tetap\t:");
        int jt = masuk.nextInt();// variabel ini untukk menyimpan berapa jumlah nilai karyawan tetap yang di
                                 // dapat dari user
        System.out.println();
        System.out.print("\tBerapa jumlah karyawan kontrak \t:");
        int jk = masuk.nextInt();// variabel ini untukk menyimpan berapa jumlah nilai karyawan tetap yang di
                                 // dapat dari user
        System.out.println();
        // kedua variabel yang kita gunakan unutk menyimpan banyaknya jumlah data yang
        // akan kita gunakan itu memiliki fungsi sebagai batasan jumlah data yang akan
        // dimasukan
        // batasan ini dapat kita implementasikan menggunakan array yang dimana
        // menggunakan panjang array ,dan
        // panjang arraynya menggunakan nilai dari kedua variabel ini

        System.out.print("Masukan Data-data Berikut      ");
        System.out.println();
        System.out.println("\t\t|");
        System.out.println("\t\t|");
        System.out.println("\t\t|");
        System.out.println("\t\tV");
        System.out.println();
        System.out.println();
        System.out.println("Karyawan Tetap");
        // membuat array of object dan menginisiasi panjang arraynya dari kelas karyawan
        // tetap
        // menggunakan array of object dengan alasan data yang akan kita terima itu
        // banyak
        // dan kita ingin menyimpan dengan rapih dan terurut dalam sebuah wadah
        karyawanTetap [] KT = new karyawanTetap [jt];// inisiasi panjang array menggunakan variabel jt
        for (int a = 0; a < KT.length; a++) {// agar kita bisa mengisi data yang banyak secara terurut kita membutuhkan
                                             // looping for
            KT[a] = new kt();// sebelumnya kita sudha membuat array of object dari kelas karyawan tetap
                                        // tetapi kita belum mendeklarasikan bahwa object dari kelas karyawan yang
                                        // dimulai dari index ke a ini juga merupakan object dari kelas karyawan juga
                                        // untuk itu kita mendeklarasikannya terlebih dahulu sebelum kita gunakan
                                        // unuttuk
                                        // menyimpan data, jika kita tidak mendeklarasikan terlebih dahulu maka semua
                                        // data yang kita masukan maka,
                                        // akan terjadi null yang kita terima di ouputnya sebagai tanda eror
            // setelah mendeklarasikan array of obejct dari kelas karyawan dari index ke nol
            // maka kita bisa mengakses semua atribut dan method baik dari kelas ini sendiri
            // dan juga dari kelas induknya
            // di bawah ini adlaah penggunakan object array dari index ke a mengakses semua
            // atribut dan method dari kelas induk dan kelasnya sendiri
            System.out.println();
            System.out.println("Karyawan ke --> " + (a + 1));
            System.out.println();
            masuk.nextLine();
            System.out.print("\t~ Nama          \t:");
            String nama = masuk.nextLine();
            KT[a].setNama(nama);
            System.out.print("\t~ Npp           \t:");
            int npp = masuk.nextInt();
            masuk.nextLine();
            KT[a].setNpp(npp);
            System.out.print("\t~ Jumlah Anak   \t:");
            int jumlah = masuk.nextInt();
            KT[a].setJumlahAnak(jumlah);
            masuk.nextLine();
            System.out.print("\t~ Gaji Pokok    \t:");
            int gajiPokokK = masuk.nextInt();
            masuk.nextLine();
            KT[a].setGajiPokok(gajiPokokK);
            System.out.println();
        }
        System.out.println();
        System.out.println();

        karyawanKontrak[] kk = new karyawanKontrak[jk];// membuat dan menginisiasi array of object dari kelas karyawan
                                                       // kontrak nilai dari inisiasi didapatkan melalui variabel jt

        System.out.println();
        System.out.println();
        System.out.println("\tKaryawan Kontrak");
        for (int a = 0; a < kk.length; a++) {// agar kita bisa mengisi data yang banyak secara terurut kita membutuhkan
            // looping for
            kk[a] = new karyawanKontrak();
            // sebelumnya kita sudha membuat array of object dari kelas karyawan kontrak
            // tetapi kita belum mendeklarasikan bahwa object dari kelas karyawan yang
            // dimulai dari index ke a ini juga merupakan object dari kelas karyawan juga
            // untuk itu kita mendeklarasikannya terlebih dahulu sebelum kita gunakan
            // unutuk
            // menyimpan data .jika kita tidak mendeklarasikan terlebih dahulu maka semua
            // data yang kita masukan ,maka
            // akan terjadi null yang kita terima di ouputnya sebagai tanda eror
            System.out.println();
            System.out.println("Karyawan ke --> " + (a + 1));
            // setelah mendeklarasikan array of obejct dari kelas kontrak dari index ke nol
            // maka kita bisa mengakses semua atribut dan method baik dari kelas ini sendiri
            // dan juga dari kelas induknya
            // di bawah ini adalah penggunakan object array dari index ke a mengakses semua
            // atribut dan method dari kelas induk dan kelasnya sendiri

            System.out.println();
            masuk.nextLine();
            System.out.print("\t~ Nama          \t:");
            String nama = masuk.nextLine();
            kk[a].setNama(nama);
            System.out.print("\t~ Npp           \t:");
            int npp = masuk.nextInt();
            masuk.nextLine();
            kk[a].setNpp(npp);
            System.out.print("\t~ Jumlah Anak   \t:");
            int jumlah = masuk.nextInt();
            kk[a].setJumlahAnak(jumlah);
            masuk.nextLine();
            System.out.print("\t~ jumlah Upah Harian \t:");
            int jumlahUpahHarian = masuk.nextInt();
            masuk.nextLine();
            kk[a].setUpahHarian(jumlahUpahHarian);

            System.out.print("\t~ Masukan Jumlah Hari\t:");
            int hari = masuk.nextInt();
            kk[a].setJumlahHariMasuk(hari);
            System.out.println();

        }
        // lalu di bawah ini kita tinggal mencetak semua data dari karyawan tetap dan
        // kontrak yang sudah kita simpan di array of object dari masing -masing kelas
        // untuk bisa mengambil semua data-datanya kita perlu menggunakan looping agar
        // bisa membaca semua data-data yang ada di array of object dari masing-masing
        // kelas tersebut
        // cara mendapatkannya adalah dengan menggunakan method get
        System.out.println("Data Karyawan Tetap");
        System.out.println("\t|");
        System.out.println("\t|");
        System.out.println("\tV");
        System.out.printf("%-30s %-30s %-30s %-30s%n", "Nama", "Npp", "Jumlah Anak", "Gaji Pokok");
        //menggunakan format string karena output yang diinginkan berbentuk tabel untuk ukuran format disesuaikan kebutuhan
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int a = 0; a < KT.length; a++) {// loooping untuk membaca data dari kelas karyawan tetap

            System.out.printf("%-30s %-30d %-30d %-30d%n", KT[a].getNama(), KT[a].getNpp(), KT[a].getJumlahAnak(),
                    KT[a].getGajiPokok());

            KT[a].hitungTotalGaji();
            System.out.println("\t\tTunjangan Anak\t:" + KT[a].hitungTunjangAnak());

        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Data Karyawan Kontrak");
        System.out.println("\t|");
        System.out.println("\t|");
        System.out.println("\tV");
        System.out.printf("%-30s %-30s %-30s %-30s %-20s%n", "Nama", "Npp", "Jumlah Anak", "Upah Harian", "Hari Masuk");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int a = 0; a < kk.length; a++) {// looping unutk membaca data dari kelas karyawan kontrak
            //agar outpunya berbentuk tabel kita menggunakan format string dengna ukuran yang disesuaikan kebutuhan 
            System.out.printf("%-30s %-30d %-30d %-30d %-30d %s%n", kk[a].getNama(), kk[a].getNpp(),
                    kk[a].getJumlahAnak(), kk[a].getUpahHarian(), kk[a].getJumlahHariMasuk(), "Hari");
            kk[a].hitungTotalGaji();
            System.out.println("\t\tTunjangan Anak\t:" + kk[a].hitungTunjangAnak());
        }
        masuk.close();// menutup kelas scanner
        // ketika kita memanggil kelas scanner kita menggunakan system .in unutk membaca
        // data dari kybord ini yang dinamakan aliran dari luar kemudian kita perlu
        // metupnya unutk memastikan bahwa kita sudha tidak menggunakannya lagi dan juga
        // unutk tidka terlalau memakan banyak memory yang tidak di perlukan karena kit
        // abelum menutupnya

    }

}
