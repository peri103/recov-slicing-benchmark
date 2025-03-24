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

        // Adding some initial data to the list and linkedList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
            linkedList.add(i * 20);
        }

        // Writing to the queue in a separate thread
        Thread writerThread = new Thread(() -> processor.processData(42));

        // Reading from the queue in a separate thread
        Thread readerThread = new Thread(consumer::consumeData);

        writerThread.start();
        readerThread.start();

        // Performing some operations on the list and linkedList
        for (int i = 0; i < list.size(); i++) {
            linkedList.add(list.get(i));
        }

        // Printing the contents of the linkedList
        System.out.println("Contents of linkedList:");
        for (Integer num : linkedList) {
            System.out.println(num);
        }

        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}