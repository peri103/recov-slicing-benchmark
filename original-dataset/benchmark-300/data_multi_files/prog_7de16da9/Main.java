import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        QueueManager queueManager = new QueueManager();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit a task to write to the queue
        Future<?> writeFuture = executor.submit(() -> {
            try {
                queueManager.writeToQueue(42);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Submit a task to read from the queue
        Future<Integer> readFuture = executor.submit(() -> {
            try {
                return queueManager.readFromQueue();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return -1;
            }
        });

        // Wait for the write to complete
        writeFuture.get();

        // Wait for the read to complete and print the value
        int value = readFuture.get();
        System.out.println("Read value: " + value);

        // Shutdown the executor
        executor.shutdown();

        // Additional unrelated code to make the program more complex
        Course course = new Course("Advanced Java Programming");
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        course.enrollStudent(student1);
        course.enrollStudent(student2);

        System.out.println("Course: " + course.getCourseName());
        for (Student student : course.getEnrolledStudents()) {
            System.out.println("Enrolled Student: " + student.getName() + " (ID: " + student.getStudentId() + ")");
        }
    }
}