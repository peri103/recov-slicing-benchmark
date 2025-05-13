import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.MultiValuedMapBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> map = MultiValuedMapBuilder.hashMap().arrayListValues().build();
        TransformedMultiValuedMap<String, Integer> transformedMap = TransformedMultiValuedMap.transformingMap(map, null, null);

        // Unrelated code to make the program more complex
        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("a", "apple");
        simpleMap.put("b", "banana");
        simpleMap.put("c", "cherry");

        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Similar API pair usage
        MultiValuedMap<String, String> multiMap = MultiValuedMapBuilder.hashMap().arrayListValues().build();
        multiMap.put("fruit", "apple");
        multiMap.put("fruit", "banana");
        multiMap.put("fruit", "cherry");
        
        Collection<String> fruits = multiMap.get("fruit");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        /* write */ transformedMap.put("key1", 42);

        // Additional unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9 is: " + sum);

        // More complex logic
        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);

        int total = 0;
        for (Integer value : numberMap.values()) {
            total += value;
        }
        System.out.println("Total of numbers in numberMap is: " + total);

        /* read */ Collection<Integer> values = transformedMap.get("key1");
        for (Integer value : values) {
            System.out.println(value);
        }

        // Additional unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5 is: " + product);
    }
}