package session_4_java_operators_and_loops.challenge;

//Write a Java program to print the numbers from 1 to 10 using a for loop. As a next step, modify your program to print only the even numbers from 1 to 10.
public class Challenge5 {

    public static void main(String[] args) {
        for(int x = 1; x<11; x++){
            System.out.println(x);
        }
        System.out.println("The even numbers are: ");
        for (int y = 1; y <=10; y++){
            if (y % 2 == 0){
                System.out.println(y);
            }
        }


    }
}
