package session_7_utility_classes.challenge;

//1. Displaying Today's Date
//Description: Write a method named displayTodaysDate that, when called, prints the current date to the console.
//Expected Output: Today's date in the format YYYY-MM-DD.

import java.time.LocalDate;

public class Challenge1 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Today's date: " + localDate);
    }
}
