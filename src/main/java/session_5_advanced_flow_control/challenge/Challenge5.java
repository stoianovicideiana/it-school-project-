package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

//Write a program that generates and prints the first n numbers of the Fibonacci series, where n is provided by the user.
public class Challenge5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        int x = scanner.nextInt();

        System.out.println("Fibonacci series of " + x + " numbers:");
        for (int i = 0; i < x; i++) {
            System.out.print(printFinacci(i) + " ");
        }

        scanner.close();
    }
    public static int printFinacci(int n){
       if (n <= 1) {
           return n;
        } else {
           return printFinacci(n - 1) + printFinacci( n - 2);
       }
    }
}
