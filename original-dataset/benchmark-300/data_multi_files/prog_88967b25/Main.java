import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        DataProcessor processor = new DataProcessor(queue);
        DataConsumer consumer = new DataConsumer(queue);

        // Create and start threads for processing and consuming data
        Thread processorThread = new Thread(processor::processData);
        Thread consumerThread = new Thread(consumer::consumeData);

        processorThread.start();
        consumerThread.start();

        // Additional code to make the program more complex
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
            linkedList.add(i * 2);
        }

        System.out.println("ArrayList contents:");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("LinkedList contents:");
        for (int num : linkedList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Wait for both threads to finish
        try {
            processorThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}