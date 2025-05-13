import com.google.common.collect.ImmutableSortedMap;

public class Main {
    public static void main(String[] args) {
        // Initialize an ImmutableSortedMap.Builder
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        /* write */ builder.put("key1", 100);
        
        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        /* read */ Integer value = map.get("key1");
        
        System.out.println(value);
    }
}