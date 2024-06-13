package session_3_java_operators.challenge;

import java.util.Scanner;

public class Challenge1 {

    //1. Write a Java program to take two numbers as input and display the result of addition, subtraction, multiplication, division, and modulus.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        int addition = num1 + num2;
        int substraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        int modulus = num1 % num2;

        System.out.println("Sum of numbers: " + addition);
        System.out.println("Addition of numbers: " + substraction);
        System.out.println("Multiplication of numbers: " + multiplication);
        System.out.println("Division of numbers: " + division);
        System.out.println("Modulus of numbers: " + modulus);

        sc.close();

    }
}
