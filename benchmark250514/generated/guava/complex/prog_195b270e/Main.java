import com.google.common.collect.Range;
import com.google.common.collect.TreeRangeMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TreeRangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        Map<Integer, String> anotherMap = new HashMap<>();

        // Initialize anotherMap with some values
        for (int i = 0; i < 5; i++) {
            anotherMap.put(i, "Value" + i);
        }

        // Perform some operations on anotherMap
        for (Map.Entry<Integer, String> entry : anotherMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        /* write */ rangeMap.put(Range.closed(1, 10), "Value1");

        // Add more entries to rangeMap
        rangeMap.put(Range.closed(11, 20), "Value2");
        rangeMap.put(Range.closed(21, 30), "Value3");

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // More operations on anotherMap
        if (anotherMap.containsKey(2)) {
            System.out.println("anotherMap contains key 2 with value: " + anotherMap.get(2));
        }

        /* read */ String value = rangeMap.get(5);
        System.out.println("Read value from rangeMap: " + value);

        // Further unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);
    }
}