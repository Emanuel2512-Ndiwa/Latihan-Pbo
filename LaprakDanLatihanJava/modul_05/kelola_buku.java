package modul_05;

import java.util.Scanner;

public class kelola_buku {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        System.out.println("\t\tPerpustakaan USD");
        System.out.println("=======================================");
        System.out.println();

        System.out.print("Jumlah Buku Yang Dimasukan\t:");
        int jumlahBuku = masuk.nextInt();
        
        BUKU[] buku = new BUKU[jumlahBuku];

        for (int i = 0; i < buku.length; i++) {
            masuk.nextLine();
            System.out.println("\nData Buku ke-" + (i + 1));

            System.out.print("Masukkan kode buku        \t: ");
            String kodeBuku = masuk.nextLine();

            System.out.print("Masukkan judul buku       \t: ");
            String judul = masuk.nextLine();

            System.out.print("Masukkan tahun terbit buku\t: ");
            String tahunTerbit = masuk.nextLine();

            System.out.print("Masukan Jumlah Pengarang\t:");
            int jp = masuk.nextInt();

            BUKU bukuBaru = new BUKU(kodeBuku, judul, tahunTerbit); // Buat objek buku baru di setiap iterasi

            PENGARANG[] aray = new PENGARANG[jp]; // Inisialisasi array pengarang

            for (int j = 0; j < aray.length; j++) {
                masuk.nextLine();
                System.out.println("\nPengarang ke-" + (j + 1));
                System.out.print("NIK   \t: ");
                String NIK = masuk.nextLine();
                System.out.print("Nama  \t: ");
                String nama = masuk.nextLine();
                System.out.print("Alamat\t: ");
                String alamat = masuk.nextLine();

                aray[j] = new PENGARANG(NIK, nama, alamat); // Tambahkan pengarang ke array aray
            }
            bukuBaru.setDaftarPengarang(aray); // Set array pengarang ke dalam buku baru

            buku[i] = bukuBaru; // Masukkan objek buku baru ke dalam array buku

            bukuBaru.tampilkanInfo(); // Tampilkan info buku setelah pengisian pengarang

            // Tambahkan baris kosong di antara info buku
            System.out.println();
        }
        

        System.out.print("Masukkan tahun yang ingin dicari: ");
        String tahunCari = masuk.next();
        int jumlahBukuTahun = 0;

        BUKU bukuTerlama = buku[0];
        BUKU bukuTerbaru = buku[0];

        for (BUKU b : buku) {
            if (b.getTahunTerbit().equals(tahunCari)) {
                jumlahBukuTahun++;
            }

            if (Integer.parseInt(b.getTahunTerbit()) < Integer.parseInt(bukuTerlama.getTahunTerbit())) {
                bukuTerlama = b;
            }

            if (Integer.parseInt(b.getTahunTerbit()) > Integer.parseInt(bukuTerbaru.getTahunTerbit())) {
                bukuTerbaru = b;
            }
        }

        System.out.println("==================================================================================");
        System.out.println("=>Jumlah buku yang diterbitkan pada tahun " + tahunCari + ": " + jumlahBukuTahun);
        System.out.println("==================================================================================");
        System.out.println();
        System.out.println();
        System.out.println("==================================================================================");
        System.out.println("=>Buku terbitan paling lama:");
        System.out.println("==================================================================================");
        bukuTerlama.tampilkanInfo();

        System.out.println();
        System.out.println();
        System.out.println("==================================================================================");
        System.out.println("Buku terbitan paling baru:");
        System.out.println("==================================================================================");
        bukuTerbaru.tampilkanInfo();

        masuk.close(); // Pindahkan penutupan Scanner ke luar loop
    }
}
