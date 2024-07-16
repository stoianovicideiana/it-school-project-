package session_10_oop_concepts.challenge.Ch2SchoolGradebook;

public class Teacher {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherName='" + teacherName + '\'' +
                '}';
    }
}
