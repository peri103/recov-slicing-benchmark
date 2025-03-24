import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        DataProcessor processor = new DataProcessor(queue);
        DataConsumer consumer = new DataConsumer(queue);

        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Thread to process data
        Thread processorThread = new Thread(() -> {
            processor.processData();
        });

        // Thread to consume data
        Thread consumerThread = new Thread(() -> {
            consumer.consumeData();
        });

        // Start the threads
        processorThread.start();
        consumerThread.start();

        // Add some unrelated operations
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        linkedList.addAll(list);

        // Print the linked list
        System.out.println("Linked List: " + linkedList);

        // Wait for threads to finish
        try {
            processorThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // More unrelated operations
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of list elements: " + sum);
    }
}