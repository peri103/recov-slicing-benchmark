import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        Student student = new Student("Alice");

        // Thread to write the value
        Thread writerThread = new Thread(() -> {
            try {
                queueManager.putValue(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread to read the value
        Thread readerThread = new Thread(() -> {
            try {
                int value = queueManager.takeValue();
                System.out.println("Value read from queue: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the threads
        writerThread.start();
        readerThread.start();

        // Wait for the threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional operations to make the program more complex
        student.addScore(95);
        student.addScore(88);
        student.addScore(92);

        System.out.println("Student scores:");
        for (int score : student.getScores()) {
            System.out.println(score);
        }

        // Another unrelated operation
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.add(i * 10);
        }

        System.out.println("Linked List elements:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}