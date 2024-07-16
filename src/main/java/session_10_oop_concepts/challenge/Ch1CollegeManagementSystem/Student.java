package session_10_oop_concepts.challenge.Ch1CollegeManagementSystem;

import java.time.LocalDate;

public class Student {

    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate birthDate;
    private Address address;
    private int age;
    private String CNP;

    public Student(String firstName, String lastName, String gender, LocalDate birthDate, Address address, int age, String CNP) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
        this.age = age;
        this.CNP = CNP;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", address=" + address +
                ", age=" + age +
                ", CNP='" + CNP + '\'' +
                '}';
    }
}
