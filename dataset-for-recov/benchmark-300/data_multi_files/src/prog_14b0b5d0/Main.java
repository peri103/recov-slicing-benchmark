import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        Student student = new Student("Alice");

        // Create a thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                queueManager.putValue(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Create a thread to perform the read operation
        Thread readerThread = new Thread(() -> {
            try {
                int value = queueManager.takeValue();
                System.out.println("Value taken from queue: " + value);
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

        // Add some scores to the student
        student.addScore(90);
        student.addScore(85);
        student.addScore(95);

        // Print student's scores
        System.out.println(student.getName() + "'s scores:");
        for (int score : student.getScores()) {
            System.out.println(score);
        }

        // Perform some additional operations
        int sum = 0;
        for (int score : student.getScores()) {
            sum += score;
        }
        System.out.println("Total score: " + sum);

        // Create a LinkedList and add some elements
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // Print elements from LinkedList
        System.out.println("Elements in LinkedList:");
        for (Integer num : linkedList) {
            System.out.println(num);
        }
    }
}