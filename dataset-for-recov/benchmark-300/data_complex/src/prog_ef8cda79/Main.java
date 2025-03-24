import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        // Start a new thread to write to the queue
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        writerThread.start();
        
        // Add some unrelated operations
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        
        for (Integer num : list) {
            linkedList.add(num);
        }
        
        // Main thread reads from the queue
        /* read */ int value = queue.take();
        System.out.println("Value from queue: " + value);
        
        // Print the linked list
        System.out.println("Linked List:");
        for (Integer num : linkedList) {
            System.out.println(num);
        }
        
        // Ensure the writer thread completes
        writerThread.join();
    }
}