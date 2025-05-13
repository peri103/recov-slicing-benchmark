import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableRangeSet
        ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();

        // Add a range to the builder
        /* write */ builder.add(Range.closed(1, 10));

        // Create another ImmutableRangeSet with different ranges
        ImmutableRangeSet.Builder<Integer> anotherBuilder = ImmutableRangeSet.builder();
        anotherBuilder.add(Range.closed(20, 30));
        anotherBuilder.add(Range.closed(40, 50));
        ImmutableRangeSet<Integer> anotherRangeSet = anotherBuilder.build();

        // Create a complex data structure using ImmutableList and a Map
        ImmutableList<String> immutableList = ImmutableList.of("apple", "banana", "cherry");
        Map<String, Integer> fruitMap = new HashMap<>();
        for (String fruit : immutableList) {
            fruitMap.put(fruit, fruit.length());
        }

        // Output the fruit lengths
        for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
            System.out.println("Fruit: " + entry.getKey() + ", Length: " + entry.getValue());
        }

        // Build the original ImmutableRangeSet
        ImmutableRangeSet<Integer> rangeSet = builder.build();

        // Perform some operations with anotherRangeSet
        boolean containsInAnother = anotherRangeSet.contains(25);
        System.out.println("Contains 25 in anotherRangeSet: " + containsInAnother);

        // Check if the original rangeSet contains a specific value
        /* read */ boolean contains = rangeSet.contains(5);
        System.out.println("Contains 5 in rangeSet: " + contains);

        // More complex operations
        for (int i = 0; i < 100; i += 10) {
            if (rangeSet.contains(i)) {
                System.out.println(i + " is within the original rangeSet.");
            } else if (anotherRangeSet.contains(i)) {
                System.out.println(i + " is within the anotherRangeSet.");
            } else {
                System.out.println(i + " is not contained in any rangeSet.");
            }
        }
    }
}