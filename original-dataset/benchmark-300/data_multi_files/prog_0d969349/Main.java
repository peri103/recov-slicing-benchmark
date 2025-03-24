import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        DataProcessor processor = new DataProcessor(queue);
        DataConsumer consumer = new DataConsumer(queue);

        // Thread to process data
        Thread processorThread = new Thread(processor::processData);

        // Thread to consume data
        Thread consumerThread = new Thread(consumer::consumeData);

        // Start both threads
        processorThread.start();
        consumerThread.start();

        // Wait for both threads to complete
        try {
            processorThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Additional complex code
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        System.out.println("List contents:");
        for (Integer num : list) {
            System.out.println(num);
        }

        // More complex code
        SynchronousQueue<String> stringQueue = new SynchronousQueue<>();
        Thread stringWriterThread = new Thread(() -> {
            try {
                stringQueue.put("Hello, World!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread stringReaderThread = new Thread(() -> {
            try {
                String message = stringQueue.take();
                System.out.println("Received message: " + message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        stringWriterThread.start();
        stringReaderThread.start();

        try {
            stringWriterThread.join();
            stringReaderThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}