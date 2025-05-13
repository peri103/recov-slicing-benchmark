import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create an immutable map with a key-value pair
        /* write */ ImmutableMap<String, Integer> map = ImmutableMap.of("key1", 1);

        // Check if the map contains the key "key1"
        /* read */ boolean containsKey = map.containsKey("key1");
        
        System.out.println(containsKey);
    }
}