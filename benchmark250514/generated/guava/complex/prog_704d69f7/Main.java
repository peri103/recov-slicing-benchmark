import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Add a range and associate it with a value
        /* write */ builder.put(Range.closed(1, 10), "Value1");

        // Create a separate ImmutableMap for demonstration
        ImmutableMap<String, Integer> immutableMap = ImmutableMap.of("One", 1, "Two", 2, "Three", 3);

        // Perform operations on the ImmutableMap
        for (Map.Entry<String, Integer> entry : immutableMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Create a HashMap for some unrelated operations
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        hashMap.put("C", "Cherry");

        // Iterate over the HashMap and print values
        for (String key : hashMap.keySet()) {
            System.out.println("Fruit for " + key + " is " + hashMap.get(key));
        }

        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();

        // Retrieve the value associated with a specific key within the range
        /* read */ String value = rangeMap.get(5);

        // Print the value
        System.out.println(value); // Output should be "Value1"

        // Perform some additional operations with the rangeMap
        System.out.println("RangeMap size: " + rangeMap.asMapOfRanges().size());
        for (Range<Integer> range : rangeMap.asMapOfRanges().keySet()) {
            System.out.println("Range: " + range + ", Associated Value: " + rangeMap.get(range.lowerEndpoint()));
        }
    }
}