package session_4_java_operators_and_loops.challenge;

//Write a Java program where you declare two integer variables heightOne and heightTwo with any values. Use a ternary operator to determine the greater height and assign it to a variable maximumHeight. Print the result.
public class Challenge4 {

    public static void main(String[] args) {
        int heightOne = 150;
        int heightTwo = 160;

        int maximumHeight = (heightOne > heightTwo) ? heightOne : heightTwo;
        System.out.println("The maxium height is: " + maximumHeight);
    }
}
