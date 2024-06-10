package session_3_java_operators;

public class LogicalComplementAndNegotiationOperators {
    public static void main(String[] args) {
        boolean isFirstTime = true;
        boolean isRegistreted = false;

        System.out.println("Default value : isFirstTime " + isFirstTime);
        System.out.println("Updated value : isFirstTime " + !isFirstTime);

        System.out.println("Default value : isRegistreted " + isRegistreted);
        System.out.println("Updated value : isRegistreted " + !isRegistreted);

    }
}
