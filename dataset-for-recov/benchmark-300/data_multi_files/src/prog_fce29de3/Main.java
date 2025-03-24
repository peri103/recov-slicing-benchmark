import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DataProcessor processor = new DataProcessor();
        DataConsumer consumer = new DataConsumer(processor.getDataQueue());

        // Adding some initial data
        for (int i = 0; i < 5; i++) {
            processor.processData(i * 10);
        }

        // Consuming some data
        for (int i = 0; i < 3; i++) {
            int data = consumer.consumeData();
            System.out.println("Consumed data: " + data);
        }

        // Writing the main data
        processor.processData(42);

        // Consuming the main data
        int mainData = consumer.consumeData();
        System.out.println("Main data consumed: " + mainData);

        // Consuming remaining data
        while (!processor.getDataQueue().isEmpty()) {
            int data = consumer.consumeData();
            System.out.println("Consumed remaining data: " + data);
        }
    }
}