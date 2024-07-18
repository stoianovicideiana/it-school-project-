package session_13_abstraction.challenge.Ch1;

public class Main {

    public static void main(String[] args) {
        Parent firstObject = new FirstSubclass();
        Parent secondObject = new SecondSubclass();

        //call message method through parent references
        firstObject.message();
        secondObject.message();
    }
}
