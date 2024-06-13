package session_3_java_operators.challenge;

import java.util.Scanner;

//3. Write a program to check if a number is positive or negative using logical complement operator.
public class Challenge3LogicalComplement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double number = sc.nextDouble();

        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0){
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is zero.");
        }

    }
}
