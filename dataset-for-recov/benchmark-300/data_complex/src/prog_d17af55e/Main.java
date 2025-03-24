import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> list = new ArrayList<>();
        
        // Thread to write the value
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Thread to read the value
        Thread readerThread = new Thread(() -> {
            try {
                /* read */ int value = queue.take();
                list.add(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Start the threads
        writerThread.start();
        readerThread.start();
        
        // Wait for threads to finish
        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Additional code to make the program more complex
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Value from queue: " + list.get(0));
    }
}