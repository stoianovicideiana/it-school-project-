package session_3_java_operators.challenge;

// 6. Write a Java program that takes two numbers from the user and uses relational operators to display whether the first number is greater than, less than, or equal to the second number.

import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x: ");
        double x = sc.nextDouble();
        System.out.println("y: ");
        double y = sc.nextDouble();

        if (x > y){
            System.out.println("x is greater than b");
        } else if (x < y){
            System.out.println("x is less than y");
        } else {
            System.out.println("x is equal to y");
        }
    }
}
