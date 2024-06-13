package session_3_java_operators.challenge;

//10. Write a program that reverses the sign of an entered integer using unary minus operator.

import java.util.Scanner;

public class Challenge10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int number = sc.nextInt();

        int invers = -number;
        System.out.println("The reserved sign of " + number + " is " + invers);

    }
}
