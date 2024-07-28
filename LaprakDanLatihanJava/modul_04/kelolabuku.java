package modul_04;

import java.util.Scanner;

public class kelolabuku {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        //dalam progrma buku ini saya meminta user yang memasukan 
        //berapa jumlah buku yang akan di simpan 
        //yang di mana ini menjadi patokan unutk saya ketika membuat looping   
        System.out.println("Jumlah Buku Yang Akan Disimpan\t:");
        //membuat variabel baru unutuk menyimpan nilai banyak buku dari user
        int Jumlah = masuk.nextInt();

        //membuat array of object dari kelas buku dengan nama arraynya adalah buku
        //dan menginisiasi panjang arraynya itu dengan banyaknya jumlah buku yang dimasukan 
        //oleh user 
        buku[] buku = new buku[Jumlah];
        System.out.println("\t\tData buku");
        System.out.println("----------------------------------------");
        //looping ini bertujuan untuk memasukan semua nilai dari atribut yang dimiliki di kelas buku 
        //tidak menggunakan conteruktor tetapi langsung saja menggunakan method set dan get 
        for (int a = 0; a < buku.length; a++) {

            //membuat object tiap iterasi dari buku ini adlaah dari kelas mahasiswa
            //membuat object 
            buku[a] = new buku();
            masuk.nextLine();
            System.out.print("Kode Buku\t:");
            String kodebuku = masuk.nextLine();
            buku[a].setKodebuku(kodebuku);
            System.out.print("Judul\t:");
            String judul = masuk.nextLine();
            buku[a].setJudul(judul);
            System.out.print("Tahun Terbit\t:");
            String tahun = masuk.nextLine();
            buku[a].setTahunterbit(tahun);
            System.out.print("Nama Pengarang\t:");
            String nama = masuk.nextLine();
            buku[a].setNama(nama);
            masuk.nextLine();

        }
        //menvetak semua nilai menggunakan format tabel dan method get unutk mengakses semua nilai dari atribut kelas buku
        System.out.printf("%-20s %-20s %-20s %-20s%n", "Kode Buku", "Judul ", "Nama Pengarang", "Tahun Terbit");
        for (int a = 0; a < buku.length; a++) {
            System.out.printf("%-20s %-20s %-20s %-20s%n", buku[a].getKodebuku(), buku[a].getJudul(), buku[a].getNama(),
                    buku[a].getTahunterbit());

        }

        System.out.print("Cari Tahun Terbit\t:");
        String tahun = masuk.nextLine();
        //meminta user memasukan tahun terbit buku yang dicari
        //membuat variabel baru unutk melakukan penjumlahan banyaknya buku
        int jumlahbuku = 0;
        //looping unutk menghitung jumlah banyaknya buku dan unuttuk mencari tahun terbit yang dimasukan user itu
        //terdapat dapa tahun yang bernar atau ada yang salah
        for (int a = 0; a < buku.length; a++) {
            
            if (tahun.equals(buku[a].getTahunterbit())) {
                jumlahbuku++;
            }else{
                System.out.println( "Buku Pada Tahun Ini Tidak Ditemukan ");
            }
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("Jumlah Buku Pada Tahun Terbitan Ini: " + jumlahbuku);
        System.out.println("----------------------------------------------------------");
        System.out.print("Cari Nama Pengarang: ");
        //mencari nama pengarang yang dimasukan user dan dimasukan ke dalam variabel cari nama 
        //lallu di dlaam looping dilakukan penecekan dimulai dari iterasi ke 1
        //dan langsung mencetaknya dalam bentuk tabel juga 
        String carinama = masuk.nextLine();
        for (int a = 0; a < buku.length; a++) {
            if (carinama.equals(buku[a].getNama())) {
                System.out.printf("%-20s %-20s %-20s %-20s%n", buku[a].getKodebuku(), buku[a].getJudul(), buku[a].getNama(),
                        buku[a].getTahunterbit());
            }
        }

    }

}
