
package University.System;

public class GraduateStudent extends Student {

    private String major;
    private String university;
    private double thesisMark;

    public GraduateStudent() {
        super();
    }

    public GraduateStudent(String major, String university, double thesisMark,
            String studentID, String studentName, double average) {

        super(studentID, studentName, average);

        this.major = major;
        this.university = university;
        this.thesisMark = thesisMark;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        if(major.equals("CS") || major.equals("AI"))
            this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public double getThesisMark() {
        return thesisMark;
    }

    public void setThesisMark(double thesisMark) {
        this.thesisMark = thesisMark;
    }

    public void thesisResult() {

        if(thesisMark >= 70)
            System.out.println("Excellent Thesis");
        else
            System.out.println("Normal Thesis");
    }

    @Override
    public String toString() {
        return "GraduateStudent{" + "major=" + major + ", university=" + university + ", thesisMark=" + thesisMark + '}';
    }
}