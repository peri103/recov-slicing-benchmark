import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableBiMap.Builder;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Builder<String, Integer> builder = ImmutableBiMap.builder();
        Map<String, String> tempMap = new HashMap<>();
        tempMap.put("tempKey1", "tempValue1");
        tempMap.put("tempKey2", "tempValue2");
        
        // Adding some unrelated operations
        for (Map.Entry<String, String> entry : tempMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Another ImmutableBiMap usage
        Builder<String, String> builder2 = ImmutableBiMap.builder();
        builder2.put("keyA", "valueA");
        builder2.put("keyB", "valueB");
        ImmutableBiMap<String, String> biMap2 = builder2.build();
        String valA = biMap2.get("keyA");
        System.out.println("Read from biMap2: " + valA);

        /* write */ builder.put("key1", 100);
        ImmutableBiMap<String, Integer> biMap = builder.build();
        
        // More complex operations
        ImmutableMap<String, Integer> immutableMap = ImmutableMap.of("key2", 200, "key3", 300);
        for (String key : immutableMap.keySet()) {
            System.out.println(key + " -> " + immutableMap.get(key));
        }
        
        // Final read operation
        /* read */ Integer value = biMap.get("key1");
        System.out.println("Read from biMap: " + value);
        
        // Additional unrelated code
        int sum = 0;
        for (Integer val : immutableMap.values()) {
            sum += val;
        }
        System.out.println("Sum of values in immutableMap: " + sum);
    }
}