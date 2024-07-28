package javaRegex;

import java.util.regex.*;

public class contohRegex {
    public static void main(String[] args) {

        Pattern p = Pattern.compile(".s");

        Matcher m = p.matcher("as");

        boolean b = m.matches();
        boolean b2 = Pattern.compile(".s").matcher("as").matches();

        boolean b3 = Pattern.matches(".s", "as");
        System.out.println(b + "\t" + b2 + "\t" + b3);

    }

}
