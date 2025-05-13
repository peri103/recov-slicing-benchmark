import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> baseMap = new ArrayListValuedHashMap<>();
        UnmodifiableMultiValuedMap<String, Integer> map = new UnmodifiableMultiValuedMap<>(baseMap);

        /* write */ baseMap.put("key", 42);

        // Adding some complex operations
        MultiMap<String, String> multiMap = new MultiValueMap<>();
        multiMap.put("fruit", "apple");
        multiMap.put("fruit", "banana");
        multiMap.put("color", "red");
        multiMap.put("color", "blue");

        // Iterating over the MultiMap
        for (String key : multiMap.keySet()) {
            System.out.println("Key: " + key);
            for (String value : multiMap.get(key)) {
                System.out.println("Value: " + value);
            }
        }

        // Performing some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Using the original map
        /* read */ Integer value = map.get("key").iterator().next();
        System.out.println("Read value: " + value);

        // More operations
        baseMap.put("key", 100);
        baseMap.put("anotherKey", 200);

        for (String key : baseMap.keySet()) {
            System.out.println("BaseMap Key: " + key);
            for (Integer val : baseMap.get(key)) {
                System.out.println("BaseMap Value: " + val);
            }
        }
    }
}