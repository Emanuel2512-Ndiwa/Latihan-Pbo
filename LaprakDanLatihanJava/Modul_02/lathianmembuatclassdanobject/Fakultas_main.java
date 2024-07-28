package Modul_02.lathianmembuatclassdanobject;

public class Fakultas_main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Dosen dan mengisi nilai atribut
        ketuaprodi ketuaProdi = new ketuaprodi("12345", "John Doe");

        // Membuat objek dari kelas Fakultas_saintek dan mengisi nilai atribut
        Fakultas_saintek programStudi = new Fakultas_saintek("PS001", "Informatika", ketuaProdi);

        // Menampilkan informasi Nama Program Studi dan Ketua Program Studi
        System.out.println("________________________________________________________________________________________");
        System.out.println("Program Studi\t\t: " + programStudi.getNamaProdi());
        System.out.println("Ketua Program Studi\t: " +"Nama:"+ programStudi.getKetuaProdi().getNama() + "  , " +"Nip:"+ programStudi.getKetuaProdi().getNIP());
        System.out.println("________________________________________________________________________________________");
    }
}


