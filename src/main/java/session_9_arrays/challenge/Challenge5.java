package session_9_arrays.challenge;


// Create an ArrayList that stores city names. Add at least five city names initially.
// Then, prompt the user to add a city name. If the city name is already in the list, display a message saying it's a duplicate; otherwise, add it to the list.

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("Bucharest");
        cityList.add("London");
        cityList.add("Barcelona");
        cityList.add("Valencia");
        cityList.add("Rome");

        // Prompt user for input
        while (true) {
            System.out.println("My city list: ");
            for (String city : cityList) {
                System.out.println(city);
            }

            System.out.println("\nEnter a city name (or 'no' to exit): ");
            String userInput = scanner.nextLine().toLowerCase();  // Read input and convert to lowercase

            if (userInput.equals("no")) {
                break;  // Exit the loop if user enters "no"
            } else {
                // Check for duplicates (case-insensitive)
                if (cityList.contains(userInput)) {
                    System.out.println(userInput + " is already in the list.");
                } else {
                    cityList.add(userInput);
                    System.out.println(userInput + " added to the list.");
                }
            }
        }

        scanner.close();  // Close the scanner to avoid resource leaks
    }
}