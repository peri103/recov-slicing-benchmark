import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Define a range and associated value
        Range<Integer> range = Range.closed(1, 10);
        String valueToWrite = "Hello World";

        // Put the range and value into the builder
        /* write */ builder.put(range, valueToWrite);

        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();

        // Create a TreeRangeMap for more complex operations
        RangeMap<Integer, String> treeRangeMap = TreeRangeMap.create();
        treeRangeMap.put(Range.closed(11, 20), "Goodbye World");
        treeRangeMap.put(Range.closed(21, 30), "Welcome Back");

        // Create a HashMap for unrelated operations
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(31, "HashMap Entry");
        hashMap.put(32, "Another Entry");

        // Perform operations using TreeRangeMap
        String treeMapValue1 = treeRangeMap.get(15);
        String treeMapValue2 = treeRangeMap.get(25);

        // Perform operations using HashMap
        String hashMapValue1 = hashMap.get(31);
        String hashMapValue2 = hashMap.get(32);

        // Print values from TreeRangeMap and HashMap
        System.out.println(treeMapValue1);
        System.out.println(treeMapValue2);
        System.out.println(hashMapValue1);
        System.out.println(hashMapValue2);

        // Read the value using a key within the original range
        Integer keyToRead = 5;
        /* read */ String valueRead = rangeMap.get(keyToRead);

        // Print the read value
        System.out.println(valueRead);
    }
}