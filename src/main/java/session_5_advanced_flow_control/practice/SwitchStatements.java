package session_5_advanced_flow_control.practice;

import java.util.Scanner;

public class SwitchStatements {
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    public static void main(String[] args) {
        //printGrade();
        //printSeason();
        printDayOfWeek();
    }

    private static void printDayOfWeek () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number from 1 to 7 for day of the week: ");
        int day = sc.nextInt();
        sc.close();

        switch (day) {
            case MONDAY:
                System.out.println("It's Monday");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday");
                break;
            case WEDNESAY:
                System.out.println("It's Wednesay");
                break;
            case THURSDAY:
                System.out.println("It's Thursday");
                break;
            case FRIDAY:
                System.out.println("It's Friday");
                break;
            case SATURDAY:
                System.out.println("It's Saturday");
                break;
            case SUNDAY:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

    }
    private static void printSeason () {
        String season = "Winter";

        switch (season) {
            case "Winter":
                System.out.println("It's cold");
                break;
            case "Spring":
                System.out.println("Flowers bloom");
                break;
            case "Summer":
                System.out.println("It's hot");
                break;
            case "Autumn":
                System.out.println("Leaves fall");
                break;
            default:
                System.out.println("Unknown season");
        }
    }

    private static void printGrade() {
        // A B C
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Poor");
                break;
            default:
                System.out.println("Grade not recognized");
        }
    }
}
