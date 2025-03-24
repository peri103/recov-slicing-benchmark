import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 95));
        students.add(new Student("Bob", 85));
        students.add(new Student("Charlie", 75));

        // Write data in a separate thread
        Thread writerThread = new Thread(() -> {
            processor.writeData(students.get(0).getScore());
        });

        // Read data in a separate thread
        Thread readerThread = new Thread(() -> {
            int score = processor.readData();
            System.out.println("Read score: " + score);
        });

        // Start the threads
        writerThread.start();
        readerThread.start();

        // Wait for threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print all student details
        System.out.println("Student Details:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Score: " + student.getScore());
        }
    }
}