package session_3_java_operators.challenge;

//8. Create a program that takes two byte values, adds them together, and stores the result in a byte variable.

import java.util.Scanner;

public class Challenge8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first byte value: ");
        byte byte1 = sc.nextByte();

        System.out.println("Enter the second byte value: ");
        byte byte2 = sc.nextByte();

        byte bytesum = (byte) (byte1 + byte2);
        System.out.println("The result of adding " + byte1 + " and " + byte2 + " is: " + bytesum);
    }
}
