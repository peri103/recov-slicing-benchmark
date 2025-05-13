import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        ImmutableBiMap.Builder<String, Integer> builder = new ImmutableBiMap.Builder<>();
        builder.put("anotherKey", 100);
        builder.put("yetAnotherKey", 200);
        
        ImmutableMap.Builder<String, String> stringBuilder = new ImmutableMap.Builder<>();
        stringBuilder.put("hello", "world");
        stringBuilder.put("foo", "bar");
        
        /* write */ builder.put("key", 42);
        
        ImmutableBiMap<String, Integer> biMap = builder.build();
        
        ImmutableMap<String, String> stringMap = stringBuilder.build();
        
        int sum = 0;
        for (String key : biMap.keySet()) {
            sum += biMap.get(key);
        }
        
        System.out.println("Sum of values in biMap: " + sum);
        
        for (String key : stringMap.keySet()) {
            System.out.println(key + " -> " + stringMap.get(key));
        }
        
        /* read */ Integer value = biMap.get("key");
        System.out.println(value);
        
        int product = 1;
        for (Integer val : biMap.values()) {
            product *= val;
        }
        
        System.out.println("Product of values in biMap: " + product);
        
        StringBuilder concatenatedKeys = new StringBuilder();
        for (String key : stringMap.keySet()) {
            concatenatedKeys.append(key);
        }
        
        System.out.println("Concatenated keys in stringMap: " + concatenatedKeys.toString());
    }
}