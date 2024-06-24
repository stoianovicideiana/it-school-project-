package session_4_java_operators_and_loops.challenge;

//Write a Java program to declare two integer variables firstNumber and secondNumber with any values. Use an equality operator to compare these two numbers and print the result. Do the same for two String objects firstString and secondString with the same value, but use the equals() method for comparison. Print the result.
public class Challenge2 {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 4;

        if (firstNumber == secondNumber){
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers aren't equal");
        }

        String firstString = "4";
        String secondString = "4";

        if (firstString.equals(secondString)){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings aren't equals");
        }
    }
}
