package Modul_02;

import java.util.Scanner;


public class pegawaimain {
    public static void main(String[] args) {

        Scanner masuk = new Scanner(System.in);
        Karyawan input = new Karyawan();

        System.out.println("Masukan Data Diri Anda");
        System.out.println("_______________________________");
        System.out.println();

        System.out.print("NPP\t:");
        String npp = masuk.nextLine();
        masuk.nextLine();

        System.out.print("Nama\t:");
        String nama = masuk.nextLine();

        System.out.print("Status\t:");
        String status = masuk.nextLine();

        System.out.print("Golongan\t:");
        int golongan = masuk.nextInt();

        System.out.print("Jumlah Anak\t:");
        int jumlahanak = masuk.nextInt();
        System.out.println();
        
        

        input.setNpp(npp);
        input.setNama(nama);
        input.setStatus(status);
        input.setGolongan(golongan);
        input.setJumlahanak(jumlahanak);

        input.getGolongan();
        input.getJumlahanak();
        input.getNama();
        input.getStatus();
        input.getNpp();

        int hitung_gajipokok=input.hitunggajipokok(golongan);
        int hitung_tunjangan_keluarga=input.hitungtungtunjangankeluarga(status, jumlahanak);
        int hitung_total_gaji=input.htiunggtotal(golongan, status, jumlahanak);

      System.out.println("Berikut Rincian Total Gaji Anda Dari Data Yang Diberikan");
      System.out.println("------------------------------------------------------------");
      System.out.println("Gaji Pokok Golongan"+"("+golongan+")"+"Rp"+hitung_gajipokok);
      System.out.println("Tunjangan Keluaarga Dengan Status\t"+"("+status+")"+"Rp"+hitung_tunjangan_keluarga);
      System.out.println("Total Gaji Anda\tRp"+hitung_total_gaji);
      masuk.close();
    }

}
