package loopingforeach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class contohcolection {
    public static void main(String[] args) {
    Collection <String> colection = new ArrayList<>();

    //menambahkan value satu persatu 
    colection.add("Emannuel Matroni NDiwa");
    colection.add("Mario Fenerial Leta Billy");
    //memanmbahkan sebanyak mungkin sesuai kenutuhan
    colection.addAll(List.of("Eksandrio Gianfranco Judha","Febrianus Adi Sovian"));
    for (var wadah : colection){
        System.out.println(wadah);
    }
    }
    
}
