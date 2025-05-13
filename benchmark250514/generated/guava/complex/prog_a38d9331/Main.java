import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Add a range to the builder
        /* write */ builder.put(Range.closed(1, 10), "First Range");

        // Create an unrelated HashMap and perform operations
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(20, "Twenty");
        hashMap.put(30, "Thirty");

        // Iterate over the HashMap and print values
        for (Integer key : hashMap.keySet()) {
            System.out.println("HashMap Value: " + hashMap.get(key));
        }

        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();

        // Create another ImmutableRangeMap using a different builder
        ImmutableRangeMap.Builder<Integer, String> builder2 = ImmutableRangeMap.builder();
        builder2.put(Range.closed(11, 20), "Second Range");
        ImmutableRangeMap<Integer, String> rangeMap2 = builder2.build();

        // Use ImmutableList to store some values
        ImmutableList<String> immutableList = ImmutableList.of("A", "B", "C");

        // Iterate over ImmutableList and print values
        for (String item : immutableList) {
            System.out.println("ImmutableList Item: " + item);
        }

        // Read a value from the original ImmutableRangeMap
        /* read */ String value = rangeMap.get(5);

        // Print the value
        System.out.println("RangeMap Value: " + value);

        // Perform some operations with the second ImmutableRangeMap
        String secondRangeValue = rangeMap2.get(15);
        System.out.println("Second RangeMap Value: " + secondRangeValue);

        // Perform additional operations with HashMap
        hashMap.put(40, "Forty");
        System.out.println("Updated HashMap Value: " + hashMap.get(40));
    }
}