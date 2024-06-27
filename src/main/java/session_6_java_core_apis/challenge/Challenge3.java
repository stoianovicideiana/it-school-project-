package session_6_java_core_apis.challenge;

//Concatenate Multiple Strings
//Description: Given a list of strings, use StringBuilder to concatenate them into a single string efficiently.

import java.util.Arrays;
import java.util.List;

public class Challenge3 {

    public static void main(String[] args) {
        String[] words = {"Hey, ", "my name is ", "Deiana", "!"};
        String sentence = concatenate(words);
        System.out.println(sentence); // Now prints the concatenated sentence
    }

    private static String concatenate(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {  // Iterate through words array
            sb.append(word);
        }
        return sb.toString();
    }
}
