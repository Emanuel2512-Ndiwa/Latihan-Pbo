package modul_10;

public class graduateStudent extends mahasiswaInterface {
    @Override
    public String getCourseGrade(){
        int total = 0;
        for (int i = 0; i < numOfTest; i++) {
            total += test[i];
        }
        int average = total / numOfTest;
        
        if (average >= 80) {
            courseGrade = "Pass";
        } else {
            courseGrade = "Fail";
        }
        
        return courseGrade;
    }

}
