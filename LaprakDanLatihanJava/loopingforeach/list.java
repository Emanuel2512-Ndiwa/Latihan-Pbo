package loopingforeach;
import java.util.ArrayList;
import java.util.List;
public class list {
public static void main(String[] args) {
    List <String>variabel= new ArrayList<>();
    variabel.add("Emanuel Matroni Ndiwa");
    variabel.addAll(List.of("Kelas PBO","Kelas SDL","Kelas SDL"));
    variabel.set(0, "Eman");
    variabel.remove(1);
    System.out.println(variabel.get(0));

    for(var wadah : variabel){
        System.out.println(wadah);
    }

}    
}
