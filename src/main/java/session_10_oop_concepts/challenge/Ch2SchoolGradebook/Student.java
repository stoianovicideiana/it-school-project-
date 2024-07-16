package session_10_oop_concepts.challenge.Ch2SchoolGradebook;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String studentName;
    private String ID;
    private List<Integer> grades = new ArrayList<> ();

    public Student(String studentName, String ID, List grades) {
        this.studentName = studentName;
        this.ID = ID;
        this.grades = grades;
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Please enter a value between 0 and 100");
        }
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        double total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }
}
