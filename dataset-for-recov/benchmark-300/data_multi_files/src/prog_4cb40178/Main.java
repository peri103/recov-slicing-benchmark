import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        Student student = new Student("Alice");

        // Thread to write data
        Thread writerThread = new Thread(() -> {
            queueManager.putValue(42);
        });

        // Thread to read data
        Thread readerThread = new Thread(() -> {
            int value = queueManager.takeValue();
            System.out.println("Value from queue: " + value);
        });

        // Start threads
        writerThread.start();
        readerThread.start();

        // Add some unrelated operations
        for (int i = 0; i < 5; i++) {
            student.addScore(i * 10);
        }

        // Print student scores
        System.out.println("Student " + student.getName() + " scores:");
        for (Integer score : student.getScores()) {
            System.out.println(score);
        }

        // Wait for threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}