import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a mutable map to use with UnmodifiableMap
        Map<String, String> mutableMap = new HashMap<>();
        
        // Wrap the mutable map with UnmodifiableMap
        Map<String, String> unmodifiableMap = UnmodifiableMap.unmodifiableMap(mutableMap);
        
        // Perform write operation
        /* write */ mutableMap.put("key", "value");

        // Additional unrelated operations to make the program more complex
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("one", 1);
        anotherMap.put("two", 2);
        anotherMap.put("three", 3);
        
        int total = 0;
        for (String key : anotherMap.keySet()) {
            total += anotherMap.get(key);
        }
        System.out.println("Total from anotherMap: " + total);
        
        // Perform read operation
        /* read */ String value = unmodifiableMap.get("key");
        
        // Output the value
        System.out.println(value);

        // More operations to increase complexity
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        
        for (String str : strings) {
            System.out.println(str);
        }
    }
}