package modul_10;

public class mainMahasiswa {
    public static void main(String[] args) {
        underGraduateStudent ugs = new underGraduateStudent();
        graduateStudent gs = new graduateStudent();
        ugs.setNama("Emanuel");
        gs.setNama("Roganda");
       

        int[] testScoresUGS = { 85, 78, 90 };
        int[] testScoresGS = { 85, 78, 90 };

        ugs.setTest(testScoresUGS);
        gs.setTest(testScoresGS);
       

        System.out.println("Undergraduate Student:");
        System.out.println("Nama: " + ugs.getNama());
        System.out.println("Grade: " + ugs.getCourseGrade());

        System.out.println("\nGraduate Student:");
        System.out.println("Nama: " + gs.getNama());
        System.out.println("Grade: " + gs.getCourseGrade());
    }
}
