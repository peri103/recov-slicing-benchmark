import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Initialize the BlockingQueue
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        
        // Initialize another BlockingQueue for demonstration
        BlockingQueue<String> stringQueue = new ArrayBlockingQueue<>(10);
        
        // Initialize a list to store processed elements
        List<Integer> processedList = new ArrayList<>();
        
        try {
            // Write value to the queue
            /* write */ queue.put(42);

            // Add some strings to the stringQueue
            stringQueue.put("Hello");
            stringQueue.put("World");

            // Use an executor service to demonstrate concurrent processing
            ExecutorService executor = Executors.newFixedThreadPool(2);

            executor.submit(() -> {
                try {
                    // Process the stringQueue
                    while (!stringQueue.isEmpty()) {
                        String str = stringQueue.take();
                        System.out.println("Processed: " + str);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            executor.submit(() -> {
                try {
                    // Process the integer queue
                    while (!queue.isEmpty()) {
                        int number = queue.take();
                        processedList.add(number * 2); // Multiply by 2 for demonstration
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            // Shutdown the executor and wait for tasks to finish
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.MINUTES);

            // Read value from the queue
            /* read */ int value = processedList.get(0);

            // Print the value
            System.out.println("Processed value: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}