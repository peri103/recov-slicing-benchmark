import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        ImmutableBiMap.Builder<String, Integer> builder = new ImmutableBiMap.Builder<>();
        
        // Adding some unrelated code to make the program more complex
        ImmutableMap.Builder<String, String> mapBuilder = new ImmutableMap.Builder<>();
        mapBuilder.put("language", "Java");
        mapBuilder.put("library", "Guava");
        ImmutableMap<String, String> infoMap = mapBuilder.build();
        
        for (String key : infoMap.keySet()) {
            System.out.println(key + ": " + infoMap.get(key));
        }
        
        // Original write operation
        /* write */ builder.put("key1", 100);
        
        // More complex operations
        ImmutableBiMap.Builder<String, Integer> anotherBuilder = new ImmutableBiMap.Builder<>();
        anotherBuilder.put("key2", 200);
        anotherBuilder.put("key3", 300);
        ImmutableBiMap<String, Integer> anotherBiMap = anotherBuilder.build();
        
        for (String key : anotherBiMap.keySet()) {
            System.out.println(key + ": " + anotherBiMap.get(key));
        }
        
        // Original read operation
        ImmutableBiMap<String, Integer> biMap = builder.build();
        /* read */ Integer value = biMap.get("key1");
        System.out.println("Original value: " + value);
        
        // Further unrelated code
        int sum = 0;
        for (Integer val : anotherBiMap.values()) {
            sum += val;
        }
        System.out.println("Sum of anotherBiMap values: " + sum);
        
        ImmutableBiMap<String, Integer> combinedBiMap = new ImmutableBiMap.Builder<String, Integer>()
                .putAll(biMap)
                .putAll(anotherBiMap)
                .build();
        
        for (String key : combinedBiMap.keySet()) {
            System.out.println("Combined map - " + key + ": " + combinedBiMap.get(key));
        }
    }
}