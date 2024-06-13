package session_3_java_operators.challenge;

//5. Create a Java program that demonstrates the use of each compound assignment operator with integers.

public class Challenge5 {

    public static void main(String[] args) {
    // +=,-=,*=,/=,%=,<<=, >>=, &=, ^=,|=

        int x = 2;
        int y = 4;

        x +=y;
        System.out.println("After x +=y, x = " + x);
        x -=y;
        System.out.println("After x -=y, x = " + x);
        x *=y;
        System.out.println("After x *=y, x = " + x);
        x /=y;
        System.out.println("After x /=y, x = " + x);
        x %=y;
        System.out.println("After x %=y, x = " + x);
        x <<=y;
        System.out.println("After x <<=y, x = " + x);
        x >>=y;
        System.out.println("After x >>=y, x = " + x);
        x  &=y;
        System.out.println("After x &=y, x = " + x);
        x ^=y;
        System.out.println("After x ^=y, x = " + x);
        x |=y;
        System.out.println("After x |=y, x = " + x);

    }
}
