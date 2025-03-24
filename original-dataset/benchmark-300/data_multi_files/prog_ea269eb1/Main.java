import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

        DataProducer producer = new DataProducer(queue);
        DataProcessor processor = new DataProcessor(queue);

        // Produce data
        producer.produceData();

        // Process data
        processor.processData();
    }
}