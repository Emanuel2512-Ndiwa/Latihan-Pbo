package Modul_02;

//mengimport kelas scanner
import java.util.Scanner;

//membuat kelas baru dengan nama pegawai main kelas ini berisiskan method main
public class PEGAWAI_MAIN {
    public static void main(String[] args) {
        // memnbaut objek dari kelas scanner
        Scanner masuk = new Scanner(System.in);
        // meminta user memasukan berapa jumlah pegawai yang akan memasukan data dirinya
        System.out.print("Masukan Jumlah Pegawai");
        int jumlahpegawai = masuk.nextInt();

        // membuat objek menggunakan array dari kelas pegawai
        // tujuannya unutk menyimpan setiap data yang di masukan tiap pegawai
        // di dalam objek input
        // menggunakan array agar data yagn di masukan di simpan secara teratur di dlaam
        // indeks tiap array
        // dan tidak terjadi kesalahan membaca data saat kita ingin mengaksesnya
        Karyawan[] input = new Karyawan[jumlahpegawai];

        // menggunakan looping for unutk meminta tiap pegawai memasukan data dirinya
        // masing-masing
        // dan data-data ini langsung di simpan di dalam array dari objec input di mulai
        // dari indeks ke nol
        for (int a = 0; a < jumlahpegawai; a++) {

            // membuat objek baru dari kelas pegawai
            // objek ini unutk mengakses tiap atribut dan method yang ada di dalam kelas
            // pegawai
            Karyawan pegawai = new Karyawan();
            System.out.println("Masukan Data Pegawai Ke-" + (a + 1));
            System.out.println();

            System.out.print("Npp\t:");
            // mengkases method mutator npp menggunakan objek pegawai
            // kemudian nilai parameternya itu di masukan oleh user
            pegawai.setNpp(masuk.nextInt());
            masuk.nextLine();

            System.out.print("Nama\t:");
            // mengkases method mutator nama menggunakan objek pegawai
            // kemudian nilai parameternya itu di masukan oleh user
            pegawai.setNama(masuk.nextLine());

            System.out.print("Status\t:");
            // mengkases method mutator staus menggunakan objek pegawai
            // kemudian nilai parameternya itu di masukan oleh user
            pegawai.setStatus(masuk.nextLine());

            System.out.print("Golongan\t:");
            // mengkases method mutator golongan menggunakan objek pegawai
            // kemudian nilai parameternya itu di masukan oleh user
            pegawai.setGolongan(masuk.nextInt());

            System.out.print("Jumlah Anak\t:");
            // mengkases method mutator jumlah anak menggunakan objek pegawai
            // kemudian nilai parameternya itu di masukan oleh user
            pegawai.setJumlahanak(masuk.nextInt());

            // Menyimpan objek pegawai yang baru dibuat ke dalam array input pada indeks a
            input[a] = pegawai;
        }
        System.out.println("_________________________________________________________________________");

        for (int a = 0; a < input.length; a++) {
            //menginisiasikan objec pegawai degan nilai dari indeks ke nol pada objec input
            Karyawan pegawai = input[a];

            System.out.println("\nData Pegawai ke-" + (a + 1));

            //mengakses method acsesor dari tiap atribut dari kelas pegawai menggunakan objec pegawai
            System.out.println("NPP\t: " + pegawai.getNpp());
            System.out.println("Nama\t: " + pegawai.getNama());
            System.out.println("Status\t: " + pegawai.getStatus());
            System.out.println("Golongan\t: " + pegawai.getGolongan());
            System.out.println("Jumlah Anak\t: " + pegawai.getJumlahanak());

            //membuat variabel baru untuk menghitung tunjangan gaji pokok dan total gaji dengan tipe data integer 
            //bertipe integer karena  setiap methodnya bertipe integer di dlaam tiap variabel ini berisikan nilai
            //dari method hitungtunjangankaluarga,hitunggajipokok,hitungtotal yagn di akses menggunakan objek pegawai 
            int tunjangan = pegawai.hitungtungtunjangankeluarga(pegawai.getStatus(), pegawai.getJumlahanak());
            int gaji = pegawai.hitunggajipokok(pegawai.getGolongan());
            int total = pegawai.htiunggtotal(pegawai.getGolongan(), pegawai.getStatus(), pegawai.getJumlahanak());

            //menampilkan hasil perhitungan 
            
            System.out.println("Tunjangan keluarga\tRp." + tunjangan);
            System.out.println("Gaji Pokok\tRp." + gaji);
            System.out.println("Total Gaji\tRp." + total);

        }
        System.out.println("_____________________________________________________________________________");

    }
    

}
