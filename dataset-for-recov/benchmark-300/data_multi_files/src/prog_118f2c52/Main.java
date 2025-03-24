import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore(42);
        Deque<Integer> scores = student.getScores();
        /* read */ int score = scores.getLast();
        System.out.println(score);
    }
}