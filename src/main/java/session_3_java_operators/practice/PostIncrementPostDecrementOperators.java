package session_3_java_operators.practice;

public class PostIncrementPostDecrementOperators {

    public static void main(String[] args) {

        //post-increment
        int x = 5;
        int y = x++;

        System.out.println("x: " + x); //6
        System.out.println("y: " + y); //5

        //post-decrement
        int z = 4;
        int w = z--;

        System.out.println("z: " + z); //3
        System.out.println("w: " + w); //4

        int b = 3;
        int c = ++b * 5 / b-- + --b;

        System.out.println("b: " + b); //2
        System.out.println("c: " + c); //7

    }
}
