import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        Course course = new Course("Mathematics");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        StudentScores scores = course.getStudentScores();
        scores.addScore(student1.getId(), 85);
        scores.addScore(student2.getId(), 90);

        List<Integer> aliceScores = scores.getScoresForStudent(student1.getId());
        /* read */ int aliceFirstScore = aliceScores.iterator().next();
        System.out.println("Alice's first score: " + aliceFirstScore);

        List<Integer> bobScores = scores.getScoresForStudent(student2.getId());
        System.out.println("Bob's scores: " + bobScores);
    }
}