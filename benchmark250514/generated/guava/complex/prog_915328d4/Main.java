import com.google.common.collect.TreeRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TreeRangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        RangeMap<Integer, String> anotherRangeMap = TreeRangeMap.create();
        Map<String, Integer> simpleMap = new HashMap<>();

        // Populate the simple map
        simpleMap.put("One", 1);
        simpleMap.put("Two", 2);
        simpleMap.put("Three", 3);

        // Populate another range map
        anotherRangeMap.put(Range.closed(20, 30), "Value2");
        anotherRangeMap.put(Range.closed(31, 40), "Value3");

        // Perform operations on the simple map
        for (Map.Entry<String, Integer> entry : simpleMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Perform operations on another range map
        String anotherValue = anotherRangeMap.get(25);
        System.out.println("Value in anotherRangeMap for key 25: " + anotherValue);

        // Original write operation
        /* write */ rangeMap.put(Range.closed(1, 10), "Value1");

        // Additional operations
        for (int i = 1; i <= 10; i++) {
            System.out.println("Checking rangeMap for key " + i + ": " + rangeMap.get(i));
        }

        // Manipulate simple map
        if (simpleMap.containsKey("Two")) {
            simpleMap.put("Two", 22);
        }

        // Display updated simple map
        for (Map.Entry<String, Integer> entry : simpleMap.entrySet()) {
            System.out.println("Updated Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Original read operation
        /* read */ String value = rangeMap.get(5);
        System.out.println(value);
    }
}