import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.multimap.PredicatedMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.multimap.MultiValuedMap;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Predicate<Object> keyPredicate = key -> key instanceof String;
        Predicate<Object> valuePredicate = value -> value instanceof Integer;

        PredicatedMultiValuedMap<String, Integer> map = new PredicatedMultiValuedMap<>(
                new ArrayListValuedHashMap<>(), keyPredicate, valuePredicate);

        /* write */ map.put("key1", 42);

        // Additional unrelated complex logic
        MultiValuedMap<String, String> stringMap = new ArrayListValuedHashMap<>();
        stringMap.put("fruit", "apple");
        stringMap.put("fruit", "banana");
        stringMap.put("color", "red");

        Collection<String> fruits = stringMap.get("fruit");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // More complex logic
        for (int i = 0; i < 5; i++) {
            map.put("key" + i, i * 10);
        }

        Collection<Integer> values = map.get("key2");
        for (Integer val : values) {
            System.out.println("Value for key2: " + val);
        }

        // Some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first ten integers: " + sum);

        // Access the previously written value
        /* read */ Integer value = map.get("key1").iterator().next();

        System.out.println("Value for key1: " + value);

        // Further complex logic
        for (int i = 0; i < 3; i++) {
            stringMap.put("animal", "animal" + i);
        }

        Collection<String> animals = stringMap.get("animal");
        for (String animal : animals) {
            System.out.println("Animal: " + animal);
        }
    }
}