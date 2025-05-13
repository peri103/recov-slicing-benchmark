import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();

        // Add a range and a corresponding value
        /* write */ builder.put(Range.closed(1, 10), "Value1");

        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();

        // Create a HashMap to store some additional data
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(20, "ExtraValue1");
        hashMap.put(30, "ExtraValue2");

        // Create an ImmutableMap from the HashMap for demonstration purposes
        ImmutableMap<Integer, String> immutableMap = ImmutableMap.copyOf(hashMap);

        // Perform some operations on the ImmutableMap
        for (Map.Entry<Integer, String> entry : immutableMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Read the value for a given key within the range
        /* read */ String value = rangeMap.get(5);

        // Print the read value
        System.out.println(value);

        // Perform additional operations on the ImmutableRangeMap
        for (int i = 1; i <= 10; i++) {
            String val = rangeMap.get(i);
            if (val != null) {
                System.out.println("RangeMap Value at " + i + ": " + val);
            }
        }
    }
}