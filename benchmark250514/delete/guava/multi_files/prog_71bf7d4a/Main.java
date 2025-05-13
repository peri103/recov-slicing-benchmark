import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Alice");

        // Add scores for different subjects
        student.addScore("Math", 85);
        student.addScore("Science", 90);

        // Create a course and enroll the student
        Course course = new Course("Biology");
        course.enrollStudent(student);

        // Fetch and print the student's score for a specific subject
        StudentScores scores = student.getScores();
        /* read */ Integer mathScore = scores.getScore("Math");
        System.out.println("Math score for " + student.getName() + ": " + mathScore);

        // List all students in the course
        List<Student> students = course.getEnrolledStudents();
        System.out.println("Students enrolled in " + course.getCourseName() + ":");
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}