package session_18.practice;

public class GreetingServicePractice {

    public static void main(String[] args) {
        //using anonymous class
        GreetingService anonymousGreetingService = new GreetingService() {
            @Override
            public void greet(String message) {
                System.out.println("Hello world from anonymous class");
            }
        };

        anonymousGreetingService.greet("Hello world");

        //using lambda expression
        GreetingService lambdaGreetingService = inputs -> System.out.println(inputs + "lambda expression");
        lambdaGreetingService.greet("Hello world");
    }
}
