package modul_04;

import java.util.Scanner;
//di dalam kelas manmhs ini berisikan main program 

public class mainmhs {

    public static void main(String[] args) {
        //memb uat object dari kelas scanner
        Scanner masuk = new Scanner(System.in);
        System.out.println("______________________________________________");
        //dalam program saya saya meminta user untuk memasukan banyaknya mahasiswa
        //banayknya mahasiswa ini menjadi panjang array yang akan saya gunakan dalam looping 
        //program saya ini akan melakukan looping sebanyak mahasiswa yang dimasukan user dan 
        //di simpan di dlaam variabel banyak
        System.out.print("Masukan Banyaknya Mahasiswa\t:");
        int banyak = masuk.nextInt();
        System.out.println("_________________________________________________");

        //lalu membuat array of object dari kelas mahasiswa dengan nama input 
        //lalu menginisiasi panjang array dengan nilai yang didapat dari user yang di simpan di variabel banyak
        mahasiswa[] input = new mahasiswa[banyak];

        System.out.println("Lengkapi Data Diri Anda");
        //membuat looping 
        //looping ini bertujuan unutuk memasukan semua nilai dari atribut di kelas mahasiswa menggunakan array object
        //yang sudah di deklarasikan 
        //semua atribut itu akan di masukan di array yang dimulai dari index ke 0
        //jadi semua data-datanya tersimpan dengan teratur di dalam array,suatu ketika kita membuathkan data 
        //yang ada di dalam array ini kita tinggal mengaksesnya menggunakan object array dari kelas mahasiswa ini
        //banyaknya data dari atribut yang di simpan di dlaam array ini bergantung dari panjang array yang di masukan 
        //oleh user tadi (banyaknya mahasiswa)

        for (int a = 0; a < input.length; a++) {

            //kita harus membuat dan menginisiasi object dari kelas mahasiswa yang dimulai dari iterasi ke 1 ini 
            //ini mau memberitahukan bahwa semua iterasi object array dari index ke nol itu adalah object dari kelas mahasiswa
            input[a] = new mahasiswa();
            masuk.nextLine();
            //di dalam program saya ini saya tidak menggunakan contruktor saya langsung menggunakan method set
            //unutk menerima inputan nilai dari user,lalu di simpan ke dalam array
            //ketika ingin mengganti atau baru ingin memasukan nilai dari semua atribut yang ada di kelas mahasiswa ini 
            //saya menggunakan method set
            System.out.print("Nama\t:");
            String nama = masuk.nextLine();
            input[a].setNama(nama);

            System.out.print("Nim\t:");
            String nim = masuk.nextLine();
            input[a].setNim(nim);

            System.out.print("Tanggal Lahir dd/mm/yyy\t:");
            String tgl = masuk.nextLine();
            input[a].setTanggallahir(tgl);

            System.out.print("Nilai UTS-1\t:");
            double uts1 = masuk.nextDouble();
            input[a].setUts1(uts1);

            System.out.print("Nilai UTS-2\t:");
            double uts2 = masuk.nextDouble();
            input[a].setUts2(uts2);

            System.out.print("Nilai UAS\t:");
            double uas = masuk.nextDouble();
            input[a].setUas(uas);
            masuk.nextLine();
        }
        //membuat object baru dari kelas mahasiswa dengan nama tertinggi dan terendah,sesuai dengan namanua 
        //kedua object ini memiliki fungsi yang sama sesuai nama mereka yaitu unutk mencari nilai tertinggi dan terendah dan unnutk mengakses 
        //atribut dari kelas mahasiswa yang mempunyai nilai tertinggi dan terendah
        mahasiswa tertinggi, terendah;

        //menginisiasi object tertinggi dan terendah dengan array inout =0
        tertinggi = terendah = input[0];
        //membuat danmenginisiasi unutuk mencari nilai rata-rata dari tiap uts dan uas
        //tipe data variabel ini adalah double
        double rata1 = 0, rata2 = 0, rata3 = 0;
        double finnal, ratafinal = 0;
        //membuat variabel unutuk mentimpan hasil konversi nilai dari method konversi
        //tipe data variabel ini char
        char konversi;

        //berikut adlaah format unutk mencetak tabel dengan rapij
        System.out.println(
                "__________________________________________________________________________________________________________");
        System.out.printf("%-4s %-10s %-20s %-20s %-10s %-10s %-10s %-10s %-8s%n", "No.", "Nim", "Nama", "Tgl Lahir",
                "Uts1", "Uts2", "Uas", "Final", "Nilai");
        System.out.println(
                "__________________________________________________________________________________________________________");
        //looping ini dibuat untuk menjumlahkan tiap nilai uts1 uts2 dan uas dari data yang disimpan di index ke 0 sampai array length
        //mencari nilai final 
        //mencari konversi nilai 
        //mencari nilai tertinggi
        for (int a = 0; a < input.length; a++) {

            //variabel final menampung atau menyalin juga 
            //nilai yang di dpaat dari perhitungan method nilai final yang dipanggil menggunakan 
            //object input yang di mulai dari iterasi ke 1 index ke 0
            finnal = input[a].nilaifinal();

            //variabel konversi ini menyalin juga nilai yang di dapatkan dari 
            //pemanggilan method konversi menggunakan object input yang dimulai dari index ke nol
            konversi = input[a].konversi(finnal);

            //ini adalah variabel-variabel yang melakukan penjumlahan sampai looping berhenti
            rata1 += input[a].getUts1();
            rata2 += input[a].getUts2();
            rata3 += input[a].getUas();

            //mencari nilai terendah dan tertinggi menggunakan pengecekan di dalam percabangan 
            if (input[a].nilaifinal() < terendah.nilaifinal()) {
                terendah = input[a];
            } else if (input[a].nilaifinal() > tertinggi.nilaifinal()) {
                tertinggi = input[a];
            }
            System.out.printf("%-4d %-10s %-20s %-20s %-10.2f %-10.2f %-10.2f %-10.2f %-8s%n", (a + 1),
                    input[a].getNim(), input[a].getNama(), input[a].getTanggallahir(), input[a].getUts1(),
                    input[a].getUts2(), input[a].getUas(), finnal, konversi);

        }

        //mencetak semua nilai yang sudha kita dapatkan perhitungannya menggunakan pemanggilan method menggunakan object
        //ataupaun pengecekanmenggunakan kondisi percabangan 
        //khusus untuk mencetak hasil nilai rata-rata dari uts1 uts 2 dan uas kita perlu membaginya dengan panjang array di luar looping
        //dengan alasan jika kita langsung membaginya di dlaam looping hasil yang di dpatkan adlaah rata-rata nilau uts1 uts2 dan uas 
        //per iterasi berlangung jadi setiap kali elemen iterasi bertambbah maka nilai rata-rata langsung divcari sekaligus 
        System.out.println(
                "__________________________________________________________________________________________________________");

        System.out.printf("Rata-rata uts1 mahasiswa\t: %.2f%n", rata1 / input.length);
        System.out.printf("Rata-rata uts2 mahasiswa\t: %.2f%n", rata2 / input.length);
        System.out.printf("Rata-rata uas mahasiswa \t: %.2f%n", rata3 / input.length);

        //mencetak nilai tertinggi menggunakan object tertinggi dari kelas mahasisswa yang sudah kita buar sebelumnya 
        System.out.println("_______________________________________________________");
        System.out.println("Nilai Tertinggi\t\tNama\t:" + tertinggi.getNama());
        System.out.println("\t\t\tNim\t:" + tertinggi.getNim());
        System.out.println("\t\t\tTglLahir:" + tertinggi.getTanggallahir());
        System.out.println("\t\t\tUts1\t:" + tertinggi.getUts1());
        System.out.println("\t\t\tUts2\t:" + tertinggi.getUts2());
        System.out.println("\t\t\tUas\t:" + tertinggi.getUas());
        System.out.println("_______________________________________________________");

    }

}
