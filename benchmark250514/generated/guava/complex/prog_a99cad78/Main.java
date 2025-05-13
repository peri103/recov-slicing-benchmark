import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Using the builder to put a value
        /* write */ builder.put("key1", 123);
        
        // Adding more key-value pairs
        builder.put("key2", 456);
        builder.put("key3", 789);
        
        // Building the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Creating an ImmutableList with some values
        ImmutableList<String> keys = ImmutableList.of("key1", "key2", "key3");
        
        // Iterating over the keys and printing values from the map
        for (String key : keys) {
            if (map.containsKey(key)) {
                System.out.println("Value for " + key + ": " + map.get(key));
            }
        }
        
        // Performing some unrelated arithmetic operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i * 10;
        }
        System.out.println("Sum of multiples of 10: " + sum);
        
        // Reading the value
        /* read */ Integer value = map.get("key1");
        
        // Print the value
        System.out.println("Read value: " + value);
        
        // More unrelated logic: calculating factorial
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}