import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.addScore(85);
        student.addScore(90);

        List<Integer> scores = student.getScores();
        for (Integer score : scores) {
            System.out.println("Score: " + score);
        }

        // Access the latest score using the read method
        Integer latestScore = student.getScores().get(0);
        System.out.println("Latest Score: " + latestScore);
    }
}