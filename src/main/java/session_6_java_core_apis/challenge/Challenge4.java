package session_6_java_core_apis.challenge;

//Removing Vowels
//Description: Create a Java program that uses the StringBuilder class to remove all the vowels from an input string.

import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some words: ");
        String input = sc.nextLine();
        String result = vowelRemover(input);
        System.out.println("Result after removing vowels: " + result);
        sc.close();
    }

    private static String vowelRemover(String input) {
        StringBuilder sb = new StringBuilder();
        String lowerCase = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = lowerCase.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                sb.append(input.charAt(i));
            }
        }
        return sb.toString();
    }
}
