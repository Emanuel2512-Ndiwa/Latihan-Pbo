package modul_09;

public class MainHewan {
    public static void main(String[] args) {
        Hewan a;
        System.out.println("Method dari kelas Serigala");
        System.out.println();
        System.out.println("|");
        System.out.println("V");
        a= new Serigala();
        a.suara();
        System.out.println();
        System.out.println("Method Dari Kelas Kucing");
        System.out.println();
        System.out.println("|");
        System.out.println("V");
        a= new Kucing();
        a.suara();
        System.out.println();
        System.out.println("Method Dari Kelas Bebek");
        System.out.println();
        System.out.println("|");
        System.out.println("V");
        a = new Bebek();
        a.suara();


        

    }
}
