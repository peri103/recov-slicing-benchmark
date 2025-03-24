import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        
        // Thread to write to the queue
        Thread writer = new Thread(() -> {
            queueManager.writeToQueue(42);
        });
        
        // Start the writer thread
        writer.start();
        
        // Additional complex code
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 21));
        
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }
        
        // Thread to read from the queue
        Thread reader = new Thread(() -> {
            int value = queueManager.readFromQueue();
            System.out.println("Value from queue: " + value);
        });
        
        // Start the reader thread
        reader.start();
        
        // Wait for the threads to finish
        try {
            writer.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}