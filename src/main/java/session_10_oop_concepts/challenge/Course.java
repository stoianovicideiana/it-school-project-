package session_10_oop_concepts.challenge;

public class Course {

    private String courseName;
    private String schedule;
    private String duration;
    private String description;
    private Professor professorAssigned;

    public Course(String courseName, String schedule, String duration, String description, Professor professorAssigned) {
        this.courseName = courseName;
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
        this.professorAssigned = professorAssigned;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", schedule='" + schedule + '\'' +
                ", duration='" + duration + '\'' +
                ", description='" + description + '\'' +
                ", professorAssigned=" + professorAssigned +
                '}';
    }
}
