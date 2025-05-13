import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // ImmutableList does not support add operation directly as it is immutable,
        // hence we need to use a builder to add elements.
        ImmutableList.Builder<Integer> builder = ImmutableList.builder();
        
        // Create an ImmutableMap
        ImmutableMap<String, String> map = ImmutableMap.of("key1", "value1", "key2", "value2");
        
        // Perform some operations on the map
        if (map.containsKey("key1")) {
            System.out.println("Map contains key1: " + map.get("key1"));
        }
        
        // Adding elements to the builder
        builder.add(1);
        builder.add(2);
        builder.add(3);
        
        // Some unrelated computations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares from 0 to 9: " + sum);
        
        // Build the immutable list
        ImmutableList<Integer> list = builder.build();
        
        // More operations on the map
        System.out.println("Map contains key2: " + map.get("key2"));
        
        // Perform a computation using the list
        int product = 1;
        for (int i = 0; i < list.size(); i++) {
            product *= list.get(i);
        }
        System.out.println("Product of list elements: " + product);
        
        /* read */ int value = list.get(0);
        
        // Print the value obtained from the list
        System.out.println("Value from list: " + value);
        
        // Further unrelated computations
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}