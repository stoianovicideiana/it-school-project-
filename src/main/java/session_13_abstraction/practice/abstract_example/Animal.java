package session_13_abstraction.practice.abstract_example;

public abstract class Animal {

    //method non-abstract
    public void eat() {
        System.out.println("This animal eats food");
    }

    //abstract method
    public abstract void makeSound();
}
