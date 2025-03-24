import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        DataProcessor processor = new DataProcessor(queue);
        DataConsumer consumer = new DataConsumer(queue);

        // Thread to perform the write operation
        Thread writer = new Thread(() -> {
            processor.processData(42);
        });

        // Thread to perform the read operation
        Thread reader = new Thread(() -> {
            consumer.consumeData();
        });

        // Start the threads
        writer.start();
        reader.start();

        // Additional code to make the program more complex
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        // Print elements from the ArrayList
        for (Integer num : list) {
            System.out.println("ArrayList element: " + num);
        }

        // Print elements from the LinkedList
        for (Integer num : linkedList) {
            System.out.println("LinkedList element: " + num);
        }

        // Wait for both threads to complete
        try {
            writer.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}