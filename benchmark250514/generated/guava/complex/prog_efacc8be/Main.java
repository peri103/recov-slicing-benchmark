import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableMultimap
        ImmutableMultimap.Builder<String, Integer> builder = ImmutableMultimap.builder();

        // Create a HashMap to perform some unrelated operations
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");

        // Perform some operations on the HashMap
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Use ImmutableSet for some other operations
        ImmutableSet<String> immutableSet = ImmutableSet.of("One", "Two", "Three");
        for (String s : immutableSet) {
            System.out.println("Set contains: " + s);
        }

        // Add a value to the ImmutableMultimap
        /* write */ builder.put("key", 42);
        
        // Create another builder for a different ImmutableMultimap
        ImmutableMultimap.Builder<String, String> anotherBuilder = ImmutableMultimap.builder();
        anotherBuilder.put("fruit", "Apple");
        anotherBuilder.put("fruit", "Banana");

        // Build the original ImmutableMultimap
        ImmutableMultimap<String, Integer> multimap = builder.build();
        
        // Build the second ImmutableMultimap
        ImmutableMultimap<String, String> anotherMultimap = anotherBuilder.build();

        // Perform some operations on the second multimap
        for (String fruit : anotherMultimap.get("fruit")) {
            System.out.println("Fruit: " + fruit);
        }

        // Retrieve and print the value from the original ImmutableMultimap
        /* read */ Integer value = multimap.get("key").iterator().next();
        System.out.println(value);

        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
    }
}