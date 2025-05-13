import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a course and add topics
        Course course = new Course();
        course.addTopic("Introduction to Java");
        course.addTopic("Object-Oriented Programming");
        course.addTopic("Data Structures");

        // Create a student and add grades
        Student student = new Student("John Doe");
        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(78);

        // Print student details
        System.out.println("Student: " + student.getName());
        System.out.println("Grades: " + student.getGrades());

        // Print course topics
        System.out.println("Course Topics: " + course.getAllTopics());

        // Read the first topic from the course
        /* read */ String firstTopic = course.getFirstTopic();
        System.out.println("First Topic: " + firstTopic);
    }
}