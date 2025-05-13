import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableBiMap
        ImmutableBiMap.Builder<String, Integer> builder = ImmutableBiMap.builder();
        
        // Create an ImmutableSet and add some elements
        ImmutableSet<String> set = ImmutableSet.of("A", "B", "C");
        
        // Create an ImmutableList and add some elements
        ImmutableList<Integer> list = ImmutableList.of(10, 20, 30);
        
        // Add elements to the biMap using the builder
        builder.put("alpha", 1);
        builder.put("beta", 2);
        
        // Perform some operations on the set and list
        for (String s : set) {
            System.out.println("Set element: " + s);
        }
        
        for (Integer i : list) {
            System.out.println("List element: " + i);
        }
        
        // Add the original key-value pair to the biMap
        /* write */ builder.put("key", 42);
        
        // Build the ImmutableBiMap
        ImmutableBiMap<String, Integer> biMap = builder.build();
        
        // Perform some operations on the biMap
        for (String key : biMap.keySet()) {
            System.out.println("BiMap key: " + key + ", value: " + biMap.get(key));
        }
        
        // Retrieve the value using the original key
        /* read */ Integer value = biMap.get("key");
        System.out.println("Retrieved value: " + value);
        
        // Additional operations
        ImmutableBiMap<String, Integer> invertedBiMap = biMap.inverse();
        System.out.println("Inverted BiMap: " + invertedBiMap);
    }
}