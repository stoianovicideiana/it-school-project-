package session_8_recap.practice;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 46;

        // ctrl + P  - shows arguments
        System.out.println("Addition: " + sum(value1, value2));
        System.out.println("Substraction: " + sum(value1, value2));
    }

    public static int sum(int input1, int input2) {
        return input1 + input2;
    }

    public static int substract (int input1, int input2) {
        return input1 - input2;
    }
}
