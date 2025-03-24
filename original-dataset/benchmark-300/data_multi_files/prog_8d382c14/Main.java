import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        Student student = new Student("Alice");
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Start a new thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                queueManager.writeValue(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        writerThread.start();

        // Add some unrelated operations
        for (int i = 0; i < 5; i++) {
            student.addScore(i * 10);
        }

        for (Integer score : student.getScores()) {
            linkedList.add(score);
        }

        // Perform the read operation in the main thread
        int value = queueManager.readValue();
        System.out.println("Value from queue: " + value);

        // Print the linked list
        System.out.println("Linked List: " + linkedList);

        // Ensure the writer thread completes
        writerThread.join();
    }
}