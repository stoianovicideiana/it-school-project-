package session_3_java_operators.challenge;

//4. Write a Java program that uses both the increment (++) and decrement (--) operators in a loop to count up to 10 and then back down to 1.

public class Challenge4IncrDecrLoopCount {

    public static void main(String[] args) {
        int count = 1;

        while (count < 10) {
            System.out.println(count);
            count++;
        }

        while (count > 0) {
            System.out.println(count);
            --count;
        }
        }
    }



