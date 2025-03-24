import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        try {
            QueueManager queueManager = new QueueManager();
            Course course = new Course("Computer Science");
            course.addStudent(new Student("Alice", 20));
            course.addStudent(new Student("Bob", 21));

            // Enqueue a value
            queueManager.enqueue(100);

            // Process some unrelated data
            for (Student student : course.getStudents()) {
                System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
            }

            // Dequeue the value
            /* read */ int value = queueManager.dequeue();
            System.out.println("Dequeued value: " + value);

            // More unrelated operations
            BlockingQueue<String> stringQueue = new LinkedBlockingQueue<>();
            stringQueue.put("Hello");
            stringQueue.put("World");
            System.out.println("First string: " + stringQueue.take());
            System.out.println("Second string: " + stringQueue.take());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}