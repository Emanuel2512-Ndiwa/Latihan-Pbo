package modul_07;

//import kelas scanner 
import java.util.Scanner;

//membuat kelas mahasiswa yang dimana berisi method main
public class mainMahasiswa {
        public static void main(String[] args) {
                // membuat object scanner
                Scanner masuk = new Scanner(System.in);
                System.out.println();
                System.out.println("\t\t Mahasiswa USD");
                System.out.println();
                System.out.println();
                System.out.println("---> Mahasiswa S1");
                System.out.println();
                // meminta jumlah banyaknya mahasiswa tujuannya agar kita bisa menambahkan
                // sebagai panjang array
                // saat melakukan loooping
                // dengan memberikan perintah ini agar program kita fleksibel dalam memasukan
                // jumlah data berapa banyak dan datanya
                // di dapatkan melalui user bukan melalui kita sebagai programer
                System.out.print("Banyak Mahasiswa\t:");
                int bnyak = masuk.nextInt();
                System.out.println();
                System.out.println();
                mahasiswaS1[] mhs1 = new mahasiswaS1[bnyak];// membuat array of object dari kelas mahasiswaS1
                // menggunakan array of object agar bisa menampung berapun jumlah data yang di
                // masukan user dan datanya tersimpan rapih terurut mengguakan index
                // saat kita membuatuhkannya unutk di panggil atau melakukan proses yang lainya
                // kita bisa panggil sesuai alamat index data yang kita ppunya
                for (int a = 0; a < mhs1.length; a++) {
                        // melakukan looping untuk memasukan semua data yang di butuhkan sesuai atribut
                        // yang dimiliki dari kelas mahasiswa s1
                        // dan banyaknya data yang akan dimasukan sesuai jumlah banyak mahasiswa yang di
                        // masukan user
                        System.out.println();
                        System.out.println("Data ---->\t" + (a + 1));
                        System.out.println("----------------------------------------------------");
                        masuk.nextLine();
                        System.out.print("Nama              \t:");
                        String nama = masuk.nextLine();
                        System.out.print("Nim               \t:");
                        String nim = masuk.nextLine();
                        System.out.print("Tanggal Lahir     \t:");
                        String tanggal = masuk.nextLine();

                        System.out.print("Uts1              \t:");
                        double uts1 = masuk.nextDouble();

                        System.out.print("Uts2              \t:");
                        double uts2 = masuk.nextDouble();

                        System.out.print("Uas               \t:");
                        double uas = masuk.nextDouble();
                        masuk.nextLine();
                        // membuat mendeklarasikan dan membuat object dari kelas mahasiswa s1yang
                        // dimulai dari index ke 0(iinde ke a)
                        // kita perlu mendeklarasikan bahwa object mahasiswa yang dimulai dari index ke
                        // nol ini adalah object dari kelas mahasiswa s1 dan langsung
                        // mengisikan nilai parameter,nilai parameter ini didapatkan setiap kali looping
                        // dan user memasukan data-data sesuai kebutuhan pada variabel parameter ini
                        mhs1[a] = new mahasiswaS1(nama, nim, tanggal, uts1, uts2, uas);
                }
                System.out.println();
                System.out.println();
                System.out.println("---> Mahasiswa S2");
                System.out.println();
                System.out.print("Banyak Mahasiswa\t:");
                int banyak = masuk.nextInt();
                mahasiswaS2[] mhs2 = new mahasiswaS2[banyak];// membuat array of object dari kelas mahasiswaS2
                // menggunakan array of object agar bisa menampung berapun jumlah data yang di
                // masukan user dan datanya tersimpan rapih terurut mengguakan index
                // saat kita membuatuhkannya unutk di panggil atau melakukan proses yang lainya
                // kita bisa panggil sesuai alamat index data yang kita ppunya

                for (int a = 0; a < mhs2.length; a++) {
                        // melakukan looping untuk memasukan semua data yang di butuhkan sesuai atribut
                        // yang dimiliki dari kelas mahasiswa s2
                        // dan banyaknya data yang akan dimasukan sesuai jumlah banyak mahasiswa yang di
                        // masukan user
                        System.out.println();
                        System.out.println("Data ---->\t" + (a + 1));
                        System.out.println("----------------------------------------------------");
                        masuk.nextLine();
                        System.out.print("Nama          \t:");
                        String nama = masuk.nextLine();
                        System.out.print("Nim           \t:");
                        String nim = masuk.nextLine();
                        System.out.print("Tanggal Lahir \t:");
                        String tanggal = masuk.nextLine();

                        System.out.print("Uts1          \t:");
                        double uts1 = masuk.nextDouble();

                        System.out.print("Uts2          \t:");
                        double uts2 = masuk.nextDouble();
                        masuk.nextLine();
                        System.out.print("Uas           \t:");
                        double uas = masuk.nextDouble();
                        masuk.nextLine();
                        // membuat mendeklarasikan dan membuat object dari kelas mahasiswa s2yang
                        // dimulai dari index ke 0(iinde ke a)
                        // kita perlu mendeklarasikan bahwa object mahasiswa yang dimulai dari index ke
                        // nol ini adalah object dari kelas mahasiswa s1 dan langsung
                        // mengisikan nilai parameter,nilai parameter ini didapatkan setiap kali looping
                        // dan user memasukan data-data sesuai kebutuhan pada variabel parameter ini

                        mhs2[a] = new mahasiswaS2(nama, nim, tanggal, uts1, uts2, uas);
                }
                System.out.println();
                //menampilkan semua data mahasiswa baik mahasiswa s1 ataupun mahasiswa s2 di sini kita menggunakan format string agar tampilannya ouputnya berbentuk tabel unutk ukuran formatnya sesuai kebutuhan 
                //lalu unutk menampilkan smeua data yang sudha di masukan kita menggunakan looping for kemudian unutk mendapatkan smeua data yang sudah di masukan user ke dalam konstruktor kita menggunakan method get

              
                
                System.out.println("Data Lengkapp Seluruh Mahasiswa S1");
                System.out.println(
                                "--------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("%-15s %-15s %-19s %-15s %-15s %-15s %-15s %-15s%n", "Nama", "Nim", "Tanggal Lahir",
                                "Uts1", "Uts2",
                                "Uas", "Total Nilai", "Hasil Konversi");
                System.out.println(
                                "--------------------------------------------------------------------------------------------------------------------------------------------------------------");
                for (int a = 0; a < mhs1.length; a++) {
                        double finalnilai = mhs1[a].nilaiFinal();
                        System.out.printf("%-15s %-15s %-15s %-15.2f %-15.2f %-15.2f %-15.2f %-15s%n",
                                        mhs1[a].getNama(), mhs1[a].getNim(),
                                        mhs1[a].getTanggalLahir(), mhs1[a].getUts1(), mhs1[a].getUts2(),
                                        mhs1[a].getUas(), mhs1[a].nilaiFinal(), mhs1[a].konversi(finalnilai));
                        System.out.println();
                        System.out.println();

                }
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("Data Lengkapp Seluruh Mahasiswa S2");
                System.out.println(
                                "-------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("%-15s %-15s %-19s %-15s %-15s %-15s %-50s %-15s%n", "Nama", "Nim", "Tanggal Lahir",
                                "Uts1", "Uts2",
                                "Uas", "Total Nilai", "Hasil Konversi");
                System.out.println(
                                "-------------------------------------------------------------------------------------------------------------------------------------------------------------");
                for (int a = 0; a < mhs2.length; a++) {
                        double nilaifinall = mhs2[a].nilaiFinal();
                        System.out.printf("%-15s %-15s %-15s %-15.2f %-15.2f %-15.2f %-15.2f %-15s%n", mhs2[a].getNama(),
                                        mhs2[a].getNim(),
                                        mhs2[a].getTanggalLahir(), mhs2[a].getUts1(), mhs2[a].getUts2(),
                                        mhs2[a].getUas(), mhs2[a].nilaiFinal(), mhs2[a].konversi(nilaifinall));

                }
                masuk.close();

        }
}
