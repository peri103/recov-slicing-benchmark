import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> list = new ArrayList<>();
        
        // Create a thread to write to the queue
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Create a thread to read from the queue
        Thread readerThread = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                System.out.println("Read value: " + value);
                list.add(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Start the threads
        writerThread.start();
        readerThread.start();
        
        // Wait for both threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Add more complexity: Process the list
        if (!list.isEmpty()) {
            int sum = 0;
            for (int num : list) {
                sum += num;
            }
            System.out.println("Sum of list elements: " + sum);
        }
        
        // Add more complexity: Create a new thread to perform additional operations
        Thread additionalThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Additional thread iteration: " + i);
            }
        });
        
        additionalThread.start();
        
        try {
            additionalThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Main thread finished.");
    }
}