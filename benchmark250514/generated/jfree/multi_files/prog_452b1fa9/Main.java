import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a PiePlot3DHandler object
        PiePlot3DHandler piePlotHandler = new PiePlot3DHandler();

        // Set depth factor using PiePlot3DHandler
        piePlotHandler.setDepth(0.5);

        // Create a course and students
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Enroll students in the course
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Add scores to students
        student1.addScore(85);
        student2.addScore(90);

        // Retrieve depth factor using PiePlot3DHandler
        /* read */ double depthFactor = piePlotHandler.getDepth();
        System.out.println("Depth Factor: " + depthFactor);

        // Output course and student information
        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Student: " + student.getName() + ", Scores: " + student.getScores());
        }
    }
}