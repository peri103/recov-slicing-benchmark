import java.util.concurrent.LinkedTransferQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        // Adding elements to the list
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        
        // Adding key-value pairs to the map
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        // Offer a number to the queue
        /* write */ queue.offer(42);
        
        // Process elements in the list
        for (Integer num : list) {
            System.out.println("List item: " + num);
        }
        
        // Retrieve a value from the map
        Integer mapValue = map.get("two");
        System.out.println("Value from map: " + mapValue);
        
        // Perform some operations with the map and list
        map.put("four", list.get(2));
        
        // Poll a number from the queue
        /* read */ Integer value = queue.poll();
        System.out.println("Polled from queue: " + value);
        
        // Print updated map entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Map entry: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}