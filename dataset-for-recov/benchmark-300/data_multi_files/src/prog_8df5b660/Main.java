import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        Student student = new Student("Alice");

        // Thread to write the value
        Thread writer = new Thread(() -> {
            queueManager.writeValue(42);
        });

        // Adding some unrelated code to make the program more complex
        for (int i = 0; i < 5; i++) {
            student.addScore(i * 10);
        }

        // Thread to read the value
        Thread reader = new Thread(() -> {
            int value = queueManager.readValue();
            System.out.println("Value from queue: " + value);
        });

        // Start both threads
        writer.start();
        reader.start();

        // Wait for both threads to finish
        try {
            writer.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Printing the student's scores to make the program more complex
        System.out.println("Student " + student.getName() + " scores:");
        for (int score : student.getScores()) {
            System.out.println(score);
        }
    }
}