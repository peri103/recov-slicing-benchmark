import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.addScore(95);
        student2.addScore(85);

        Course course = new Course("Mathematics");
        course.addStudent(student1);
        course.addStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName());
            List<Integer> scores = student.getScores();
            for (int score : scores) {
                System.out.println("Score: " + score);
            }
        }

        // Demonstrating the read operation
        List<Integer> aliceScores = student1.getScores();
        /* read */ int firstScore = aliceScores.get(0);
        System.out.println("Alice's first score: " + firstScore);
    }
}