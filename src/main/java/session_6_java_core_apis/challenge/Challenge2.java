package session_6_java_core_apis.challenge;

//Write a program that checks whether a given string is a palindrome using the StringBuilder class.
//A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward.

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a world, number: ");
        String input = scanner.nextLine();
        boolean isPolidrome = isPolidrome(input);
        scanner.close();

        if (isPolidrome) {
            System.out.println("It is a palidrome");
        } else {
            System.out.println("Isn't a palidrome");
        }
    }

    private static boolean isPolidrome(String input) {
        StringBuilder sb = new StringBuilder(input);
        String reverse = sb.reverse().toString();
        return input.equals(reverse);

    }
}
