import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();

        DataGenerator generator = new DataGenerator(queue);
        DataProcessor processor = new DataProcessor(queue);

        // Create a thread to generate data
        Thread generatorThread = new Thread(generator::generateData);
        generatorThread.start();

        // Process the data in the main thread
        processor.processData();
    }
}