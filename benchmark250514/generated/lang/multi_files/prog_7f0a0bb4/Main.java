import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a new student and course
        Student student = new Student("John Doe");
        Course course = new Course("Advanced Java");

        // Enroll the student in the course
        course.enrollStudent(student);

        // Clear the student's notes
        student.clearNotes();

        // Add new notes to the student
        student.addNotes("Lecture 1: Introduction to Java");

        // Retrieve and print the student's notes
        /* read */ String notes = student.getNotes();
        System.out.println("Student Notes: " + notes);

        // Display course information
        System.out.println("Course: " + course.getCourseName());
        List<Student> students = course.getEnrolledStudents();
        for (Student s : students) {
            System.out.println("Enrolled Student: " + s.getName());
        }
    }
}