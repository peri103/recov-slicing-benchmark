import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> map = new MultiValueMap<>();
        UnmodifiableMultiValuedMap<String, Integer> unmodifiableMap = new UnmodifiableMultiValuedMap<>(map);

        // Additional complex operations
        MultiValuedMap<String, String> anotherMap = new MultiValueMap<>();
        anotherMap.put("fruit", "apple");
        anotherMap.put("fruit", "banana");
        anotherMap.put("vegetable", "carrot");

        System.out.println("Items under 'fruit': " + anotherMap.get("fruit"));

        // Performing some operations on anotherMap
        for (String key : anotherMap.keySet()) {
            System.out.println("Key: " + key + ", Values: " + anotherMap.get(key));
        }

        /* write */ map.put("key", 42);

        // Additional calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // More operations on anotherMap
        anotherMap.put("fruit", "orange");
        System.out.println("Updated items under 'fruit': " + anotherMap.get("fruit"));

        /* read */ Integer value = unmodifiableMap.get("key").iterator().next();
        System.out.println("Value from unmodifiableMap: " + value);

        // More calculations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}