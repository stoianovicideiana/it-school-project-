package session_7_utility_classes.practice;

public class MainStudent {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Ana";
        student1.age = 26;
        //System.out.println(student1.age);
        //student1.displayDetails();
        //System.out.println(student1);

        Student student2 = new Student();
        student2.name = "Ana";
        student2.age = 26;

        System.out.println(student1.equals(student2));
    }
}
