import com.google.common.collect.ForwardingSortedMap;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a ForwardingSortedMap instance using a TreeMap
        ForwardingSortedMap<String, Integer> map = new ForwardingSortedMap<String, Integer>() {
            private final SortedMap<String, Integer> delegate = new TreeMap<>();

            @Override
            protected SortedMap<String, Integer> delegate() {
                return delegate;
            }
        };

        /* write */ map.put("key", 42);

        // Create a HashMap and perform some operations
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Alice");
        hashMap.put("city", "Wonderland");
        
        // Iterate over the HashMap
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Use the ForwardingSortedMap to retrieve the value
        /* read */ int value = map.get("key");
        System.out.println(value);

        // Perform additional operations on the HashMap
        hashMap.put("occupation", "Explorer");
        hashMap.remove("city");

        // Print the modified HashMap
        System.out.println("Modified HashMap:");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}