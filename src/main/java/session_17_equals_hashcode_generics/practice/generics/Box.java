package session_17_equals_hashcode_generics.practice.generics;

public class Box<T> {

    private T obj;

    public Box(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setObj("Hello");

        System.out.println(stringBox.getObj());

        Integer[] intArray = {2, 6, 9};
        String[] stringArray = {"Alice", "Bob", "Joe"};

        printArray(intArray);
        printArray(stringArray);
    }

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element + " ");
        }
    }
}
