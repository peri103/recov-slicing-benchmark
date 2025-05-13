import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PaintManager paintManager = new PaintManager("Example Axis");
        
        // Set paint for subcategories
        paintManager.setPaintForSubCategory("SubCategory1", new Color(255, 0, 0)); // Red
        paintManager.setPaintForSubCategory("SubCategory2", new Color(0, 255, 0)); // Green
        paintManager.setPaintForSubCategory("SubCategory3", new Color(0, 0, 255)); // Blue
        
        // Create a course and students
        Course course = new Course("Math 101");
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Add scores to students
        alice.addScore(95);
        bob.addScore(88);

        // Add students to course
        course.addStudent(alice);
        course.addStudent(bob);

        // Retrieve and print paint for a specific subcategory
        /* read */ Paint retrievedPaint = paintManager.getPaintForSubCategory("SubCategory1");
        System.out.println("Retrieved Paint for SubCategory1: " + retrievedPaint);

        // Print course details
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Scores: " + student.getScores());
        }
    }
}