import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initial setup for the original write-read pair
        Map<String, Integer> map = new HashMap<>();
        map.put("key", 42); // Initial write to the HashMap

        UnmodifiableMap<String, Integer> unmodifiableMap = UnmodifiableMap.unmodifiableMap(map);

        // Additional unrelated code to make the program more complex
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("name", "Alice");
        stringMap.put("city", "Wonderland");

        UnmodifiableMap<String, String> unmodifiableStringMap = UnmodifiableMap.unmodifiableMap(stringMap);

        System.out.println("Unmodifiable map contains: " + unmodifiableStringMap.get("name") + " from " + unmodifiableStringMap.get("city"));

        Map<Integer, String> anotherMap = new HashMap<>();
        for (int i = 1; i <= 5; i++) {
            anotherMap.put(i, "Value" + i);
        }

        UnmodifiableMap<Integer, String> unmodifiableAnotherMap = UnmodifiableMap.unmodifiableMap(anotherMap);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Key: " + i + ", Value: " + unmodifiableAnotherMap.get(i));
        }

        // Original write-read pair with added complexity
        System.out.println("Performing operations before accessing the original read...");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        /* read */ int value = unmodifiableMap.get("key");
        System.out.println(value);

        // More unrelated operations
        Map<String, Double> doubleMap = new HashMap<>();
        doubleMap.put("pi", 3.14159);
        doubleMap.put("e", 2.71828);

        UnmodifiableMap<String, Double> unmodifiableDoubleMap = UnmodifiableMap.unmodifiableMap(doubleMap);
        System.out.println("Pi: " + unmodifiableDoubleMap.get("pi"));
        System.out.println("Euler's number: " + unmodifiableDoubleMap.get("e"));
    }
}