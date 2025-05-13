import org.apache.commons.collections4.map.FixedSizeMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> initialMap = new HashMap<>();
        initialMap.put("key1", "initialValue1");
        initialMap.put("key2", "initialValue2");

        FixedSizeMap<String, String> fixedSizeMap = FixedSizeMap.fixedSizeMap(initialMap);

        // Unrelated operations with ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        // Perform some operations on the list
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Additional map operations
        Map<String, Integer> additionalMap = new HashMap<>();
        additionalMap.put("first", 100);
        additionalMap.put("second", 200);

        // Iterate over the additional map
        for (Map.Entry<String, Integer> entry : additionalMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        /* write */ fixedSizeMap.put("key1", "value1");

        // More complex operations with the initial map
        for (Map.Entry<String, String> entry : initialMap.entrySet()) {
            System.out.println("Initial Map Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Perform calculations
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        System.out.println("Product of numbers: " + product);

        /* read */ String value = fixedSizeMap.get("key1");
        System.out.println(value);

        // Further operations with numbers
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max number: " + max);
    }
}