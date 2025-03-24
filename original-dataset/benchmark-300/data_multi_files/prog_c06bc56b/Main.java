import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        Course course = new Course("Mathematics");

        // Adding a score to the student
        student.addScore(95);

        // Adding the student to the course
        course.addStudent(student);

        // Retrieving the scores from the student
        CopyOnWriteArraySet<Integer> scores = student.getScores();

        // Reading the score
        /* read */ boolean containsScore = scores.contains(95);

        // Printing the results
        System.out.println("Student " + student.getName() + " has score 95: " + containsScore);
        System.out.println("Course " + course.getCourseName() + " has " + course.getStudents().size() + " students.");
    }
}