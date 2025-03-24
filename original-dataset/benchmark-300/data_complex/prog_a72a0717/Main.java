import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        
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
        
        // Perform some unrelated operations
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
            linkedList.add(i * 2);
        }
        
        // Perform the read operation in the main thread
        /* read */ int value = queue.take();
        
        // Print the value
        System.out.println("Value from queue: " + value);
        
        // Print the contents of the ArrayList and LinkedList
        System.out.println("ArrayList: " + list);
        System.out.println("LinkedList: " + linkedList);
        
        // Wait for the writer thread to finish
        writerThread.join();
    }
}