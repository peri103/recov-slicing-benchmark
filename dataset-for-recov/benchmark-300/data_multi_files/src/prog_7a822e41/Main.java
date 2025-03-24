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

        // Create and start threads for processing and consuming data
        Thread processorThread = new Thread(processor::processData);
        Thread consumerThread = new Thread(consumer::consumeData);

        processorThread.start();
        consumerThread.start();

        // Add some elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Add elements from ArrayList to LinkedList
        for (Integer num : list) {
            linkedList.add(num);
        }

        // Print elements from LinkedList
        System.out.println("Elements in LinkedList:");
        for (Integer num : linkedList) {
            System.out.println(num);
        }

        // Wait for the threads to complete
        try {
            processorThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}