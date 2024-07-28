package modul_03;

//membuat programstudimain
public class programstudimain {
    public static void main(String[] args) {
        // membuat objek dari ketua dan mengisi parameternya
        ketua input = new ketua("1244", "Eman ndiwa");

        // membuat objek darikelas program studi
        program_studi program = new program_studi("PS001", "Informatika", input);
        System.out.println("___________________________________________________________________");
        System.out.println("Program Studi\t\t: " + program.getNamaProdi());
        System.out.println("------------------------------------------------------------------");
        System.out.println("\t\tKetua Program Studi\t:");
        System.out.println("\t\t" + "-Nama\t:" + program.getKetuaProdi().getNama());
        System.out.println("\t\t" + "-Nip\t:" + program.getKetuaProdi().getNIP());
        System.out.println("___________________________________________________________________");
    }
    // di dalam program ini kita mengisi objek dari kelas ketua ke dalam parameter dari objek programstudi
    // ddengan tujuan kita mengakses setiap atribut dari kelas ketua menggunakan objek dari kelas programstudi
}
