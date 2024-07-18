package session_14_polymorphism.practice.runtime_polymorphism;

public class Orange extends Fruit {

    @Override
    public String taste() {
        return "Orange is sour";
    }

    @Override
    public String colour() {
        return "Orange is orange";
    }
}
