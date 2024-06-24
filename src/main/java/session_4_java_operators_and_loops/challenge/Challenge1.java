package session_4_java_operators_and_loops.challenge;

//Write a Java program where you create two String objects named stringOne and stringTwo with the same value "OpenAI". Check and print whether they refer to the same object.
public class Challenge1 {

    public static void main(String[] args) {

        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";

        if (stringOne == stringTwo){
            System.out.println("stringOne and stringTwo refer to the same object");
        } else {
            System.out.println("stringOne and stringTwo do not refer to the same object");
        }
    }
}
