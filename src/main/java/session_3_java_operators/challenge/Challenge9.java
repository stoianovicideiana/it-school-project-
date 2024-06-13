package session_3_java_operators.challenge;

//9. Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.

import java.util.Scanner;

public class Challenge9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Lenght: ");
        int lenght = sc.nextInt();
        System.out.println("Breadth: ");
        int breadth = sc.nextInt();

        int area = lenght * breadth;
        System.out.println("Rectangular area is: " + area);
    }
}
