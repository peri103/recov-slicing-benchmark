import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the RangeMap
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();

        // Define a range and a value to associate with that range
        Range<Integer> range = Range.closed(1, 10);
        String valueToWrite = "Value in Range";

        // Use the put method to associate the value with the range
        /* write */ rangeMap.put(range, valueToWrite);

        // Initialize a HashMap for additional complexity
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(20, "Twenty");
        hashMap.put(30, "Thirty");
        
        // Perform some operations on the HashMap
        for (int i = 20; i <= 30; i += 10) {
            String val = hashMap.get(i);
            if (val != null) {
                System.out.println("HashMap contains: " + val);
            }
        }

        // Initialize another RangeMap for further complexity
        RangeMap<Integer, String> anotherRangeMap = TreeRangeMap.create();
        anotherRangeMap.put(Range.closed(15, 25), "Mid Range");
        anotherRangeMap.put(Range.closed(26, 35), "Upper Range");

        // Perform operations on the second RangeMap
        for (int i = 15; i <= 35; i += 5) {
            String rangeValue = anotherRangeMap.get(i);
            if (rangeValue != null) {
                System.out.println("AnotherRangeMap contains: " + rangeValue);
            }
        }

        // Use the get method to retrieve the value associated with a specific key in the original RangeMap
        /* read */ String valueRead = rangeMap.get(5);

        // Output the read value
        System.out.println(valueRead);

        // Perform additional unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
    }
}