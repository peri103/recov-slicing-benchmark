import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        Course course = new Course("Computer Science");

        // Add students to the course
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 21));

        // Start a new thread to put a value into the queue
        new Thread(() -> {
            queueManager.putValue(42);
        }).start();

        // Perform some operations with the course
        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }

        // Take the value from the queue
        int value = queueManager.takeValue();
        System.out.println("Value taken from the queue: " + value);

        // Perform some more operations
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Print elements from the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element at index " + i + ": " + list.get(i));
        }
    }
}