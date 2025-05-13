import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // ImmutableMap does not support put operation directly as it is immutable.
        // Instead, we use ImmutableMap.Builder to construct the map.
        ImmutableMap.Builder<String, Integer> builder = ImmutableMap.builder();
        /* write */ builder.put("key", 42);
        
        ImmutableMap<String, Integer> map = builder.build();
        /* read */ Integer value = map.get("key");
        
        System.out.println(value);
    }
}