import java.util.concurrent.SynchronousQueue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        DataProcessor processor = new DataProcessor(queue);
        DataConsumer consumer = new DataConsumer(queue);
        Student student = new Student("Alice");
        Random random = new Random();

        // Add some scores to the student
        for (int i = 0; i < 5; i++) {
            student.addScore(random.nextInt(100));
        }

        // Process data
        processor.processData(42);

        // Print student scores
        System.out.println("Student scores:");
        for (int score : student.getScores()) {
            System.out.println(score);
        }

        // Consume data
        consumer.consumeData();

        // Additional unrelated code
        int sum = student.getScores().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of student scores: " + sum);
    }
}