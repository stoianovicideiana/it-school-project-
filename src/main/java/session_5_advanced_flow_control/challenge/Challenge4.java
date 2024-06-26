package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

//Ask the user to enter a string. Print the reversed version of this string.
public class Challenge4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        String reservedString = reserve(inputString);

        System.out.println("The reserved String is: " + reservedString);

        scanner.close();
    }

    private static String reserve(String inputString) {
        StringBuilder reserved = new StringBuilder();
        for (int x = inputString.length() -1; x >=0; x--){
            reserved.append(inputString.charAt(x));
        }
        return reserved.toString();

    }
}
