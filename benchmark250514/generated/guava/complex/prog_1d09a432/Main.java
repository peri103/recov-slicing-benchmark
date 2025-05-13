import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableList
        ImmutableList.Builder<Integer> builder = ImmutableList.builder();
        
        // Add an element using the builder
        /* write */ builder.add(42);
        
        // Create a map and populate it with some data
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        
        // Iterate over the map and print each key-value pair
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Create a builder for ImmutableSet
        ImmutableSet.Builder<String> setBuilder = ImmutableSet.builder();
        setBuilder.add("A");
        setBuilder.add("B");
        
        // Build the ImmutableSet and print its contents
        ImmutableSet<String> set = setBuilder.build();
        for (String s : set) {
            System.out.println("Set element: " + s);
        }
        
        // Build the ImmutableList
        ImmutableList<Integer> list = builder.build();
        
        // Perform some arithmetic operations
        int a = 10;
        int b = 20;
        int sum = a + b;
        int product = a * b;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        
        // Read the element from the ImmutableList
        /* read */ int value = list.get(0);
        
        // Print the value
        System.out.println(value);
        
        // Perform some additional operations with the list
        int doubledValue = value * 2;
        System.out.println("Doubled Value: " + doubledValue);
    }
}