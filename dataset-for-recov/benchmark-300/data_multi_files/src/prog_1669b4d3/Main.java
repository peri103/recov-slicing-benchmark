import java.util.SortedSet;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Mathematics");
        Student student = new Student("Alice");
        course.addStudent(student);

        student.addScore(85);
        student.addScore(90);

        SortedSet<Integer> scores = student.getScores();
        /* read */ boolean containsScore = scores.contains(85);
        System.out.println("Student Alice has score 85: " + containsScore);

        for (Integer score : scores) {
            System.out.println("Score: " + score);
        }
    }
}