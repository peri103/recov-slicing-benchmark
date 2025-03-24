import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Mathematics");
        Student student = new Student("Alice");
        course.addStudent(student);

        // Adding a score to the student
        student.addScore(95);

        // Retrieving the scores and checking if the score exists
        ConcurrentSkipListSet<Integer> scores = student.getScores();
        /* read */ boolean containsScore = scores.contains(95);
        System.out.println("Contains score 95: " + containsScore);

        // Adding more students and scores
        Student student2 = new Student("Bob");
        course.addStudent(student2);
        student2.addScore(85);

        // Printing all students and their scores
        for (Student s : course.getStudents()) {
            System.out.println("Student: " + s.getScores());
        }
    }
}