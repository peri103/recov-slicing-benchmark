import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Create a new student and add scores
        Student student = new Student("Alice");
        student.addScore("Math", "95");
        student.addScore("Science", "88");

        // Create a new course and enroll students
        Course course = new Course("Computer Science");
        course.enrollStudent(student.getName());
        course.enrollStudent("Bob");

        // Print enrollment information
        course.printEnrollment();

        // Read scores of the student
        /* read */ Collection<String> mathScores = student.getScores("Math");

        // Print the read scores
        for (String score : mathScores) {
            System.out.println("Math score for " + student.getName() + ": " + score);
        }
    }
}