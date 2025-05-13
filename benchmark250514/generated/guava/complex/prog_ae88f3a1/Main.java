import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableList
        ImmutableList.Builder<Integer> builder = ImmutableList.builder();
        
        // Add an element to the builder
        /* write */ builder.add(10);
        
        // Create a map to store some data
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Perform some operations on the map
        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        System.out.println("Sum of values in the map: " + sum);
        
        // Build the ImmutableList
        ImmutableList<Integer> immutableList = builder.build();
        
        // Create another ImmutableList and perform operations
        ImmutableList<Integer> anotherList = ImmutableList.of(20, 30, 40);
        int product = 1;
        for (int num : anotherList) {
            product *= num;
        }
        System.out.println("Product of values in anotherList: " + product);

        // Read the value at index 0
        /* read */ int value = immutableList.get(0);
        
        // Print the value
        System.out.println("Value from immutableList: " + value);
        
        // Additional complex operation
        int difference = product - sum;
        System.out.println("Difference between product and sum: " + difference);
    }
}