package session_6_java_core_apis.challenge;

//Write a program that capitalizes the first letter of every word in a sentence using the StringBuilder class.
public class Challenge5 {

    public static void main(String[] args) {
    String input = " hello, guys! this is deiana learning java.";
    String capitalized = capitalize(input);
        System.out.println("Orginal sentence " + input);
        System.out.println("Sentece with Capitalized Words: " + capitalized);
    }

    private static String capitalize(String input) {
        StringBuilder sb = new StringBuilder();
        boolean firstWorld = true;

        for (char ch : input.toCharArray()) {
            if (Character.isSpaceChar(ch)) {
                firstWorld = true; // reset flag for next word
            } else if (firstWorld) {
                sb.append(Character.toUpperCase(ch));
                firstWorld = false;
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
