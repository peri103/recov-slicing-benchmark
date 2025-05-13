import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableMap
        ImmutableMap.Builder<String, String> builder = ImmutableMap.builder();
        
        // Add a key-value pair using the builder
        /* write */ builder.put("key", "value");
        
        // Create another ImmutableMap for demonstration
        ImmutableMap<String, Integer> anotherMap = ImmutableMap.of("one", 1, "two", 2, "three", 3);
        
        // Use another collection type to add complexity
        ImmutableList.Builder<Integer> listBuilder = ImmutableList.builder();
        for (int i = 0; i < 5; i++) {
            listBuilder.add(i * 10);
        }
        ImmutableList<Integer> numberList = listBuilder.build();
        
        // Perform some operations with the numberList
        int sum = 0;
        for (int num : numberList) {
            sum += num;
        }
        System.out.println("Sum of numberList: " + sum);
        
        // Build the original ImmutableMap
        ImmutableMap<String, String> map = builder.build();
        
        // Read the value associated with the key
        /* read */ String value = map.get("key");
        
        // Print the value to ensure it's read correctly
        System.out.println("Value from map: " + value);
        
        // Further operations using anotherMap
        if (anotherMap.containsKey("two")) {
            System.out.println("Value for 'two': " + anotherMap.get("two"));
        }
        
        // Manipulate and display data from anotherMap
        for (String key : anotherMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + anotherMap.get(key));
        }
    }
}