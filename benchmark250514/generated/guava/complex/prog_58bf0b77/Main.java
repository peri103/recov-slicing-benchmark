import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for an ImmutableMap
        ImmutableMap.Builder<String, Integer> builder = ImmutableMap.builder();
        
        // Use the builder to add a key-value pair
        /* write */ builder.put("key", 42);
        
        // Create another ImmutableMap for additional complexity
        ImmutableMap.Builder<String, String> anotherBuilder = ImmutableMap.builder();
        anotherBuilder.put("name", "John");
        anotherBuilder.put("city", "New York");
        ImmutableMap<String, String> anotherMap = anotherBuilder.build();
        
        // Create an ImmutableList
        ImmutableList.Builder<Integer> listBuilder = ImmutableList.builder();
        for (int i = 0; i < 5; i++) {
            listBuilder.add(i * 10);
        }
        ImmutableList<Integer> numberList = listBuilder.build();
        
        // Perform some operations using the ImmutableList
        int sum = 0;
        for (Integer number : numberList) {
            sum += number;
        }
        System.out.println("Sum of numbers in ImmutableList: " + sum);
        
        // Build the original ImmutableMap
        ImmutableMap<String, Integer> map = builder.build();
        
        // Read the value associated with the key
        /* read */ Integer value = map.get("key");
        
        // Print the value
        System.out.println("Value from ImmutableMap: " + value);
        
        // Print values from the additional ImmutableMap
        System.out.println("Name: " + anotherMap.get("name"));
        System.out.println("City: " + anotherMap.get("city"));
    }
}