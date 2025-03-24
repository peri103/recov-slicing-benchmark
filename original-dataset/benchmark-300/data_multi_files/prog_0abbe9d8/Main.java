import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create a task to write to the queue
        Runnable writerTask = () -> {
            try {
                queueManager.writeValue(42);
                System.out.println("Value 42 has been written to the queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // Create a task to read from the queue
        Runnable readerTask = () -> {
            try {
                int value = queueManager.readValue();
                System.out.println("Value " + value + " has been read from the queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // Submit the tasks to the executor
        executor.submit(writerTask);
        executor.submit(readerTask);

        // Shutdown the executor and wait for tasks to complete
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional complex code
        SynchronousQueue<String> stringQueue = new SynchronousQueue<>();
        executor = Executors.newFixedThreadPool(2);

        // Create a task to write a string to the queue
        Runnable stringWriterTask = () -> {
            try {
                stringQueue.put("Hello, World!");
                System.out.println("String 'Hello, World!' has been written to the queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // Create a task to read a string from the queue
        Runnable stringReaderTask = () -> {
            try {
                String value = stringQueue.take();
                System.out.println("String '" + value + "' has been read from the queue.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // Submit the tasks to the executor
        executor.submit(stringWriterTask);
        executor.submit(stringReaderTask);

        // Shutdown the executor and wait for tasks to complete
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}