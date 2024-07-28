package latihaninharintance;

import java.util.ArrayList;
import java.util.List;

public class agregasicontoh {

    public static void main(String[] args) {

        Student s1 = new Student("paul", 1);
        Student s2 = new Student("jefri", 1);
        Student s3 = new Student("ande", 5);
        Student s4 = new Student("elva", 3);

        List<Student> mardiwiyata = new ArrayList<Student>();
        mardiwiyata.add(s1);
        mardiwiyata.add(s2);

        List <Student> svd = new ArrayList<Student>();
        svd.add(s3);
        svd.add(s4);

        departemen mardiDepartemen = new departemen("Yayasan Mardiwiyata",mardiwiyata);
        departemen svddepart = new departemen("Yayasan Scd", svd);

        List<departemen> departemens = new ArrayList<departemen>();
        departemens.add(svddepart);
        departemens.add(mardiDepartemen);

        Institute institusi = new Institute("Merdeka", departemens);

        System.out.println("Total Mahasiswa DI Sebuah Institut");

        System.out.println(
            institusi.getTotalmahasiswainstitut()
        );
    
    }

}
