package session_5_advanced_flow_control.challenge;

//Given an array of integers, write a program to count and print the number of negative integers in the array.

public class Challenge3 {

    public static void main(String[] args) {

        int [] arrayNumbers = {2, -4, -1, -10, 5, -20};
        int count = coutNegativeNumbers(arrayNumbers);
        System.out.println("Negative numbers are: " + count);

    }

    private static int coutNegativeNumbers(int[] arrayNumbers) {
        int count = 0;
        for (int index = 0; index < arrayNumbers.length; index++) {
           if (arrayNumbers[index] < 0) {
               count++;
            }
        }
        return count;
    }
}
