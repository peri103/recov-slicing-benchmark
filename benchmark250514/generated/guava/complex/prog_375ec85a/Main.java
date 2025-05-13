import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Initialize an ImmutableBiMap and add a key-value pair
        ImmutableBiMap<String, Integer> biMap = ImmutableBiMap.<String, Integer>builder()
            /* write */ .put("key", 1)
            .build();
        
        // Perform some unrelated operations with another ImmutableBiMap
        ImmutableBiMap<String, String> biMap2 = ImmutableBiMap.<String, String>builder()
            .put("a", "apple")
            .put("b", "banana")
            .build();
        
        // Use an ImmutableList for some operations
        ImmutableList<String> list = ImmutableList.of("first", "second", "third");
        for (String item : list) {
            System.out.println(item);
        }
        
        // Further operations on biMap2
        String fruit = biMap2.get("a");
        System.out.println("Fruit: " + fruit);
        
        // Execute unrelated logic before reading from the original biMap
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        
        // Read the value from the original biMap
        /* read */ Integer value = biMap.get("key");
        System.out.println(value);
        
        // Additional operations after reading
        for (String key : biMap2.keySet()) {
            System.out.println("Key: " + key + ", Value: " + biMap2.get(key));
        }
    }
}