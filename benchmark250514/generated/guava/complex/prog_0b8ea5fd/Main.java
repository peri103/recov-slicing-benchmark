import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Use the builder to add a key-value pair to the map
        /* write */ builder.put("key1", 100);
        
        // Perform some unrelated operations
        ImmutableList.Builder<String> listBuilder = ImmutableList.builder();
        listBuilder.add("Apple");
        listBuilder.add("Banana");
        listBuilder.add("Cherry");
        ImmutableList<String> fruits = listBuilder.build();

        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // Creating another ImmutableSortedMap with different values
        ImmutableSortedMap.Builder<String, Integer> anotherBuilder = ImmutableSortedMap.naturalOrder();
        anotherBuilder.put("key2", 200);
        anotherBuilder.put("key3", 300);
        ImmutableSortedMap<String, Integer> anotherMap = anotherBuilder.build();

        for (String key : anotherMap.keySet()) {
            System.out.println(key + ": " + anotherMap.get(key));
        }

        // Build the original ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Perform more unrelated operations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i * 10;
            System.out.println("Current sum: " + sum);
        }

        // Read the value associated with "key1"
        /* read */ Integer value = map.get("key1");
        
        // Print the value
        System.out.println("Value associated with 'key1': " + value);
    }
}