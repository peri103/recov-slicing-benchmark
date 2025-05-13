import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableMap
        ImmutableMap.Builder<String, String> builder = ImmutableMap.builder();
        
        // Add key-value pairs using the builder
        /* write */ builder.put("key1", "value1");
        
        // Perform some unrelated operations
        ImmutableList.Builder<Integer> listBuilder = ImmutableList.builder();
        for (int i = 0; i < 5; i++) {
            listBuilder.add(i);
        }
        ImmutableList<Integer> numberList = listBuilder.build();
        
        // Iterate over the list and print each number
        for (Integer number : numberList) {
            System.out.println("Number: " + number);
        }
        
        // Build the ImmutableMap
        ImmutableMap<String, String> map = builder.build();
        
        // Perform operations with the map
        if (map.containsKey("key1")) {
            System.out.println("Map contains key1");
        }
        
        // Read the value associated with "key1"
        /* read */ String value = map.get("key1");
        
        // Print the read value
        System.out.println("Value for key1: " + value);
        
        // More unrelated operations
        ImmutableMap.Builder<String, Integer> anotherBuilder = ImmutableMap.builder();
        anotherBuilder.put("a", 1);
        anotherBuilder.put("b", 2);
        ImmutableMap<String, Integer> anotherMap = anotherBuilder.build();
        
        for (String key : anotherMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + anotherMap.get(key));
        }
    }
}