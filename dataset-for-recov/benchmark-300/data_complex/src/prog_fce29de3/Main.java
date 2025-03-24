import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue1 = new ArrayBlockingQueue<>(10);
        BlockingQueue<String> queue2 = new LinkedBlockingQueue<>(5);
        
        // Adding elements to queue2
        queue2.put("Hello");
        queue2.put("World");
        
        // Performing some operations
        for (int i = 0; i < 5; i++) {
            queue1.put(i * 10);
        }
        
        // Taking elements from queue2
        String str1 = queue2.take();
        String str2 = queue2.take();
        
        // Writing to the original queue
        /* write */ queue1.put(42);
        
        // Performing more operations
        for (int i = 0; i < 5; i++) {
            int val = queue1.take();
            System.out.println("Taken from queue1: " + val);
        }
        
        // Reading from the original queue
        /* read */ int value = queue1.take();
        System.out.println("Value from original queue: " + value);
        
        // Final operations
        queue2.put("Java");
        queue2.put("Programming");
        
        while (!queue2.isEmpty()) {
            System.out.println("Taken from queue2: " + queue2.take());
        }
    }
}