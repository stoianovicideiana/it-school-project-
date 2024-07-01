package session_9_arrays.practice;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] numbers = {14, 24, 12, -4, 13};
        int target = 12;

        System.out.println("Index value for search key: " + binarySearch(numbers, target));

    }

    public static int binarySearch(int[] array, int target){
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if(array[middle] == target) {
                return middle;
            } else if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }


        return 0;
    }
}
