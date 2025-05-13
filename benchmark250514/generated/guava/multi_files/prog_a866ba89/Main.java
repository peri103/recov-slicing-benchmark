import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("John Doe", 20);

        // Create a course
        Course course = new Course("Computer Science");

        // Enroll student in the course
        student.enrollCourse(course);

        // Add material to the course
        course.addMaterial("Introduction to Programming");

        // Retrieve and display course material
        String material = course.getMaterial();
        System.out.println("Course Material: " + material);

        // Display student details
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Enrolled Course: " + student.getCourse().getCourseName());
    }
}