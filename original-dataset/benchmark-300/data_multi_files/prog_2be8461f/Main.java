import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Course mathCourse = new Course("Mathematics");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        mathCourse.addStudent(student1);
        mathCourse.addStudent(student2);

        student1.addScore(95);
        student2.addScore(85);

        // Add some complexity
        for (int i = 0; i < 3; i++) {
            student1.addScore(90 + i);
            student2.addScore(80 + i);
        }

        // Read the first score of student1
        Deque<Integer> scores = student1.getScores();
        /* read */ int firstScore = scores.getFirst();

        System.out.println("First score of Alice: " + firstScore);

        // Print all scores of student1
        System.out.println("All scores of Alice:");
        for (Integer score : scores) {
            System.out.println(score);
        }
    }
}