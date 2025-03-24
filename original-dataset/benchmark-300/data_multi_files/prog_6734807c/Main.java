import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));

        // Create a thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            queueManager.putValue(42);
        });

        // Add some unrelated operations
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // Create a thread to perform the read operation
        Thread readerThread = new Thread(() -> {
            int value = queueManager.takeValue();
            System.out.println("Value from queue: " + value);
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
    }
}