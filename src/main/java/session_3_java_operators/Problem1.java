package session_3_java_operators;

import java.util.Scanner;

public class Problem1 {

    //write a program to find rest for two integer x and y using modulus operators. Also, compute the result of x raised to the power of y by using Math.pow function

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int x = sc.nextInt();

        System.out.println("Please enter second number: ");
        int y = sc.nextInt();

        //int x = 20;
        //int y = 6;
        int remainder = x % y;
        double power = Math.pow(x, y);

        System.out.println("Remainder: " + remainder);
        System.out.println("Power: " + power);

    }
}
