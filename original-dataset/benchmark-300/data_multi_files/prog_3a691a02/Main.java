import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit a task to process data
        Future<?> processFuture = executor.submit(() -> processor.processData(100));

        // Submit a task to get processed data
        Future<Integer> getFuture = executor.submit(processor::getProcessedData);

        // Wait for both tasks to complete
        try {
            processFuture.get();
            int processedData = getFuture.get();
            System.out.println("Processed Data: " + processedData);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the executor
        executor.shutdown();

        // Additional complex code
        Course course = new Course("Computer Science");
        course.addStudent(new Student("Alice", 20));
        course.addStudent(new Student("Bob", 22));

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}