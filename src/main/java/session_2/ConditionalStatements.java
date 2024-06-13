package session_2;

public class ConditionalStatements {

    //ctrl + alt + L - code formatting
    public static void main(String[] args) {
//variabila creata int si i-am dat valoarea 0
        int number = 4;

//am declarat un if statement sa fie mai mare ca 0
// check if number is positive, negative or zero

        if (number > 0) {
            System.out.println("This number is positive.");

//daca if-ul nu este executat sa fie executate else if
        } else if (number < 0) {
            System.out.println("This number is negative");

        } else {
            System.out.println("This number is zero");
        }
    }
}

