package session_15_oop_recap.practice.inheritance;

public class Dog extends Animal {

    String breed;
    Size size;

    public Dog(String name, int age, String species, String breed, Size size) {
        super(name, age, species);
        this.breed = breed;
        this.size = size;
    }

    void bark() {
        System.out.println(name + " says wof");
    }

    void fetch() {
        System.out.println(name + " brings me the ball");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
