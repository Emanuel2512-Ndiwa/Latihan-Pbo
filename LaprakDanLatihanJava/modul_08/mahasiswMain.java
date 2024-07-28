package modul_08;

//import kelas javax pad aprogram kali ini saya mengimport kelas ini agar tampilan output program kita itu lebih interaktif 
import javax.swing.*;;

public class mahasiswMain {
    public static void main(String[] args) {

        // JOptionPane.showMessageDialog dalam kelas javax perintah ini adalah perintah
        // yang tidak beda jauh dengan system.iut.ptintln perbedaan utamanya adlaah
        // ketika kita menggunakan ini maka output dari program kita itu tidak di
        // tampilkan di comanprompt kita tetapi langsung di tengah-tengah layar laptop
        // kita
        JOptionPane.showMessageDialog(null, "Selamat Datang Di Universitas Sanata Dharma");
        int jumlah = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Mahasiswa Di Universitas Ini\t:"));
        // kali ini saya akan menerapkan konsep heterogen pada kelas mahasiswa ini
        // saya aan menerima begitu banyak data mahasiswa dari user dan data tersebut
        // dapat mereka masukan sesuai jumlah yang mereka kehendaki unutk dapat
        // menampung berpa nilai yang akan mereka berikan jumlahnya kita membuatuhkan
        // sebuah variabel yang akan menyimpan banyaknya jumlah mahasiswa yang akan
        // mereka masukan dan datanya akan kita olah ---> oleh karena itu kita membuat
        // variabel yang bernama jumlah
        String ttl, nim, nama, gelar;// mendeklarasikan variabel unutk menampung nilai2 sementara sebagai nilai yang
                                     // akan di masukan ke dalam sebuah atribut dari kelas mahasiswa yang kita miliki
        mahasiswa mhs[] = new mahasiswa[jumlah];// karena data yang begitu banyak dan agar data kita dapat terseimpan
                                                // dengan teraturkita membutuhkan sebuah array of object dari kelas
                                                // mahasiswa,perlu di ingat bahwa di dlaam array ini hanya meyimpan
                                                // alamat dari nilai data tersebut bukan menyimpan nilai dari variabel
                                                // tersebut
        for (int a = 0; a < mhs.length; a++) {// lalu agar bisa memasukan data sesuai panjang array tersebut ktia
                                              // membutuhkan looping for unutk melaukan iterasu sesuai panjang array
                                              // yang ktia miliki
            nim = JOptionPane.showInputDialog("Masukan Nim");
            nama = JOptionPane.showInputDialog("Masukan Nama");
            ttl = JOptionPane.showInputDialog("Masukan Tempat,Tanggal Lahir");
            do {// di dalam looping for ini saya juga melakukan sebuah looping lagi tetapi
                // menggunakan do while
                // yang dimana looping ini hanay akan bekerja jika user tidak memasukan data
                // gelar denga benar jika user salah memasukan maka program syaa akan meminta
                // user terus memasukan gelarnya hingga benar
                gelar = JOptionPane.showInputDialog("S1/S2");
                if (!gelar.equalsIgnoreCase("S1") && !gelar.equalsIgnoreCase("S2")) {
                    JOptionPane.showMessageDialog(null, """
                                Upssss Anda Salah Menginput
                                Silahkan Masukan Ulang Gelar
                                ---------------------------------------

                            """);
                }
            } while (!gelar.equalsIgnoreCase("S1") && !gelar.equalsIgnoreCase("S2"));

            mhs[a] = new mahasiswas1(nama, nim, ttl);// array of object menginisiasi construktornya dengan menggunakan
                                                     // nilai-nilai yang di dapat dari variabel untuk menampung nilai
                                                     // dari user

            // lalu yang ini adalah kondisi unutk melakukan pengecekan apakh user memasukan
            // gelar s1 atau s2
            /// sehingga ketika memasukan data ke dlaam konstruktornya itu benar
            if (gelar.equalsIgnoreCase("s1")) {

                double uts1 = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai Uts 1"));
                double uts2 = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai Uts2"));
                double uas = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai Uas"));
                mhs[a].nilai(uts1, uts2, uas);

            } else if (gelar.equalsIgnoreCase("s2")) {

                double uts11 = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai Uts 1"));
                double uts21 = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai Uts2"));
                double uas11 = Double.parseDouble(JOptionPane.showInputDialog("Masukan Nilai Uas"));
                mhs[a].nilai(uts11, uts21, uas11);

            }
        }
        // Menampilkan daftar nama, jenjang pendidikan, dan nilai huruf dari semua
        // mahasiswa
        JOptionPane.showMessageDialog(null,
                "Daftar Nama, Jenjang Pendidikan, dan Nilai Huruf dari Semua Mahasiswa:");
        for (mahasiswa m : mhs) {
            JOptionPane.showMessageDialog(null, "Nama: " + m.getNama() + "\nJenjang Pendidikan: " + m.getGelar()
                    + "\nNilai Huruf: " + m.konversi());
        }

        // Menampilkan daftar mahasiswa S1 yang lulus
        JOptionPane.showMessageDialog(null, "Daftar Mahasiswa S1 yang Lulus:");
        for (mahasiswa m : mhs) {

            if (m instanceof mahasiswas1 && m.isLulus()) {
                JOptionPane.showMessageDialog(null, "Nama: " + m.getNama() + "\nJenjang Pendidikan: " + m.getGelar()
                        + "\nNilai Huruf: " + m.konversi());

            }

        }
    }
}
