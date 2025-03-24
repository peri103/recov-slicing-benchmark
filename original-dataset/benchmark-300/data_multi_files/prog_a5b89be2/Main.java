import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        DataProcessor dataProcessor = new DataProcessor();
        Student student = new Student("Alice");

        // Thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            dataProcessor.writeData(42);
        });

        // Adding some scores to the student
        student.addScore(90);
        student.addScore(85);
        student.addScore(95);

        // Thread to perform the read operation
        Thread readerThread = new Thread(() -> {
            int value = dataProcessor.readData();
            System.out.println("Read value from queue: " + value);
        });

        // Start the threads
        writerThread.start();
        readerThread.start();

        // Wait for both threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Printing student details
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Scores:");
        for (int score : student.getScores()) {
            System.out.println(score);
        }

        // Additional operations to make the program more complex
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < student.getScores().size(); i++) {
            linkedList.add(student.getScores().get(i) + 5);
        }

        System.out.println("Adjusted Scores in LinkedList:");
        for (int score : linkedList) {
            System.out.println(score);
        }
    }
}