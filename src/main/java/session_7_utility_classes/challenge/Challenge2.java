package session_7_utility_classes.challenge;

//2. Date Decomposition
//Description: Write a method named displayDateComponents that accepts a date as an argument and prints its year, month, and day components separately.
//Input: A date in the format YYYY-MM-DD.

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Challenge2 {
    public static void main(String[] args) {
        displayDateComponents("2024-06-27");
    }

    private static void displayDateComponents(String date) {
        LocalDate parsedDate = LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE);

        int year = parsedDate.getYear();
        int month = parsedDate.getMonthValue();
        int day = parsedDate.getDayOfMonth();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}
