package session_10_oop_concepts.challenge;

import java.time.LocalDate;

public class Ch1CollegeManagementSystem {

    public static void main(String[] args) {
        Student student1 = new Student("Deiana", "Stoianovici", "Female", LocalDate.of(1997,24, 07), new Address("Romania", "T'imisoara", "Arhitect Ion Mincu", 16), 26, "321232343243");

        Professor professor1 = new Professor("Dan", "Popescu", "Male", LocalDate.of(1985, 03, 02), new Address("Italy", "Rome", "Pistachio", 1), 39, "3213214324");
        Professor professor2 = new Professor("Ion", "Dan", "Male",LocalDate.of(1984, 06, 02), new Address("Romania", "Timisoara", "Beans", 14), 40, "3543650913");
        Professor professor3 = new Professor("Maria", "Stanciu", "Female",LocalDate.of(1990, 12, 06), new Address("Romania", "Bucharest", "Flowers", 12), 34, "3552115878924");
        Professor professor4 = new Professor("Ioana", "Dragos", "Female", LocalDate.of(1982,03,02), new Address("Bulgaria", "Budapest", "Broccoli", 24), 42, "8970435325579");
        Professor professor5 = new Professor("Daniel", "Teu", "Male", LocalDate.of(1974,02,02), new Address("Romania", "Timisoara", "Pomilor", 10), 50, "326657653654");
        Professor professor6 = new Professor("Alina", "Niculae", "Female", LocalDate.of(1973,03 , 03), new Address("Romania", "Cluj-Napoca", "Brazilor", 15), 51, "3245467789");
        Professor professor7 = new Professor("Alin", "Mutascu", "Male", LocalDate.of(1992, 03, 02), new Address("Romania", "Bucharest", "Oglinzilor", 13), 32, "5454657687004");

//Math, Computer Science, Physics, Chemistry, Biology, Geography, English, and History
        Course math = new Course("Math", "Monday 08am", "60 minutes", "Learning about Math", professor2);
        Course computerScience = new Course("Computer Science", "Monday 10am", "60 minutes", "Learning about programming", professor1);
        Course physics = new Course("Physics", "Tuesday 09am", "60 minutes", "Learning about Physics", professor4);
        Course chemistry = new Course("Chemistry", "Wednesday 09am", "60 minutes", "Learning about Chemistry", professor3);
        Course biology = new Course("Biology", "Wednesday 11am", "60 minutes", "Learning about Biology", professor5);
        Course geography = new Course("Geography", "Thursday 09am", "60 minutes", "Learning about Geography", professor6);
        Course english = new Course("English", "Thursday 12pm", "60 minutes", "Learning about English", professor2);
        Course history = new Course("History", "Friday 10am", "60 minutes", "Learning about History", professor7);


        System.out.println("Biology course information: " + biology);

    }


}
