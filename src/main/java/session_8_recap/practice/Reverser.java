package session_8_recap.practice;

//Write a program that reads a name from the user and prints it in reverse order using a loop.
// Make sure to handle both uppercase and lowercase characters correctly.

import java.util.Scanner;

public class Reverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        sc.close();

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
    }
}