package session_9_arrays.challenge;

//Create
//2 empty ArrayLists: studentList and graduateStudentList
//populate studentList with 10 students
//copy values from studentList to graduateStudentList
//iterate through graduateStudentList and print each graduated student

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Challenge3 {
    public static void main(String[] args) {
        List<String> studentList = new ArrayList<>();
        studentList.add("Ana");
        studentList.add("Alin");
        studentList.add("Ion");
        studentList.add("Deiana");
        studentList.add("Nicolia");
        studentList.add("Alex");
        studentList.add("Maria");
        studentList.add("Gordana");
        studentList.add("Petronela");
        studentList.add("Oana");

        List<String> graduateStudentList = new ArrayList<>(studentList);

        //add grades to each student
        //graduateStudentList.addAll(studentList);

        //print student and grades
        System.out.println("Student name and grade: ");
        for (int index = 0; index < graduateStudentList.size(); index++) {
            System.out.println(graduateStudentList.get(index));
        }
    }
}
