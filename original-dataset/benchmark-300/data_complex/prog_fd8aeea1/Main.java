import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        List<Integer> list = new ArrayList<>();
        
        // Adding some unrelated operations
        for (int i = 0; i < 10; i++) {
            list.add(i * 2);
        }
        
        // Performing the write operation
        /* write */ queue.offer(42);
        
        // More unrelated operations
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of list elements: " + sum);
        
        // Performing the read operation
        /* read */ int value = queue.poll();
        System.out.println("Value read from queue: " + value);
        
        // Additional unrelated code
        PriorityQueue<String> stringQueue = new PriorityQueue<>();
        stringQueue.offer("Hello");
        stringQueue.offer("World");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.poll());
        }
    }
}