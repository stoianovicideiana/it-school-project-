package session_4_java_operators_and_loops.practice;

import java.util.Objects;

public class MemoryReference {

    public static void main(String[] args) {
        String greeting1 = "Hello";
        String greeting2 = "Hello";
        String greeting3 = new String("Hello");

        //ctrl + / sa comentezi mai multe linii
//        System.out.println(greeting1 == greeting2); //false - comparam referinta in memorie
//        System.out.println(greeting1.equals(greeting2)); //verificam continutul unui obiect
//        System.out.println(greeting2 == greeting3);

        User user1 = new User("John");
        User user2 = new User("John");

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2)); //false
    }
}

class User {

    String firstName;

    public User(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(firstName);
    }
}
