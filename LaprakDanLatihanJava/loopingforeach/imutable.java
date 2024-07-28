package loopingforeach;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class imutable {

    public static void main(String[] args) {
        List<String> satudata = Collections.singletonList("Satu data saja yang di simpan dan tidka dapat di ubah");
        List <String>kosong = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        //kalau yang mutable itu data yang sudah di isi bisa di rubah 
        //agar data tidka dapa tdi ubah maka kita ubah ke imutable list
        mutable.add("Ekko");
        mutable.add("Asep");
        //ini cara ubah ke imutable 
        List<String> imutable = Collections.unmodifiableList(mutable);

        //kalau ini cara buat imutable yang datanya dimasukan secara bersamaan 
        List<String> data = List.of("Makan Nasi","Jual Nasi");
        
    }
    
}
