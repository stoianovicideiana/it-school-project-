package session_4_java_operators_and_loops;

public class MemoryReference {

    public static void main(String[] args) {
        String greeting1 = "Hello";
        String greeting2 = "Hello";

        System.out.println(greeting1 == greeting2); //false - comparam referinta in memorie
        System.out.println(greeting1.equals(greeting2)); //verificam continutul unui obiect
    }
}
