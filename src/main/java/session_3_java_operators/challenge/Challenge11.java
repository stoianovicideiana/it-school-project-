package session_3_java_operators.challenge;

import java.util.Scanner;

// 11. Write a Java program that takes two boolean inputs from a user. Apply the logical negation operator (!) to each and print the result.
public class Challenge11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first boolean value (true/false): ");
        boolean x = sc.nextBoolean();

        System.out.print("Enter the second boolean value (true/false): ");
        boolean y = sc.nextBoolean();

        System.out.println("Negation of " + x + " is: " + !x);
        System.out.println("Negation of " + y + " is: " + !y);

        sc.close();
    }
}
