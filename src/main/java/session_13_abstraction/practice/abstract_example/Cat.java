package session_13_abstraction.practice.abstract_example;

import session_13_abstraction.practice.interface_example.Pet;

public class Cat extends Animal implements Pet {

    //ctrl + i
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void poop() {
        System.out.println("This cat is eating");
    }
}
