package session_9_arrays.challenge;

//Given an array of 10 integers, count how many of them are even numbers and how many are odd. Print out both counts.

public class Challenge4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Your even numbers are: " + evenCount);
        System.out.println("Your odd numbers are: " + oddCount);
    }
}
