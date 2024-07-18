package session_10_oop_concepts.challenge.Ch2SchoolGradebook;

import java.util.Scanner;

public class SchoolGradebook {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter teacher name: ");
        String teacherName = sc.nextLine();

        System.out.print("Enter class name: ");
        String className = sc.nextLine();

        Gradebook gradebook = new Gradebook(teacherName, className);

        //public void printSchoolGradebookReport() {
        //System.out.println("Class Report for: " + className + " by " + teacherName);
        //System.out.println("");
        }

    }
