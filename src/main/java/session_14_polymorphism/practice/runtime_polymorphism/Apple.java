package session_14_polymorphism.practice.runtime_polymorphism;

public class Apple extends Fruit {

    @Override
    public String taste() {
        return "Apple is sweet";
    }

    @Override
    public String colour() {
        return "Apple is red";
    }
}
