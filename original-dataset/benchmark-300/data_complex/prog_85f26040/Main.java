import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        
        // Create a thread to write the value
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Start the writer thread
        writerThread.start();
        
        // Create a list and add some elements
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        
        // Print the list elements
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List element: " + list.get(i));
        }
        
        // Read the value from the queue
        /* read */ int value = queue.take();
        
        // Print the value
        System.out.println("Value from queue: " + value);
        
        // Wait for the writer thread to finish
        writerThread.join();
    }
}