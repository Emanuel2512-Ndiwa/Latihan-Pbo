package modul_08;

//kita menggunakan kelas javax untuk print teks outputnya agar lebih interaktif 
import javax.swing.*;

//di dalam kelas main ini kita melakukan koleksi heterogen java dari kelas karyawan
//kkoleksi heterogen memudahkan kita dalam mengelompokan sebuah data berkelompok dari kelas-kelas yang kita punya 
//dalam kasus ini kit amembuat array of object dari kelas karyawan sebagai induk kelas yang di aman array of object ini akan menampung semua data-data
//dari sub kelasnya sehingga ketika kit amemasukan data dari sub kelasnya kita tidka perlu membuat array of obejct yang terpisah dan juga looping yang terpisah 
//oleh karena kita mengelopokan data-data yang baynak dari sub-sub kelas penggunaan abstraksi kelas pada induk kels sangat membantu kita dalam mengakses method ataupun
//atribut yang berada di subkelasnya
public class MainKaryawan {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Selamat Datang Di Kelas Karyawan");
        int angkaData = Integer.parseInt(JOptionPane.showInputDialog("Masukan Banyaknya Jumlah Karyawan\t:"));

        Karyawan[] data = new Karyawan[angkaData];// array of object dari induk kelas

        String jabatan, nama;// ini adalah variabel yang menampung nilai sementara unutk inisiasi atribut
                             // dari kelas karyawan
                             // nilainya kita dapatnkan melalui user
        int npp, jumlahAnak;
        for (int a = 0; a < data.length; a++) {// looping ini unutk meminta user memasukan data sesuai kebutuhan atribut
                                               // dari kelas karyawan
                                               // saat looping ini berlangsung semua datanya di simpan dalam bentuk
                                               // alamat pada
                                               // array of object dari induk kelas karyawan ini

            nama = JOptionPane.showInputDialog("Nama\t:");
            npp = Integer.parseInt(JOptionPane.showInputDialog("Npp\t:"));
            jumlahAnak = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Anak\t:"));

            // pada saat kit ameminta user memasukan gelar dari mahasiswa kita akan
            // melakukan pengecekan apakah user benar memasukan gelar yang dimaksudkan atau
            // tidak,jika tidak maka kita akan terus meminta user memasukannya hingga pada
            // akhirnya benar
            // unutk dapat melakukan itu di dalam looping for kita kita melakukan looping
            // lagi menggunakan do while
            do {
                jabatan = JOptionPane.showInputDialog("Jabatan(Kontrak / Tetap)\t:");

                if (!jabatan.equalsIgnoreCase("Kontrak") && !jabatan.equalsIgnoreCase("tetap")) {
                    JOptionPane.showMessageDialog(null, "Anda Salah Menginput Data");
                }
            } while (!jabatan.equalsIgnoreCase("Kontrak") && !jabatan.equalsIgnoreCase("tetap"));
            // do akan terus berjalan saat kondisi while itu user tidak memasukan kata
            // kontrak ataupunn kata tetap ,pengecekan ini berfungsi sebagai patokan unutk
            // menghitung gaji total antara karyawan kontrak dan tetap
            // jika tetap maka looping akan masuk ke method dari kawryawan tetap
            // dan jika salah maka looping akan otomatiw masuk ke dalam kelas kawryawaan
            // kontrak
            if (jabatan.equalsIgnoreCase("Kontrak")) {
                int hari = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Harii Kerja\t:"));
                int upahHarian = Integer.parseInt(JOptionPane.showInputDialog("Upah Harian Anda\t:"));
                data[a] = new kk(nama, npp, jumlahAnak, upahHarian, hari);

            } else if (jabatan.equalsIgnoreCase("Tetap")) {
                int gaji = Integer.parseInt(JOptionPane.showInputDialog("Gaji Pokok\t:"));
                data[a] = new kt(nama, npp, jumlahAnak, gaji);
            }

        }
        // looping yang ini berfungsi unutk menampilkan semua data2 yang sudah kit
        // amasukan baik karyawan tetap ataupun kontrak
        JOptionPane.showMessageDialog(null, "Berikut Data Karyawan");
        for (int i = 0; i < data.length; i++) {

            // di sini kita perlu melakukan casting karena ada method yang tidak di buat
            // abstrak sehingga kelas induk tidak dpaat mengaksesnya
            if (data[i] instanceof kk) {
                kk kontrak = (kk) data[i];

                System.out.println(
                        "------------------------------------------------------------------------------------");
                System.out.println("Upah Harian         \t:" + kontrak.getUpahHarian());
                System.out.println("Jumlah Hari Masuk   \t:" + kontrak.getJumlahHariMasukKerja());

                System.out.println();
                System.out.println("==> Jabatan Karyawan Kontrak");
                System.out.println();

            } else if (data[i] instanceof kt) {
                System.out.println();
                System.out.println();
                kt tetap = (kt) data[i];
                System.out.println();
                System.out.println("    Gaji pokok\t:" + tetap.getGajiPokok());
                System.out.println("=> JabatanKaryawan Tetap");
                System.out.println();

            }
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println("Nama                  \t:" + data[i].getNamaKaryawan());
            System.out.println("Npp                   \t:" + data[i].getNppKaryawan());
            System.out.println("Jumlah Anak           \t:" + data[i].getJumlahAnakKaryawan());
            System.out.println("Tunjangan Anak        \t:" + data[i].AnakTunjang());
            System.out.println("Total Gaji            \t:" + data[i].hitungGatot());
            System.out.println();
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println();

        }


    }

}
