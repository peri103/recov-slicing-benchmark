import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableMap
        ImmutableMap.Builder<String, Integer> builder = ImmutableMap.builder();
        /* write */ builder.put("key", 42);
        
        // Additional unrelated code to make the program more complex
        ImmutableList.Builder<String> listBuilder = ImmutableList.builder();
        listBuilder.add("apple");
        listBuilder.add("banana");
        listBuilder.add("cherry");
        ImmutableList<String> fruitList = listBuilder.build();
        
        for (String fruit : fruitList) {
            System.out.println("Fruit: " + fruit);
        }
        
        // Build the ImmutableMap
        ImmutableMap<String, Integer> map = builder.build();
        
        // More complex operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i * 10;
        }
        System.out.println("Sum: " + sum);
        
        // Final read operation
        /* read */ Integer value = map.get("key");
        System.out.println(value);
        
        // Additional logic to process the map
        for (String key : map.keySet()) {
            System.out.println("Map contains key: " + key);
        }
    }
}