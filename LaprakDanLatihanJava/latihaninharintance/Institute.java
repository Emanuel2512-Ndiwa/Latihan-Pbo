package latihaninharintance;

import java.util.List;

public class Institute {
    private String namainstitut;
    private List<departemen> yayasan;

    public Institute(String namainstitut, List<departemen> yayasan) {
        this.namainstitut = namainstitut;
        this.yayasan = yayasan;
    }

    public void tambahyayasan(departemen yysan){
        yayasan.add(yysan);
    }

    public int getTotalmahasiswainstitut(){
        int inisiasi =0 ;
        List<Student> mahasiswa = null;
        for (departemen dept : yayasan){
            mahasiswa = dept.getMahasiswa();

            for ( Student s : mahasiswa){
                inisiasi ++;
            }
        }
        return inisiasi;
    }


}
