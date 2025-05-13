import org.apache.commons.collections4.map.PredicatedMap;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Predicate<Object> keyPredicate = key -> key instanceof String;
        Predicate<Object> valuePredicate = value -> value instanceof Integer;

        Map<String, Integer> baseMap = new HashMap<>();
        PredicatedMap<String, Integer> predicatedMap = PredicatedMap.predicatedMap(baseMap, keyPredicate, valuePredicate);

        // Additional predicated map for demonstration
        Map<String, String> baseMap2 = new HashMap<>();
        Predicate<Object> keyPredicate2 = key -> key instanceof String;
        Predicate<Object> valuePredicate2 = value -> value instanceof String;
        PredicatedMap<String, String> predicatedMap2 = PredicatedMap.predicatedMap(baseMap2, keyPredicate2, valuePredicate2);

        // Using the second predicated map
        predicatedMap2.put("hello", "world");
        predicatedMap2.put("foo", "bar");

        // Working with a list
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        // Performing operations on the list
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("List value: " + numbers.get(i));
        }

        /* write */ predicatedMap.put("key", 42);

        // More operations on the list
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of list values: " + sum);

        // Using the second predicated map
        String greeting = predicatedMap2.get("hello");
        System.out.println("Greeting from predicatedMap2: " + greeting);

        /* read */ int value = predicatedMap.get("key");
        System.out.println("Value from predicatedMap: " + value);

        // More complex operations
        Map<String, Integer> additionalMap = new HashMap<>();
        additionalMap.put("one", 1);
        additionalMap.put("two", 2);
        additionalMap.put("three", 3);

        int total = 0;
        for (String key : additionalMap.keySet()) {
            total += additionalMap.get(key);
        }
        System.out.println("Total from additionalMap: " + total);
    }
}