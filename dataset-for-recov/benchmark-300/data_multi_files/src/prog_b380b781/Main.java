import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        DataProcessor dataProcessor = new DataProcessor();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Task to write to the queue
        Runnable writerTask = () -> {
            try {
                int value = dataProcessor.generateRandomValue();
                System.out.println("Writing value: " + value);
                queueManager.writeValue(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // Task to read from the queue
        Runnable readerTask = () -> {
            try {
                int value = queueManager.readValue();
                dataProcessor.processValue(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // Execute the tasks
        executor.submit(writerTask);
        executor.submit(readerTask);

        // Shutdown the executor
        executor.shutdown();

        // Additional unrelated code to make the program more complex
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = dataProcessor.generateRandomValue();
        }

        System.out.println("Generated numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Calculate the sum of the numbers
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
    }
}