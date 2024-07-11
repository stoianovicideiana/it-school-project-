package session_10_oop_concepts.practice.static_keyword;

import session_10_oop_concepts.session_10_oop_concepts.practice.static_keyword.User;

public class TestUser {

    public static void main(String[] args) {
        session_10_oop_concepts.session_10_oop_concepts.practice.static_keyword.User user1 = new User();
        user1.setFirstName("Deiana");
        user1.setSecondName("Nicolia");
        user1.setAge("26");

        System.out.println(user1.getFirstName());
        System.out.println(user1.getSecondName());
        System.out.println(user1.getAge());


    }
}
