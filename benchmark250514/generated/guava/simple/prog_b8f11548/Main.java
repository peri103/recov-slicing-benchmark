import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableMap
        ImmutableMap.Builder<String, Integer> builder = ImmutableMap.builder();
        /* write */ builder.put("key", 42);
        
        // Build the ImmutableMap
        ImmutableMap<String, Integer> map = builder.build();
        
        /* read */ Integer value = map.get("key");
        System.out.println(value);
    }
}