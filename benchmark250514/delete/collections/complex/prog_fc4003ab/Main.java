import org.apache.commons.collections4.map.UnmodifiableMap;
import org.apache.commons.collections4.map.LazyMap;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Map<String, String> modifiableMap = new HashMap<>();
        UnmodifiableMap<String, String> map = UnmodifiableMap.unmodifiableMap(modifiableMap);

        // Additional code to make the program more complex
        Map<String, Integer> lazyMap = LazyMap.lazyMap(new HashMap<>(), new Function<String, Integer>() {
            @Override
            public Integer apply(String key) {
                return key.length();
            }
        });

        lazyMap.put("apple", 5);
        lazyMap.put("banana", 6);

        int appleLength = lazyMap.get("apple");
        System.out.println("Length of 'apple': " + appleLength);

        // Complex calculations
        int sum = 0;
        for (String key : lazyMap.keySet()) {
            sum += lazyMap.get(key);
        }
        System.out.println("Sum of lengths: " + sum);

        // Original write operation
        /* write */ modifiableMap.put("key", "value");

        // More operations
        lazyMap.put("cherry", 6);
        int cherryLength = lazyMap.get("cherry");
        System.out.println("Length of 'cherry': " + cherryLength);

        // Read operation
        /* read */ String value = map.get("key");
        System.out.println(value);

        // More complex operations
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("date", 4);
        anotherMap.put("elderberry", 10);

        int product = 1;
        for (Integer length : anotherMap.values()) {
            product *= length;
        }
        System.out.println("Product of lengths: " + product);
    }
}