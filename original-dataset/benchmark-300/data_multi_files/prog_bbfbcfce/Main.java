import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        Student student = new Student("Alice");

        // Create a thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            queueManager.writeValue(42);
        });

        // Start the writer thread
        writerThread.start();

        // Add some unrelated operations
        for (int i = 0; i < 5; i++) {
            student.addScore(i * 10);
        }

        // Perform the read operation in the main thread
        int value = queueManager.readValue();
        System.out.println("Value from queue: " + value);

        // Print the student's scores
        System.out.println("Student's scores:");
        for (Integer score : student.getScores()) {
            System.out.println(score);
        }
    }
}