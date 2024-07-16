package session_10_oop_concepts.challenge.Ch1CollegeManagementSystem;

public class Address {

    private String country;
    private String city;
    private String streetName;
    private int number;

    public Address(String country, String city, String streetName, int number) {
        this.country = country;
        this.city = city;
        this.streetName = streetName;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", streetName='" + streetName + '\'' +
                ", number=" + number +
                '}';
    }
}
