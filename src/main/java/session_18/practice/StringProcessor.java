package session_18.practice;

@FunctionalInterface

public interface StringProcessor {

    String processor(String input);

    default StringProcessor andThen(StringProcessor StringProcessor toUpperCase) {
        return input -> after.processor(this.processor(input));
    }
}
