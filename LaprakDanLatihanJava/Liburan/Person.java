package Liburan;

public abstract class Person {

    protected String name,addres,gender;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public abstract void displayinfo();

}
