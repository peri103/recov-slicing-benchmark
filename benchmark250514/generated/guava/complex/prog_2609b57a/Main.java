import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a map with some initial values
        Map<Integer, String> initialMap = new HashMap<>();
        initialMap.put(20, "InitialValue1");
        initialMap.put(30, "InitialValue2");

        // Add some more values to the map
        for (int i = 40; i < 50; i++) {
            initialMap.put(i, "Value" + i);
        }

        // Use the ImmutableRangeMap builder
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        /* write */ builder.put(Range.closed(1, 10), "Value1");
        
        // Add additional ranges to the builder
        builder.put(Range.closed(15, 20), "Value2");
        builder.put(Range.closed(25, 30), "Value3");

        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();

        // Perform some operations on the initial map
        for (Map.Entry<Integer, String> entry : initialMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Read from the ImmutableRangeMap
        /* read */ String value = rangeMap.get(5);
        System.out.println(value);

        // Check values in the ImmutableRangeMap
        for (int i = 1; i <= 30; i += 5) {
            String mapValue = rangeMap.get(i);
            if (mapValue != null) {
                System.out.println("RangeMap Value at " + i + ": " + mapValue);
            }
        }
    }
}