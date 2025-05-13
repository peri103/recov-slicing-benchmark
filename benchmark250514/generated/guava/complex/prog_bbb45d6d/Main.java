import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableList
        ImmutableList.Builder<Integer> builder = ImmutableList.builder();
        
        // Additional unrelated code: Create and manipulate a HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        System.out.println("Sum of map values: " + sum);
        
        // Write a value to the builder
        /* write */ builder.add(42);

        // More unrelated code: Perform some calculations
        int a = 5;
        int b = 10;
        int c = a + b;
        int d = a * b;
        System.out.println("Sum: " + c + ", Product: " + d);
        
        // Build the ImmutableList
        ImmutableList<Integer> immutableList = builder.build();
        
        // Additional unrelated code: Iterate and print elements from the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        
        // Read the value from the ImmutableList
        /* read */ int value = immutableList.get(0);
        
        // Output the read value
        System.out.println("Read value: " + value);
    }
}