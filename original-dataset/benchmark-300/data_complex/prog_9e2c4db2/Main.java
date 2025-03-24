import java.util.concurrent.SynchronousQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        
        // Start a new thread to write to the queue
        Thread writerThread = new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        writerThread.start();
        
        // Simulate some unrelated operations
        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(100));
        }
        
        // Print the list
        System.out.println("List contents: " + list);
        
        // Wait for the writer thread to put the value
        Thread.sleep(100);
        
        // Read the value from the queue
        /* read */ int value = queue.take();
        
        System.out.println("Value read from queue: " + value);
        
        // Perform some more unrelated operations
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of list elements: " + sum);
        
        // Shuffle the list
        java.util.Collections.shuffle(list);
        System.out.println("Shuffled list: " + list);
    }
}