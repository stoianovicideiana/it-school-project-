package kata.session_5_girls;

public class StringChecker {

    public static void main(String[] args) {
        String test = "aa";
        System.out.println(checkString(test));

    }

    public static boolean checkString(String input) {
        if (input.toLowerCase().indexOf("a") == -1) {
            return true;
        }
        if (input.toLowerCase().lastIndexOf("a") < input.toLowerCase().indexOf("b")) {
            return true;
        }
        return false;
    }
}
