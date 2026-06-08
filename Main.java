package University.System;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<GraduateStudent> students = new ArrayList<GraduateStudent>();

        System.out.println("Fill The Array");
        students = FillData(students);

        System.out.println("Students With Thesis Mark >= 70");
        students = PrintData(students);
    }

    public static ArrayList<GraduateStudent> FillData(ArrayList<GraduateStudent> students) {

        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {

            System.out.print("Student ID: ");
            String id = in.next();

            System.out.print("Student Name: ");
            String name = in.next();

            System.out.print("Average: ");
            double avg = in.nextDouble();
            in.nextLine();

            System.out.print("Major (CS/AI): ");
            String major = in.nextLine();

            System.out.print("University: ");
            String university = in.nextLine();

            System.out.print("Thesis Mark: ");
            double thesis = in.nextDouble();

            GraduateStudent g = new GraduateStudent(
                    major,
                    university,
                    thesis,
                    id,
                    name,
                    avg
            );

            students.add(g);
        }

        return students;
    }

    public static ArrayList<GraduateStudent> PrintData(ArrayList<GraduateStudent> students) {

        for(int i = 0; i < students.size(); i++) {

            if(students.get(i).getThesisMark() >= 70) {

                System.out.println(students.get(i).toString());
            }
        }

        return students;
    }
}