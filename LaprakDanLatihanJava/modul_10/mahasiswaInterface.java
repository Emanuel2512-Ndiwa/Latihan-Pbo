package modul_10;

public class mahasiswaInterface implements linear {
    public static int numOfTest = 3;
    protected String nama;
    protected int[] test;
    protected String courseGrade;

    public mahasiswaInterface() {
    }

    public mahasiswaInterface(String nama) {
        this.nama = nama;
        test = new int [numOfTest];
        courseGrade = "***";
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public static int getNumOfTest() {
        return numOfTest;
    }

    public static void setNumOfTest(int numOfTest) {
        mahasiswaInterface.numOfTest = numOfTest;
    }

    public int[] getTest() {
        return test;
    }

    public void setTest(int[] test) {
        this.test = test;
    }

    public void setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade;
    }

    @Override

    public String getCourseGrade() {
        return courseGrade;
    }

}
