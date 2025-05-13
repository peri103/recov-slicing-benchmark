import com.google.common.collect.ImmutableSortedMap;

public class Main {
    public static void main(String[] args) {
        // Builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Using the builder to put a value
        /* write */ builder.put("key1", 123);
        
        // Building the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Reading the value
        /* read */ Integer value = map.get("key1");
        
        // Print the value
        System.out.println(value);
    }
}