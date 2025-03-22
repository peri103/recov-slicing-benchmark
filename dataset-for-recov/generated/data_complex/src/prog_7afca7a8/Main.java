import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        ArrayList<String> keysList = new ArrayList<>();
        
        // Insert some values into the queue
        for (int i = 0; i < 5; i++) {
            queue.add(i * 10);
        }
        
        // Insert keys into the keysList
        for (int i = 0; i < 5; i++) {
            keysList.add("key" + i);
        }
        
        // Write to the map
        /* write */ map.put("key", 42);

        // Add some values to the map using keys from keysList
        for (String key : keysList) {
            map.put(key, queue.poll());
        }
        
        // Perform some operations on the map
        for (String key : keysList) {
            if (map.containsKey(key)) {
                System.out.println("Value for " + key + ": " + map.get(key));
            }
        }
        
        // Read from the map
        /* read */ int value = map.get("key");
        System.out.println("The special value is: " + value);
        
        // Perform additional operations
        map.put("anotherKey", 100);
        System.out.println("Value for anotherKey: " + map.get("anotherKey"));
        
        // Iterate over the map's entries
        map.forEach((k, v) -> {
            System.out.println("Key: " + k + ", Value: " + v);
        });
    }
}