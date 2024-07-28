package javaRegex;

import java.util.regex.*;

public class dotSinggle {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".s", "as"));
        System.out.println(Pattern.matches("..s", "mks"));
        System.out.println(Pattern.matches(".s", "mst"));// false (has more than 2 char)
        System.out.println(Pattern.matches(".s", "as"));// false (has more than 2 char)
        System.out.println(Pattern.matches("..s", "mas"));// true (3rd char is s)
    }

}
