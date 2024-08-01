package session_18.practice;

import java.util.Arrays;
import java.util.List;

public class DataProcessingPractice {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "John", "Bob");

        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);


        //using traditional method
        //for (String)

    }
}
