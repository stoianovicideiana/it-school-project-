package session_6_java_core_apis.challenge;

//Use the StringBuilder class to write a program that reverses an input string. For example, the input "hello" should return "olleh".
public class Challenge1 {

    public static void main(String[] args) {
        String message = "Hello";
        String reserved = reverse(message);

        System.out.println("Original message: " + message);
        System.out.println("Reversed message: " + reserved);
    }

    private static String reverse(String message) {
        StringBuilder sb = new StringBuilder(message);
        return sb.reverse().toString();
    }
}
