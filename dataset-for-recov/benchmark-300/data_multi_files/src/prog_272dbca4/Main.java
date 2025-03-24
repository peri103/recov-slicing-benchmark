import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore(95);
        Vector<Integer> scores = student.getScores();
        /* read */ int score = scores.get(0);
        System.out.println(score);
    }
}