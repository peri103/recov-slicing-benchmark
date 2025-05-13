import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addScore(85);
        student2.addScore(90);

        course.addStudent(student1);
        course.addStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            List<Integer> scores = student.getScores();
            for (int score : scores) {
                System.out.println("Score: " + score);
            }
        }

        // Ensure the read method is executed only once
        List<Integer> aliceScores = student1.getScores();
        /* read */ int aliceFirstScore = aliceScores.get(0);
        System.out.println("Alice's first score: " + aliceFirstScore);
    }
}