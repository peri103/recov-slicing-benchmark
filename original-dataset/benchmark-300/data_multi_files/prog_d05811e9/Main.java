import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        Student student = new Student("Alice");

        // Thread to write data to the queue
        Thread writerThread = new Thread(() -> {
            queueManager.putValue(42);
        });

        // Thread to read data from the queue
        Thread readerThread = new Thread(() -> {
            int value = queueManager.takeValue();
            System.out.println("Value read from queue: " + value);
        });

        // Start both threads
        writerThread.start();
        readerThread.start();

        // Wait for both threads to complete
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Adding some scores to the student
        student.addScore(90);
        student.addScore(85);
        student.addScore(95);

        // Printing student details
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Scores:");
        for (int score : student.getScores()) {
            System.out.println(score);
        }

        // Additional unrelated operations
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        System.out.println("String list contents:");
        for (String str : stringList) {
            System.out.println(str);
        }

        String concatenatedString = String.join(" ", stringList);
        System.out.println("Concatenated string: " + concatenatedString);
    }
}