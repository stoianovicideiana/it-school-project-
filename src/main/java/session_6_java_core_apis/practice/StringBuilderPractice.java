package session_6_java_core_apis.practice;

public class StringBuilderPractice {

    public static void main(String[] args) {
        String result = "";

        for (int index = 0; index < 10; index++) {
            //aa
            //aaa
            //aaaa
            result += "a";
        }
        System.out.println("With String: " + result);
        System.out.println(result);

        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < 10; index++) {
            //aaaaa
            sb.append("a");
    }
        String results2 = sb.toString();
        System.out.println("With StringBuilder: " + results2);
}
}
