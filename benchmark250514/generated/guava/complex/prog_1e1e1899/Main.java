import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.collect.Multimap;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableMultimap
        Builder<String, Integer> builder = ImmutableMultimap.builder();
        
        // Use the write method to add a key-value pair
        /* write */ builder.put("key", 42);
        
        // Perform some unrelated operations
        ListMultimap<String, String> listMultimap = ArrayListMultimap.create();
        listMultimap.put("fruit", "apple");
        listMultimap.put("fruit", "banana");
        listMultimap.put("vegetable", "carrot");
        
        // Iterate over the listMultimap and print the values
        for (String key : listMultimap.keySet()) {
            System.out.println("Category: " + key);
            for (String value : listMultimap.get(key)) {
                System.out.println("Item: " + value);
            }
        }

        // Add more unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Build the ImmutableMultimap
        ImmutableMultimap<String, Integer> multimap = builder.build();
        
        // Perform some operations before reading
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello, ").append("World!");
        System.out.println(stringBuilder.toString());

        // Use the read method to retrieve the value associated with the key
        /* read */ Integer value = multimap.get("key").iterator().next();
        
        // Print the retrieved value
        System.out.println("Retrieved value: " + value);

        // Final operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}