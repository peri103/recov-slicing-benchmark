import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        List<Integer> list = new ArrayList<>();
        
        // Adding elements to the list
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        
        // Writing to the queue
        /* write */ queue.put(1);
        
        // Processing the list
        for (Integer num : list) {
            System.out.println("Processing number: " + num);
        }
        
        // Reading from the queue
        /* read */ int value = queue.take();
        System.out.println("Value read from queue: " + value);
        
        // Additional unrelated operations
        BlockingQueue<String> stringQueue = new LinkedBlockingQueue<>();
        stringQueue.put("Hello");
        stringQueue.put("World");
        
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.take());
        }
    }
}