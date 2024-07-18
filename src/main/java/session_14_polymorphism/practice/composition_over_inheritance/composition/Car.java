package session_14_polymorphism.practice.composition_over_inheritance.composition;

public class Car {

    //encapsulation - with set and get, always attributes are private
    //HAS-A - Car - Engine
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    //method start
    void start() {
        engine.start();
    }
}
