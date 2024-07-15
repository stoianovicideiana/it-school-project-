package session_10_oop_concepts.challenge;

import java.time.LocalDate;

public class Professor {

    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate birthDate;
    private Address address;
    private int age;
    private String CNP;

    public Professor(String firstName, String lastName, String gender, LocalDate birthDate, Address address, int age, String CNP) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
        this.age = age;
        this.CNP = CNP;
    }


}
