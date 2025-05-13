import org.apache.commons.collections4.map.TransformedMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        Map<String, String> originalMap = new HashMap<>();
        TransformedMap<String, String, String> transformedMap = TransformedMap.transformedMap(originalMap, String::toUpperCase, String::toLowerCase);
        
        /* write */ transformedMap.put("Key", "Value");

        // Additional code to make the program more complex
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * i);
        }

        for (Integer num : numbers) {
            System.out.println("Square: " + num);
        }

        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);

        int totalAge = 0;
        for (Integer age : ageMap.values()) {
            totalAge += age;
        }
        System.out.println("Total Age: " + totalAge);

        // Read from the original write-read pair
        /* read */ String value = transformedMap.get("Key");
        
        System.out.println("Transformed Value: " + value);
        
        // Additional transformation and operations
        TransformedMap<String, Integer, Integer> multiplierMap = TransformedMap.transformedMap(new HashMap<>(), String::length, val -> val * 2);
        multiplierMap.put("Hello", 5);
        multiplierMap.put("World", 3);

        int sum = 0;
        for (Integer val : multiplierMap.values()) {
            sum += val;
        }
        System.out.println("Sum of transformed values: " + sum);
    }
}