import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.HashedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> baseMap = new HashedMap<>();
        TransformedMultiValuedMap<String, Integer> transformedMap = TransformedMultiValuedMap.transformingMap(baseMap, key -> key, value -> value);

        // Additional complex operations
        MultiValuedMap<String, String> anotherMap = new ArrayListValuedHashMap<>();
        anotherMap.put("fruit", "apple");
        anotherMap.put("fruit", "banana");
        anotherMap.put("fruit", "cherry");

        for (String key : anotherMap.keySet()) {
            System.out.println("Key: " + key + " Values: " + anotherMap.get(key));
        }

        Map<String, String> simpleMap = new HashedMap<>();
        simpleMap.put("country", "USA");
        simpleMap.put("city", "New York");
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        /* write */ transformedMap.put("key1", 100);

        // More unrelated code
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // Operations on transformedMap
        transformedMap.put("key2", 200);
        transformedMap.put("key3", 300);

        for (String key : transformedMap.keySet()) {
            System.out.println("TransformedMap Key: " + key + " Values: " + transformedMap.get(key));
        }

        /* read */ Integer value = transformedMap.get("key1").iterator().next();
        System.out.println(value);

        // Further complexity
        MultiValuedMap<String, Double> priceMap = new ArrayListValuedHashMap<>();
        priceMap.put("item", 9.99);
        priceMap.put("item", 19.99);
        priceMap.put("item", 29.99);

        double totalPrice = 0;
        for (Double price : priceMap.get("item")) {
            totalPrice += price;
        }
        System.out.println("Total price of items: " + totalPrice);
    }
}