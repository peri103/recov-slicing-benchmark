import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        Map<String, Integer> exampleMap = new HashMap<>();

        // Adding some unrelated map operations
        exampleMap.put("A", 1);
        exampleMap.put("B", 2);
        exampleMap.put("C", 3);

        // Iterate over the exampleMap and print values
        for (Map.Entry<String, Integer> entry : exampleMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Perform some calculations
        int sum = 0;
        for (Integer value : exampleMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values: " + sum);

        /* write */ rangeMap.put(Range.closed(1, 10), "Hello");

        // More operations with exampleMap
        exampleMap.put("D", 4);
        exampleMap.put("E", 5);

        // Print updated map
        for (String key : exampleMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + exampleMap.get(key));
        }

        // Perform operations with rangeMap
        rangeMap.put(Range.closed(11, 20), "World");

        // Retrieve and print values from rangeMap
        System.out.println("Value for range 5: " + rangeMap.get(5));
        System.out.println("Value for range 15: " + rangeMap.get(15));

        /* read */ String value = rangeMap.get(5);
        System.out.println(value);

        // Additional calculations
        int multipliedSum = sum * 2;
        System.out.println("Multiplied sum: " + multipliedSum);
    }
}