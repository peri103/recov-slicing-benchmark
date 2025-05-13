import com.google.common.collect.ForwardingSortedMap;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a TreeMap which will be used by ForwardingSortedMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Extend ForwardingSortedMap to provide access to the TreeMap
        ForwardingSortedMap<String, Integer> forwardingSortedMap = new ForwardingSortedMap<String, Integer>() {
            @Override
            protected TreeMap<String, Integer> delegate() {
                return treeMap;
            }
        };

        /* write */ forwardingSortedMap.put("key", 100);

        // Initialize a HashMap for additional operations
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Alice");
        hashMap.put("city", "Wonderland");

        // Perform operations on the HashMap
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Additional computation
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // More operations using HashMap
        hashMap.put("country", "Fantasy");
        String city = hashMap.get("city");
        System.out.println("City: " + city);

        /* read */ int value = forwardingSortedMap.get("key");
        System.out.println("ForwardingSortedMap value: " + value);

        // Additional data manipulation
        HashMap<Integer, String> numberMap = new HashMap<>();
        for (int i = 1; i <= 5; i++) {
            numberMap.put(i, "Number " + i);
        }
        for (Integer num : numberMap.keySet()) {
            System.out.println(numberMap.get(num));
        }
    }
}