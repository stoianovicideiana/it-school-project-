package session_2;

import java.util.Scanner;
//clasa
public class ScannerExample {
    public static void main(String[] args) {

        // create a scanner object to read input from the console - crearea obiectului Scanner prin Scanner
        Scanner scanner = new Scanner(System.in);

        // get user's information - metoda prin care printam in consola un mesaj
        System.out.println("Enter number 1: ");

        // am definit o variabila prin int
        int num1 = scanner.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = scanner.nextInt();

        // perform addition
        int addition = num1 + num2;

        // print the result
        System.out.println("The addition of " + num1 + " and " + num2 + " is " + addition);

        // close the scanner
        scanner.close();

    }
}
