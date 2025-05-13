import com.google.common.collect.MinMaxPriorityQueue;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MinMaxPriorityQueue<Integer> queue = MinMaxPriorityQueue.create();
        HashMap<String, Integer> map = new HashMap<>();
        
        // Insert some values into the map
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        
        // Perform some operations on the map
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in map: " + sum);
        
        /* write */ queue.offer(42);
        
        // Perform some calculations
        int calculationResult = sum * 2;
        System.out.println("Result of calculation: " + calculationResult);
        
        // Create another MinMaxPriorityQueue and perform operations
        MinMaxPriorityQueue<Integer> anotherQueue = MinMaxPriorityQueue.create();
        anotherQueue.offer(15);
        anotherQueue.offer(25);
        anotherQueue.offer(35);
        
        int anotherQueuePeek = anotherQueue.peek();
        System.out.println("Peek value from anotherQueue: " + anotherQueuePeek);
        
        // Perform more operations
        int maxValue = Math.max(anotherQueuePeek, calculationResult);
        System.out.println("Max value between anotherQueuePeek and calculationResult: " + maxValue);
        
        /* read */ Integer value = queue.peek();
        System.out.println("Peek value from original queue: " + value);
        
        // Further operations on the original queue
        queue.offer(55);
        queue.offer(65);
        
        while (!queue.isEmpty()) {
            System.out.println("Polling from queue: " + queue.poll());
        }
    }
}