package javaString;

public class stringComparation {
    public static void main(String[] args) {

        String s1 = "Rafael";
        String s2 = "RAFAEL";
        String s3 = "FAEL";
        String s4 = new String("rAfAEL");
        String s5 = "Satoru";
        System.out.println(s1.equals(s2));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
    }
}
