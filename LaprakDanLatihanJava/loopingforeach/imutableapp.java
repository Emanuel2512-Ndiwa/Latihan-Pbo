package loopingforeach;

import java.util.List;

public class imutableapp {
    public static void main(String[] args) {
        person p1 = new person("ABG");
        p1.addhoby("Futsal");
        p1.addhoby("Makan");

        // lakukansesuatupadahobie(p1.getHobies());

        for(var a : p1.getHobies()){
            System.out.println(a);
        }
    }

    public static void lakukansesuatupadahobie(List<String> hobbies){

         hobbies.add("tidak Suka");
    }
    
}
