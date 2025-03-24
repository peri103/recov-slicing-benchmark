import java.util.SortedSet;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course course = new Course("Mathematics");

        // Enroll the student in the course
        course.enrollStudent(student);

        // Add a score to the student
        student.addScore(42);

        // Get the student's scores
        SortedSet<Integer> scores = student.getScores();

        // Check if the score exists
        /* read */ boolean containsValue = scores.contains(42);
        System.out.println("Contains 42: " + containsValue);

        // Print all scores
        System.out.println("Student's scores:");
        for (Integer score : scores) {
            System.out.println(score);
        }
    }
}