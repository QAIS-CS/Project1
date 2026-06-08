
package University.System;

public class Student {

    private String studentID;
    private String studentName;
    private double average;

    public Student() {
    }

    public Student(String studentID, String studentName, double average) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.average = average;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        if(studentID.startsWith("S"))
            this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        if(average >= 0 && average <= 100)
            this.average = average;
    }

    public void showStudent() {
        System.out.println("Student Name: " + studentName);
    }

    public void checkAverage() {

        if(average >= 50)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", studentName=" + studentName + ", average=" + average + '}';
    }
}