import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Start a new thread to perform the write operation
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        writerThread.start();

        // Add some unrelated operations
        list.add(10);
        list.add(20);
        linkedList.add(30);
        linkedList.add(40);

        // Perform the read operation in the main thread
        /* read */ int value = queue.take();
        System.out.println("Value from queue: " + value);

        // Ensure the writer thread completes
        writerThread.join();

        // Print elements from the ArrayList and LinkedList
        System.out.println("ArrayList elements:");
        for (Integer num : list) {
            System.out.println(num);
        }

        System.out.println("LinkedList elements:");
        for (Integer num : linkedList) {
            System.out.println(num);
        }
    }
}