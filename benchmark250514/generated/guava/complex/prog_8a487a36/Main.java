import com.google.common.collect.MinMaxPriorityQueue;
import java.util.PriorityQueue;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MinMaxPriorityQueue<Integer> queue = MinMaxPriorityQueue.create();
        PriorityQueue<String> stringQueue = new PriorityQueue<>();
        HashMap<Integer, String> map = new HashMap<>();

        stringQueue.add("Hello");
        stringQueue.add("World");
        map.put(1, "One");
        map.put(2, "Two");

        /* write */ queue.add(42);
        
        for (int i = 0; i < 10; i++) {
            map.put(i + 3, "Number: " + (i + 3));
        }

        System.out.println("String Queue Peek: " + stringQueue.peek());
        
        for (Integer key : map.keySet()) {
            System.out.println("Map Key: " + key + ", Value: " + map.get(key));
        }

        /* read */ Integer value = queue.peek();
        System.out.println("MinMaxPriorityQueue Peek: " + value);

        MinMaxPriorityQueue<Integer> anotherQueue = MinMaxPriorityQueue.create();
        anotherQueue.add(100);
        anotherQueue.add(200);
        anotherQueue.add(300);

        System.out.println("Another Queue Peek: " + anotherQueue.peek());

        for (int i = 0; i < 5; i++) {
            anotherQueue.add(i * 10);
        }

        while (!anotherQueue.isEmpty()) {
            System.out.println("Polling from Another Queue: " + anotherQueue.poll());
        }
    }
}