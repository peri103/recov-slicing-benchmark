import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        // Generate and add random numbers to the list
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }

        DataProcessor processor = new DataProcessor(queue);
        DataConsumer consumer = new DataConsumer(queue);

        // Create a thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                processor.processData();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the writer thread
        writerThread.start();

        // Perform some unrelated operations
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of random numbers: " + sum);

        // Perform the read operation in the main thread
        consumer.consumeData();

        // Ensure the writer thread completes
        writerThread.join();

        // More unrelated operations
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}