import com.google.common.collect.TreeMultimap;
import com.google.common.collect.HashMultimap;

public class Main {
    public static void main(String[] args) {
        // Using TreeMultimap for the original write-read pair
        TreeMultimap<String, Integer> multimap = TreeMultimap.create();
        /* write */ multimap.put("key", 42);

        // Additional code to make the program more complex
        HashMultimap<String, String> hashMultimap = HashMultimap.create();
        hashMultimap.put("fruit", "apple");
        hashMultimap.put("fruit", "banana");
        hashMultimap.put("color", "red");
        hashMultimap.put("color", "blue");

        for (String key : hashMultimap.keySet()) {
            System.out.println("Key: " + key + ", Values: " + hashMultimap.get(key));
        }

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Performing operations on the TreeMultimap
        multimap.put("anotherKey", 100);
        multimap.put("anotherKey", 200);

        System.out.println("Values for 'anotherKey': " + multimap.get("anotherKey"));

        // Read operation for the original write-read pair
        /* read */ Integer value = multimap.get("key").first();
        System.out.println("Read value from TreeMultimap: " + value);

        // Further operations on HashMultimap
        hashMultimap.put("animal", "dog");
        hashMultimap.put("animal", "cat");

        for (String key : hashMultimap.keySet()) {
            System.out.println("Key: " + key + ", Values: " + hashMultimap.get(key));
        }
    }
}