package session_3_java_operators;

public class PreIncrementPreDecrementOperators {

    public static void main(String[] args) {
        //pre-increment operator
        int x = 5;
        //se modifica valoarea lui x pentru ca avem ++
        int y = ++x;

        System.out.println("x: " + x); //6
        System.out.println("y: " + y); //6

        //pre-decrement operator
        int z = 4;
        int w = --z;

        System.out.println("z: " + z); //5
        System.out.println("w: " + w); //5

    }
}
