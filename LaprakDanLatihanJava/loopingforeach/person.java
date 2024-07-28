package loopingforeach;
//imutable list adalah struktur data list yang dimana elemennya tidak dapat 
//di ubah setelah list itu di buat

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class person {

    private String name;
    private List<String> hobies;

    public person(String name) {
        this.name = name;
        this.hobies = new ArrayList<>();
    }

    public void addhoby(String hobby) {
        hobies.add(hobby);
    }

    public List<String> getHobies() {
        //bikin list baru tetapi tidak merubah datanya
        //jangan boleh di rubah ini adlaah proses enskapsulasi 
        return Collections.unmodifiableList(hobies);
    }

    public String getName() {
        return name;
    }

}
