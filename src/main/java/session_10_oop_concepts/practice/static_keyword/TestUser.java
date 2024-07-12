package session_10_oop_concepts.practice.static_keyword;

import static session_10_oop_concepts.practice.static_keyword.Validator.isValidUser;

public class TestUser {

    public static void main(String[] args) {
        User user1 = new User();
        user1.setFirstName("Deiana");
        user1.setSecondName("Nicolia");
        user1.setAge(26);

        User user2 = new User("John", "Williams", 29);

        System.out.println(user1.getFirstName());
        System.out.println(user1.getSecondName());
        System.out.println(user1.getAge());

        //Validator validator = new Validator();
        //validator.isValidUser(user1);
        boolean isValidUser = isValidUser(user1);
        System.out.println(isValidUser);

        System.out.println(user2);


    }
}
