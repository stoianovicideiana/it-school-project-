package session_9_arrays.practice;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] numbers = {14, 24, 12, -4, 13};
        printArraysAverage(numbers);

        String[][] names = { {"Ms. ", "Mr. "}, {"Alice", "John"} };

        printMultidimensionalArray(names);
        printSortedArray(numbers);
        printSearchIndexValue(numbers, 12);
    }

    public static void printSearchIndexValue(int[] array, int searchKey) {
        Arrays.sort(array);
        System.out.println("Search key index: " + Arrays.binarySearch(array, searchKey));
    }

    public static void printSortedArray(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void printMultidimensionalArray (String[][] inputArray){
        for (int index = 0; index < inputArray.length; index++) {
            for (int index2 = 0; index2 < inputArray[index].length; index2++) {
                System.out.print(inputArray[index2][index] + " ");
            }
            System.out.println();
        }

    }

    public static void printArraysAverage(int[] inputArray) {
        double sum = 0;

        for (int value : inputArray) {
            //compound operator
             sum += value;
        }
        System.out.println("Arrays average: " + (sum / inputArray.length));
    }
}
