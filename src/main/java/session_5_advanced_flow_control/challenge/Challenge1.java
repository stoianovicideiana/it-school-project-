package session_5_advanced_flow_control.challenge;

//Write a Java program that takes an integer as input. If the number is even, print "Even". If it's odd, print "Odd".

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number here: ");
        int nextNumber = scanner.nextInt();
        scanner.close();

        if (nextNumber % 2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

    }
}
