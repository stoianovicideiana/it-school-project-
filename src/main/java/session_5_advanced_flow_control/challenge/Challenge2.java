package session_5_advanced_flow_control.challenge;

//Write a program that asks the user to enter a number between 1 and 12. Print the name of the corresponding month or "Invalid Month" if out of range.

import java.util.Scanner;

public class Challenge2 {
    public static final int JANUARY = 1;
    public static final int FEBRUARY =2;
    public static final int MARCH = 3;
    public static final int APRIL = 4;
    public static final int MAY = 5;
    public static final int JUNE = 6;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int SEPTEMBER = 9;
    public static final int OCTOBER = 10;
    public static final int NOVEMBER = 11;
    public static final int DECEMBER = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 12");
        int month = scanner.nextInt();
        scanner.close();

        switch (month){
            case JANUARY:
            System.out.println("It's January");
            break;
            case FEBRUARY:
            System.out.println("It's January");
            break;
            case MARCH:
                System.out.println("It's January");
                break;
            case APRIL:
                System.out.println("It's January");
                break;
            case MAY:
                System.out.println("It's January");
                break;
            case JUNE:
                System.out.println("It's January");
                break;
            case JULY:
                System.out.println("It's January");
                break;
            case AUGUST:
                System.out.println("It's January");
                break;
            case SEPTEMBER:
                System.out.println("It's January");
                break;
            case OCTOBER:
                System.out.println("It's January");
                break;
            case NOVEMBER:
                System.out.println("It's January");
                break;
            case DECEMBER:
                System.out.println("It's January");
                break;
            default:
                System.out.println("Invalid Month");
        }
    }
}
