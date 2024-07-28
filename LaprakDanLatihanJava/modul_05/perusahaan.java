package modul_05;
//kita mengimport kelas pegawai dari modul ke dua 
import Modul_02.pegawai;

public class perusahaan {

    //di dlaam kelas perusahaan ini kita membuat atribut yang di butuhkan di dlamannya 
    //kemudian salah satu atribut dari kelas perusahaan ini di ambil dari kelas pegawai 
    //yang di mana kelas pegawai ini menjadi atribut aray of object di dalam kelas perusahaan 
    //relasi yang terjadi di dlaam kelas ini adalah agregasi 

    private String namaperusahaan;//tipe data string nama variabel namaperusahaan 
    private String alamat;//tipe data string nama variabel alamat
    private String pemilik;//tipe data string nama variabel pemilik
    private String npwp;//tipe data string nama variabel npwp
    private pegawai[] Pegawai;//tipe data arrayof object kelas pegawai nama variabelnya pegawai
    
    //di dlaam kelas ini saya membuat dua konstruktor 
    //konstruktor yang pertama digunakan unutuk menginisiasi atribut dari kelas perusahaan yaitu nama alamat pemilik dan npwp
    //sedangkan konstruktor yang ke dua tujuannya untuk menerima secara terpisah argumen objecy array dari kelas pegawai
    public perusahaan(String namaperusahaan, String alamat, String pemilik, String npwp) {//konstruktor 01
        this.namaperusahaan = namaperusahaan;
        this.alamat = alamat;
        this.pemilik = pemilik;
        this.npwp = npwp;
    }

   

    public perusahaan(pegawai[] pegawai) {//konstruktor 02
        Pegawai = pegawai;
    }

    //di bawah ini kita membuat method get dan set dari semua atribut yang kita punta dii kelas ini
    public String getNamaperusahaan() {
        return namaperusahaan;
    }

    public void setNamaperusahaan(String namaperusahaan) {
        this.namaperusahaan = namaperusahaan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    pegawai[] getPegawai() {
        return Pegawai;
    }

    public void setPegawai(pegawai[] pegawai) {
        Pegawai = pegawai;
    }
    //memnbuat method unutk menambahkan data seorang pegawai
    public void tambahpegawaibaru(int a , pegawai peegawai){
        this.Pegawai[a] = new pegawai(peegawai.getNpp(),peegawai.getNama(),peegawai.getGolongan(),peegawai.getStatus(),peegawai.getJumlahanak());
        

    }

    //membuat method unutk menghitung rata-rata gaji dari pegawai
    //method ini memiliki parameter dan parameternya itu bertipe array of object dari kelas pegawai
    //alasannya kita menggunakan parameter dengan tipe array of object dari kelas pegawai adalah
    //kita ingin mendapatkan semua data atribut dari kelas pegawai untuk melaksanakan method ini
    //method ini akan berjalan ketika kita panggil di kelas main menggunakan object dari kelas perusahaan 
    //dan mengisi parameternya dengan object array dari kelas pegawai 
    public void rata_rata(pegawai[] pegawai) {
        pegawai tertinggi = pegawai[0], terendah = pegawai[0];//menginisiasi atau menganggap bahwa gaji tertinggi dan terendah saat ini berada di index ke 0
        int totalGaji = 0;//menginisiasi totalgaji variabel ini digunakan unutk menghitung total gaji 
        //maka variabel ini perlu memiliki nilai awal atau konstanta sebelum melakukan operasi perhitungan sama halnya dengan variabel unutk menghitung rata-rata
        double rataRataGaji = 0;//menginisiasi rata-rata 

        pegawai obj = new pegawai();//membaut object dari kelas pegawai karena di sini kita akan mengakses semua atribut dari kelas pegawai
        int hitungtunjangan =0,hitungtotal=0;

        for (int i = 0; i < pegawai.length; i++) {//kita melakukan looping untuk mendapatkan data yang dimulai dari iterasi ke 1
          
            int gajiPokok = pegawai[i].hitunggajipokok(pegawai[i].getGolongan());
            totalGaji += gajiPokok;

            //dalam kasus ini kita membutuhkan kondisi percabagnan untuk memeriksa gaji tertinggii dan terendah 
            if (gajiPokok > tertinggi.hitunggajipokok(tertinggi.getGolongan())) {

                tertinggi = pegawai[i];
            }
            if (gajiPokok < terendah.hitunggajipokok(terendah.getGolongan())) {
                terendah = pegawai[i];
            }

            //ini adalah menghitung tunjangan yang di dapat dan total gaji secara keseluruhan 
            //karena pegawai itu ada beberapa gaji yang di dapat dimulai dari gaji poko dan tunjangan keluarga 
            //maka kita perlu tahu berpaa total gaji yang ia dapat
            hitungtunjangan=obj.hitungtungtunjangankeluarga(pegawai[i].getStatus(),pegawai[i].getGolongan());
            hitungtotal=obj.htiunggtotal(pegawai[i].getGolongan(),pegawai[i].getStatus(), pegawai[i].getJumlahanak());
            
            //mencetak tunjangan keluarga yang di dpaat dan total gajinya 
            System.out.printf("\t\tNama\t: %-20s | Tunjangan Keluarga\t: %-10d | Total Gaji\t: %-10d%n", 
                    pegawai[i].getNama(), hitungtunjangan, hitungtotal);

        }

        rataRataGaji = (double) totalGaji / pegawai.length;//ini unutk menghitung rata-rata gaji pegawai 


        //mencetak gaji pokok tertinggi dan terendah serta rata-rata gaji
        //di sini yang kita cetak adalah gaji pokok bnukan total gaji dan gaji tertinggi yang kita dapatkan itu berdasarkan perbandingan gaji pokok
        //bukan berdasarkan total gaji
        System.out.println("\t\t---------------------------------------------------------------------");
        System.out.print("\t\tPegawai dengan Gaji Pokok Tertinggi\t:");
        System.out.print("Nama\t: " + tertinggi.getNama() + "\t=>Gaji Pokok: " + tertinggi.hitunggajipokok(tertinggi.getGolongan()));
        System.out.println();
        System.out.println("\t\t---------------------------------------------------------------------");
        System.out.println();
        System.out.print("\t\tPegawai dengan Gaji Pokok Terendah\t:");
        System.out.print("Nama\t: " + terendah.getNama() + "\t=>Gaji Pokok: " + terendah.hitunggajipokok(terendah.getGolongan()));
        System.out.println();
        System.out.println("\t\t----------------------------------------------------------------------");
        System.out.println();
        System.out.print("\t\tRata-rata Gaji Pokok Pegawai \t:"+String.format("%.2f",rataRataGaji));
        System.out.println();
        System.out.println("\t\t-----------------------------------------------------------------------");

    }

}

