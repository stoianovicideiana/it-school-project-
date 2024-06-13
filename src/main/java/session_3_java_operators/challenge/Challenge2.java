package session_3_java_operators.challenge;

//2. Create a Java program where you increment and decrement the same variable. Display the value of the variable after each operation.

public class Challenge2 {

    public static void main(String[] args) {

        int x = 4;
        int y = ++x;
        int z = --x;

        System.out.println("The value of x is " + x + " and after increment x is " + y + ", after decrement value of x is " + z);

    }
}
