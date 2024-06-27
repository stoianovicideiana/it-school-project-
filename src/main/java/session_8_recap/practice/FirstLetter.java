package session_8_recap.practice;

import java.util.Arrays;

public class FirstLetter {
    public static void main(String[] args) {
        String input = "apple,banana,orange,blueberry";
        //split after every ,
        String[] InputArray = input.split(",");

        StringBuilder sb = new StringBuilder();

        for (String value : InputArray) {
            sb.append(Character.toUpperCase(value.charAt(0)))
                    .append(value.substring(1))
                    .append(" ");
        }
        System.out.println(sb);
    }
}
