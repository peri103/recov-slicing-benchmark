import java.util.concurrent.PriorityBlockingQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Student student = new Student("Alice", course);
        Random random = new Random();

        // Adding some random scores
        for (int i = 0; i < 10; i++) {
            student.addScore(random.nextInt(100));
        }

        // Reading the first score
        PriorityBlockingQueue<Integer> scores = student.getScores();
        /* read */ Integer score = scores.poll();
        System.out.println("Read score: " + score);

        // Polling the rest of the scores
        while (!scores.isEmpty()) {
            Integer s = scores.poll();
            System.out.println("Polled score: " + s);
        }
    }
}