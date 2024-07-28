package UAS.UAS_PBO_123;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;;

public class mainProgram {
        public static void main(String[] args) {
                List<pasien> pas = new ArrayList<>();
                pasien pasien = new pasien();
                karyawan admin = new karyawan();
                boolean programRunning = true;
                // looping while untuk menandakan kalau program ini berjalan terus
                // jika variabel program running == false maka programnya berhenti
                while (programRunning) {
                        JOptionPane.showMessageDialog(null, "Selamat Datang Di Klinik Sejahtera");
                        // array String yang menyimpan pilihan menu aplikasi klinik
                        // array ini akan di masukan ke dalam JOption sebagai tampilan menu dan juga
                        // pilihan indeks saat melakukan pemilihan
                        String[] menu = { "Registrasi Akun RS.Sejahtera", "Cek Karyawan", "Jasa Terapi", "Rawat",
                                        "Keluar" };
                        // variabel yang menerima pilihan user dan juga menjadi patokan dalam pengecekan
                        // kondisi indeks mana yang dipilih user dalam percabangan
                        int pilih = JOptionPane.showOptionDialog(null, "Silahkan Pilih ", "Klinik Sejahtera",
                                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, menu,
                                        menu[0]);
                        // menggunakan percabangan swich case untuk melakukan pengecekan user memilih
                        // menu yang mana
                        switch (pilih) {
                                case 0:
                                        JOptionPane.showMessageDialog(null, "Selamar Datang Di Layanan Kami",
                                                        "Klinik Sejahtera",
                                                        JOptionPane.DEFAULT_OPTION);
                                        String[] jumlahPasien = { "Satu Orang", "Banyak Orang" };
                                        int pilihan = JOptionPane.showOptionDialog(null, "Anda Kategori Yang Mana",
                                                        "Klinik Sejahtera",
                                                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                                        null, jumlahPasien,
                                                        jumlahPasien[0]);
                                        switch (pilihan) {
                                                case 0:
                                                        JOptionPane.showMessageDialog(null, "Lengkapi Data Diri Anda",
                                                                        "Klinik Sejahtera",
                                                                        JOptionPane.DEFAULT_OPTION);
                                                        String nama = JOptionPane.showInputDialog("Masukan Nama Anda");
                                                        String id = JOptionPane.showInputDialog("Masukan Id Anda");
                                                        String alamat = JOptionPane.showInputDialog(
                                                                        "Masukan Alamat Tinggal Anda Saat Ini");
                                                        pasien = new pasien(id, nama, alamat);

                                                        break;
                                                case 1:
                                                        int jumlahPas = Integer.parseInt(JOptionPane
                                                                        .showInputDialog("Berapa Jumlah Pasien"));
                                                        JOptionPane.showMessageDialog(null, "Lengkapi Semua Data Diri ",
                                                                        "Klinik Sejahtera",
                                                                        JOptionPane.DEFAULT_OPTION);
                                                        String namaPasien, idPasien, alamatPasien;

                                                        for (int a = 0; a < jumlahPas; a++) {
                                                                JOptionPane.showInternalMessageDialog(null,
                                                                                "Pasien Ke\t\t" + (a + 1));
                                                                namaPasien = JOptionPane.showInputDialog(
                                                                                "Masukan Nama Pasien\t");
                                                                idPasien = JOptionPane
                                                                                .showInputDialog("Masukan Id Pasien\t");
                                                                alamatPasien = JOptionPane
                                                                                .showInputDialog(
                                                                                                "Masukan Alamat Tinggal Pasien Saat Ini\t");
                                                                pasien pasienb = new pasien(idPasien, namaPasien,
                                                                                alamatPasien);
                                                                pas.add(pasienb);

                                                        }
                                                        break;
                                        }

                                        break;
                                case 1:
                                        JOptionPane.showMessageDialog(null, "Berikut Daftar Karyawan Klinik Sejahtera ",
                                                        "Klinik Sejahtera",
                                                        JOptionPane.DEFAULT_OPTION);
                                        admin = new administrasi("235314144", "Maria Duong Hai",
                                                        "Maguwoharjo ,Krodan, Sleman", "0812465823415",
                                                        "Sertifikat FISIOTERAPI",
                                                        "09.00-10.00");
                                        StringBuffer string = new StringBuffer();
                                        string.append(admin.toString());
                                        JOptionPane.showMessageDialog(null, string.toString(), "Klinik Sejahtera",
                                                        JOptionPane.INFORMATION_MESSAGE);

                                        break;
                                case 2:
                                        List<terapis> terapi = new ArrayList<>();
                                        terapi.add(new terapis("Bersertifikat Internasional",
                                                        "Mario Fenerial Leta Billi"));
                                        terapi.add(new terapis("Bersertifikat Nasional", "Eksandrio Gianfanco Judha"));

                                        List<jasaTerapi> jasaTerapis = new ArrayList<>();
                                        jasaTerapis.add(new jasaTerapi("Saraf", 10_000_000, terapi.get(0)));
                                        jasaTerapis.add(new jasaTerapi("Ortopedi", 20_000_000, terapi.get(1)));
                                        jasaTerapis.add(new jasaTerapi("Geriati", 15_000_000, terapi.get(0)));

                                        StringBuffer tampil2 = new StringBuffer();
                                        tampil2.append("Berikut Jenis,Tarif Dan Ahli Yang Menangani" + "\n\n"
                                                        + "========================================");
                                        for (jasaTerapi j : jasaTerapis) {
                                                tampil2.append(j.toString());

                                        }
                                        JOptionPane.showMessageDialog(null, tampil2.toString(), "Klinik Sejahtera",
                                                        JOptionPane.DEFAULT_OPTION);

                                case 3:
                                        JOptionPane.showMessageDialog(null, "Selamat Datang Di Layanan Rawat Terapis ",
                                                        "Terapis", JOptionPane.DEFAULT_OPTION);
                                        String[] daftarAkun = { "Satu Orang", "Banyak Orang" };
                                        int opsi = JOptionPane.showOptionDialog(null,
                                                        "Waktu Anda Mendaftar Anda Mendaftar Menggunakan Kategori Yang Mana",
                                                        "Terapis",
                                                        JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION,
                                                        null, daftarAkun, daftarAkun[0]);
                                        String nama = JOptionPane.showInputDialog("Masukan Nama Member Anda");
                                        if (nama.equalsIgnoreCase(pasien.getNamaPasien())) {
                                                JOptionPane.showConfirmDialog(null,
                                                                "Anda Berhasil Masuk Apakah Ingin Melanjutkan Proses ?",
                                                                "Terapis", JOptionPane.DEFAULT_OPTION);
                                        } else {
                                                JOptionPane.showMessageDialog(null, "Anda Salah Memasukan User Id",
                                                                "Terapis", opsi);
                                        }
                                        break;
                                case 4:
                                        programRunning = false;
                                        break;
                                default:
                                        break;
                        }

                }

        }
}
