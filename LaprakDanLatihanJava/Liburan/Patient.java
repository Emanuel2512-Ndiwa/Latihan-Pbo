package Liburan;

import javax.swing.JOptionPane;

public class Patient extends Person {
    private String complaint;

    public Patient(String name, int age, String complaint) {
        super(name, age);
        this.complaint = complaint;
    }

    public void displayinfo() {
        JOptionPane.showMessageDialog(null, "Nama\t:" + "\nUmur" + age + "\nkeluhan" + complaint);

    }

    public String getNama() {
        return name;
    }

}
