package session_6_java_core_apis.practice;

//concatenarea unor String-uri
public class StringPractice {

    public static void main(String[] args) {
    //apelerea metodei din main
    stringConcat();

    System.out.println(getStringLenght("Alice"));

    //print caracter de la index-ul 1 al numelui Frank
    System.out.println(getStringChar("Frank", 1));

    System.out.println(isStringStartingWith("Hello", "He"));

    System.out.println(isStringEndingWith("Hello", "lo"));

    System.out.println("               Bogdan  ");
    getTrimmedString(getTrimmedString("                Bogdan      "));

    String sentence = "I like to cook";
    sentence = sentence
            .trim()
            .replace('o', 'a')
            .toUpperCase();
    System.out.println(sentence);

    }

    public  static String getTrimmedString (String input) {
        return input.trim();
    }

    public static boolean isStringEndingWith (String input, String endsWith) {
        return input.endsWith(endsWith);
    }

    public static boolean isStringStartingWith(String input, String startsWith) {
    return input.startsWith(startsWith);
    }

    public static char getStringChar(String input, int index) {
        return input.charAt(index);
    }

    public static int getStringLenght(String input) {
        return input.length();

    }

    public static void stringConcat() {
        String value1 = "Hello";
        String value2 = "World";

        System.out.println(value1 + value2);
        System.out.println(value1.concat(value2));


    }
}
