package latihaninharintance;

import java.util.List;

public class departemen {

    private String namayayasan;
    private List<Student> mahasiswa;

    public List<Student> getMahasiswa() {
        return mahasiswa;
    }

    public departemen(String namayayasan,List<Student> mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.namayayasan=namayayasan;
    }
    public void tambahmahasiswa(Student mahasiswaa){
        mahasiswa.add(mahasiswaa);
    }

}
