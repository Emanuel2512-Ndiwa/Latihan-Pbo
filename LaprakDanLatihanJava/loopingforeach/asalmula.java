package loopingforeach;

import java.util.Iterator;
import java.util.List;



public class asalmula {

    public static void main(String[] args) {
        Iterable<String> nama = List.of("Eman", "Rio billy");

        //looping for each
        for (var nam : nama) {
            System.out.println(nam);
        }

        //manual for eachnnya atau sebelum adanya looping for each 
        Iterator <String> iterator = nama.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        
    }

}
