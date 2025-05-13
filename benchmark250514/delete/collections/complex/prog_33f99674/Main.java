import org.apache.commons.collections4.map.LRUMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LRUMap<String, String> lruMap = new LRUMap<>(10);
        Map<String, Integer> hashMap = new HashMap<>();

        // Using HashMap for additional operations
        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);

        int sum = 0;
        for (Integer value : hashMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in hashMap: " + sum);

        // Original write operation
        /* write */ lruMap.put("key", "value");

        // Additional operations on LRUMap
        lruMap.put("anotherKey", "anotherValue");
        String anotherValue = lruMap.get("anotherKey");
        System.out.println("Value for anotherKey: " + anotherValue);

        // Some unrelated operations
        int[] numbers = {1, 2, 3, 4, 5};
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product of numbers: " + product);

        // Original read operation
        /* read */ String value = lruMap.get("key");
        System.out.println(value);

        // Further operations on HashMap
        hashMap.put("d", 4);
        hashMap.put("e", 5);

        int max = Integer.MIN_VALUE;
        for (Integer value : hashMap.values()) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Max value in hashMap: " + max);
    }
}