import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Add some unrelated code for complexity
        ImmutableMap.Builder<String, String> stringMapBuilder = ImmutableMap.builder();
        stringMapBuilder.put("name", "Alice");
        stringMapBuilder.put("city", "Wonderland");
        ImmutableMap<String, String> stringMap = stringMapBuilder.build();
        
        // Perform some operations on the unrelated map
        String city = stringMap.get("city");
        System.out.println("City: " + city);

        // Write operation to the ImmutableSortedMap
        /* write */ builder.put("key", 42);
        
        // Add more complexity: perform calculations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 natural numbers: " + sum);
        
        // Build the map after the write operation
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of first 3 natural numbers: " + product);
        
        // Read operation from the ImmutableSortedMap
        /* read */ int value = map.get("key");
        System.out.println("Value from map: " + value);
        
        // Additional complexity: string manipulation
        String greeting = "Hello, World!";
        String upperGreeting = greeting.toUpperCase();
        System.out.println(upperGreeting);
    }
}