import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        QueueManager queueManager = new QueueManager();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create a student object
        Student student = new Student("Alice", 95);

        // Submit a task to write the student's score to the queue
        executor.submit(() -> {
            try {
                queueManager.writeValue(student.getScore());
                System.out.println("Student " + student.getName() + "'s score has been written to the queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Submit a task to read the value from the queue
        executor.submit(() -> {
            try {
                int score = queueManager.readValue();
                System.out.println("Score " + score + " has been read from the queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Additional unrelated tasks to make the program more complex
        executor.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Performing some unrelated task...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Performing another unrelated task...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);
    }
}