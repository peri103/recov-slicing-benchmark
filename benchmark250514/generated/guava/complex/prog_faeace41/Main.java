import com.google.common.collect.HashMultimap;
import com.google.common.collect.ArrayListMultimap;

public class Main {
    public static void main(String[] args) {
        HashMultimap<String, Integer> multimap = HashMultimap.create();
        ArrayListMultimap<String, String> multimap2 = ArrayListMultimap.create();

        // Add some initial data to the secondary multimap
        multimap2.put("fruit", "apple");
        multimap2.put("fruit", "banana");
        multimap2.put("vegetable", "carrot");

        // Work with the secondary multimap
        for (String key : multimap2.keySet()) {
            System.out.println("Key: " + key + ", Values: " + multimap2.get(key));
        }

        // Perform operations on the primary multimap
        /* write */ multimap.put("key", 42);
        multimap.put("anotherKey", 100);
        multimap.put("key", 84);

        // Add more complex operations
        int sum = 0;
        for (Integer number : multimap.get("key")) {
            sum += number;
        }
        System.out.println("Sum of values for 'key': " + sum);

        // Perform some unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        // Continue working with the primary multimap
        if (multimap.containsKey("anotherKey")) {
            System.out.println("'anotherKey' is present in the multimap.");
        }

        // Final read operation
        /* read */ int value = multimap.get("key").iterator().next();
        System.out.println("First value for 'key': " + value);
    }
}