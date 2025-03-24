import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();
        
        DataGenerator generator = new DataGenerator(queue);
        DataProcessor processor = new DataProcessor(queue);

        // Simulate some unrelated operations
        System.out.println("Initializing system...");
        for (int i = 0; i < 3; i++) {
            System.out.println("Performing setup operation " + (i + 1));
        }

        generator.generateData();

        // More unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        processor.processData();

        // Final operations
        System.out.println("System shutdown complete");
    }
}