import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        try {
            QueueManager queueManager = new QueueManager();
            ExecutorService executor = Executors.newFixedThreadPool(2);

            // Task to write to the queue
            executor.submit(() -> {
                try {
                    queueManager.writeValue(42);
                    System.out.println("Value 42 written to the queue.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            // Task to read from the queue
            executor.submit(() -> {
                try {
                    TimeUnit.SECONDS.sleep(1); // Simulate some delay
                    int value = queueManager.readValue();
                    System.out.println("Value " + value + " read from the queue.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            executor.shutdown();
            executor.awaitTermination(2, TimeUnit.SECONDS);

            // Additional unrelated code to make the program more complex
            Student student = new Student("Alice", 20);
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Age: " + student.getAge());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}