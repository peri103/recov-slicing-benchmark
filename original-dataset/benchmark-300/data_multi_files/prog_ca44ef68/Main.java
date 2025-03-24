import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        
        // Create a separate thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            queueManager.writeValue(42);
        });
        
        writerThread.start();
        
        // Perform some unrelated operations
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));
        
        // Perform the read operation in the main thread
        int value = queueManager.readValue();
        System.out.println("Value from queue: " + value);
        
        // More unrelated operations
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}