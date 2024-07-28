package modul_06;

import Modul_02.*;
import modul_05.perusahaan;

import java.util.*;

public class kelolaPerusahaan {

    public static void main(String[] args) {
        System.out.println("======================================================================================================");
        Scanner masuk = new Scanner(System.in);
        peprusahaan perusahaan = new peprusahaan();//membuat object baru dari kelas perusahaan menggunakan kontruktor yang parameternya kosong 
        //dengan tujuan agar saay kita ingin memanggil tiap atribut dan method dari kelas ini kita tidak perlu membuat object dari kelas perusahaan 
        //menggunakan konstruktor yang membutuhkan mengisi nilai dari parameter konstruktornya 
        System.out.print("Masukan Jumlah Pegawai\t:");
        int jumlah = masuk.nextInt();
        System.out.println("-------------------------------------------------------------");

        List<pegawai> jumlahPegawai = new ArrayList<>();//membuat array of object dari kelas pegawai dengan menggunakan array list
        pegawai peg = new pegawai();//membaut object dari kelas pegawai dengna parameter kosong tujuannya adlaah menginisiasi
        //object ini bahwa object ini merupakan object dari kelas pegawai 
        //karena object dari pegawai dengan namaa peg ini akan di gunakan berkali kali di dalam looping yang berbeda 
        //jika kita langsung membuat objectnya di dalam masing masing looping maka data lokasi memori object ini berbeda beda dan ketika kit aingin mengambil 
        //datanya sekaligus atau secara bersamaan kita tidak dapat mengaksesnya secara bersamaan 


        //looping unutk mengisi data pegawai dari perusahaan 
        for (int i = 0; i < jumlah; i++) {
            masuk.nextLine();
            System.out.print("Nama           \t:");
            String nama = masuk.nextLine();
            System.out.print("Npwp           \t:");
            String npwp = masuk.nextLine();
            System.out.print("Golongan       \t:");
            int golongan = masuk.nextInt();
            masuk.nextLine();
            System.out.print("Status        \t:");
            String sttus = masuk.nextLine();
            System.out.print("Jumlah Anak   \t:");
            int jumlahh = masuk.nextInt();
            masuk.nextLine();
            System.out.println("-------------------------------------------------------------");

           peg = new pegawai(npwp, nama, golongan, sttus, jumlahh);//mengisi parameter dari object pegawai setiap kali looping berjalan dari index ke nol
           jumlahPegawai.add(peg);//menambahkan lokasi object dari peg ke array jumlah pegawai 
           perusahaan.tambahPegawaiBaru(peg);//menambahkan object peg ke dalam method tambah pegawai 
           //menambahkan object ini dengan tujuan unutk menambahkan lokasi peg ke dalam method ini yang di mana di dalam method ini lokasinya di kopikan ke dalam array 

        }
        System.out.println();
        System.out.print("Apakah Ada Tambahan Pegawai Baru(y/t)\t:");
        String jawab = masuk.nextLine();
        //percabangan unutk memastikan kalau user benar2 ingin menambahkan data pegawai baru
        if (jawab.equalsIgnoreCase("t")) {
            System.out.println("=> Tidak Ada Tambahan Pegawai ");
        } else if (jawab.equalsIgnoreCase("y")) {
            //menggunakan loping do while unutk memastikan lagi kelau user benar2 sudah tidak ingin menambahkan data baru 
            do {
                System.out.println();
                System.out.print("Berapa Jumlah Pegawai Baru\t:");
                int jmlhPegawai = masuk.nextInt();
                //looping for unutk memasukan data pegawai baru dari setiap atribut dari kelas pegawai 
                for (int a = 0; a < jmlhPegawai; a++) {
                    masuk.nextLine();
                    System.out.print("Nama           \t:");
                    String namab = masuk.nextLine();
                    System.out.print("Npwp           \t:");
                    String npwpb = masuk.nextLine();
                    System.out.print("Golongan       \t:");
                    int golonganb = masuk.nextInt();
                    masuk.nextLine();
                    System.out.print("Status        \t:");
                    String sttusb = masuk.nextLine();
                    System.out.print("Jumlah Anak   \t:");
                    int jumlahhb = masuk.nextInt();
                    masuk.nextLine();
                    peg = new pegawai(npwpb, namab, golonganb, sttusb, jumlahhb);
                    jumlahPegawai.add(peg);
                    perusahaan.tambahPegawaiBaru(peg);
                 
                 
                    

                }
                System.out.println();
                System.out.print("Apah Masih Ada Tambahan(y/t)?\t:");
                jawab = masuk.nextLine();
                //memastikan lagi jika user benar2 sudah tidak ingin menambahkan pegawai baru 
            } while ((jawab.equalsIgnoreCase("y")));
        }
        //object dari kelas perusahaan mengisi konstruktornya sesuai atribut yang di butuhkan di dalam konstruktor tersebut 
        perusahaan = new peprusahaan("E.K.A", "NTT-NAGEKEO-NANGARORO-BOALOBO", "EMANUEL MATRONI NDIWA", 235314103, jumlahPegawai);
        //object dari kelas perusahaan memanggil method untuk menampilkan data profil perusahaan 
        perusahaan.tmpilanProfil();
        System.out.println();
        //object dari kelas perusahaan memanggil method unutk menampilkan semua data -data pegawai baik pegawai lama dan yang baru di tambahkab 
        perusahaan.tampilkanDataPegawai(perusahaan.getDaftarPegawai());
        System.out.println();
        //object dari kelas perusahaan memanggil method unutk menghitung rata-rata gaji pegawai 
        perusahaan.rataRataGajiPegawai(perusahaan.getDaftarPegawai());
        System.out.println();
        //object dari kelas perusahaan memanggil method unutkmenghitung gaji tertinggi 
        perusahaan.gajiTertinggiDanTerendah(perusahaan.getDaftarPegawai());

        //di dalam kelas main ini hanya melakukan proses pembuatan object dari kelas pegawai dan kelas perusahaan selain itu juga membuat array of object dari kelas pegawai
        //tujuannya adalah unutk mengakses semua atribut dan juga method yang ada di dlaam kelas ini semua tugas-tugas seperti menghitung rata-rata dan juga mencetak tampilan data 
        //semuanya sudah dibuatkan didalam sebuah method di dlaam kelas perusahaan dan ketika dibutuhkan baru di panggil menggunakan object
        //perlu di ingiat bahwa ketika ingin membuat object yang ada parameternya dan nantinya akan di gunakan berulangkali di dalam looping maka kit aperlu menginisiasinya terlebih dahulu
        //ketika ingin menginisiasi object kita membutuhkan sebuah konstruktor yang parameternya kosong tidak memiliki variabel yang perlu disisikan 

        

    }
}
