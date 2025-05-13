import org.apache.commons.collections4.map.LazyMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original LazyMap instance
        Map<String, String> map = LazyMap.lazyMap(new HashMap<>(), () -> "default");
        
        // Additional LazyMap instance
        Map<Integer, Integer> intMap = LazyMap.lazyMap(new HashMap<>(), () -> 0);
        
        // Unrelated computations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
            intMap.put(i, i * i); // Store squares
        }
        
        /* write */ map.put("key", "value");
        
        // Process the unrelated map
        int totalSquareSum = 0;
        for (int i = 1; i <= 5; i++) {
            totalSquareSum += intMap.get(i); // Retrieve squares
        }
        
        // Unrelated logic
        StringBuilder builder = new StringBuilder();
        builder.append("Sum: ").append(sum).append(", Square Sum: ").append(totalSquareSum);
        
        // Original read operation
        /* read */ String value = map.get("key");
        
        // Print results
        System.out.println(value);
        System.out.println(builder.toString());
    }
}