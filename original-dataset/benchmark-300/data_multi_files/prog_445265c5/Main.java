import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore(100);
        LinkedList<Integer> scores = student.getScores();
        /* read */ int score = scores.get(0);
        System.out.println("Student's score: " + score);
    }
}