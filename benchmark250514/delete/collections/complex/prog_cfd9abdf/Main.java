import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.multimap.PredicatedMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.map.PredicatedMap;
import org.apache.commons.collections4.map.HashedMap;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Define a predicate that always returns true, allowing all entries
        Predicate<Object> truePredicate = new Predicate<Object>() {
            public boolean evaluate(Object o) {
                return true;
            }
        };

        // Create a PredicatedMultiValuedMap with the true predicate
        PredicatedMultiValuedMap<String, Integer> map = new PredicatedMultiValuedMap<>(
                new ArrayListValuedHashMap<>(), truePredicate, truePredicate);

        /* write */ map.put("key", 42);

        // Create a PredicatedMap with the true predicate
        Map<String, String> predicatedMap = PredicatedMap.predicatedMap(new HashedMap<>(), truePredicate, truePredicate);
        predicatedMap.put("name", "John Doe");
        predicatedMap.put("age", "30");

        // Some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // More operations on the PredicatedMap
        if (predicatedMap.containsKey("name")) {
            System.out.println("Name: " + predicatedMap.get("name"));
        }

        if (predicatedMap.containsKey("age")) {
            System.out.println("Age: " + predicatedMap.get("age"));
        }

        // Perform some arithmetic operations
        int a = 5;
        int b = 10;
        int result = a * b + sum;
        System.out.println("Result of arithmetic operations: " + result);

        // Access the value from the PredicatedMultiValuedMap
        /* read */ int value = map.get("key").iterator().next();
        System.out.println("Value from PredicatedMultiValuedMap: " + value);

        // Perform some logical operations
        boolean isAdult = Integer.parseInt(predicatedMap.get("age")) >= 18;
        System.out.println("Is adult: " + isAdult);
    }
}