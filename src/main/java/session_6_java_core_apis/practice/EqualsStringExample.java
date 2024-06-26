package session_6_java_core_apis.practice;

public class EqualsStringExample {

    public static void main(String[] args) {
        String color1 = "Blue";
        String color2 = "BLuE";

        System.out.println(color1.equals(color2)); // false
        System.out.println(color1.equalsIgnoreCase(color2)); // true - cuz ignore case sensitive
        System.out.println(color1.toLowerCase().equals(color2.toLowerCase())); //true
    }
}
