import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Add an entry to the map using the builder
        /* write */ builder.put("key", 42);
        
        // Create an ImmutableList and ImmutableSet for demonstration purposes
        ImmutableList<String> immutableList = ImmutableList.of("apple", "banana", "cherry");
        ImmutableSet<Integer> immutableSet = ImmutableSet.of(1, 2, 3, 4, 5);
        
        // Perform operations on the ImmutableList
        String firstFruit = immutableList.get(0);
        System.out.println("First fruit: " + firstFruit);
        
        // Perform operations on the ImmutableSet
        boolean containsThree = immutableSet.contains(3);
        System.out.println("Set contains 3: " + containsThree);
        
        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Perform some calculations
        int sum = 0;
        for (Integer number : immutableSet) {
            sum += number;
        }
        System.out.println("Sum of set elements: " + sum);
        
        // Read the value associated with the key
        /* read */ Integer value = map.get("key");
        
        // Print the value
        System.out.println("Value from map: " + value);
        
        // Further operations to make the program complex
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers 1 to 5: " + product);
        
        // Create another ImmutableSortedMap for demonstration
        ImmutableSortedMap<String, String> stringMap = ImmutableSortedMap.of("A", "Alpha", "B", "Beta", "C", "Gamma");
        String retrievedValue = stringMap.get("B");
        System.out.println("Retrieved value from stringMap: " + retrievedValue);
    }
}