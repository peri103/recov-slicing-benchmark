import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Create a thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the writer thread
        writerThread.start();

        // Add some unrelated operations
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        for (Integer num : list) {
            linkedList.add(num);
        }

        // Perform the read operation in the main thread
        try {
            /* read */ int value = queue.take();
            System.out.println("Value from queue: " + value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the contents of the linked list
        System.out.println("Contents of linked list:");
        for (Integer num : linkedList) {
            System.out.println(num);
        }
    }
}