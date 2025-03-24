import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> list = new ArrayList<>();
        
        // Create a thread to write to the queue
        Thread writer = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Start the writer thread
        writer.start();
        
        // Perform some unrelated operations
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        
        // Create a thread to read from the queue
        Thread reader = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Start the reader thread
        reader.start();
        
        // Wait for the threads to finish
        try {
            writer.join();
            reader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Print the list
        System.out.println("List contents:");
        for (int num : list) {
            System.out.println(num);
        }
    }
}