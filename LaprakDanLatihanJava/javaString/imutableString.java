package javaString;

//tidak dapat di ubah
public class imutableString {

    public static void main(String[] args) {
        System.out.println("Contoh Imutable");
        System.out.println("=====================");
        String s = "Eman";
        s.concat("Ndiwa");
        System.out.println(s);
        System.out.println();
        System.out.println("=======================");
        System.out.println();
        System.out.println("Cara Mengubah");
        System.out.println("=========================");
        s = s.concat("\t" + "Ndiwa");
        System.out.println(s);

    }
}
