import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeSet
        ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();

        // Add a range to the builder
        builder.add(Range.closed(1, 10));

        // Create another ImmutableRangeSet for demonstration
        ImmutableRangeSet.Builder<Integer> anotherBuilder = ImmutableRangeSet.builder();
        anotherBuilder.add(Range.closed(20, 30));
        ImmutableRangeSet<Integer> anotherRangeSet = anotherBuilder.build();

        // Create a map to store range sets
        HashMap<String, ImmutableRangeSet<Integer>> rangeMap = new HashMap<>();
        rangeMap.put("firstRange", anotherRangeSet);

        // Add more ranges to the builder
        builder.add(Range.closed(11, 15));
        builder.add(Range.closed(16, 19));

        // Use an ImmutableList for demonstration
        ImmutableList<String> immutableList = ImmutableList.of("A", "B", "C");
        for (String item : immutableList) {
            System.out.println(item);
        }

        // Build the ImmutableRangeSet
        /* write */ ImmutableRangeSet<Integer> rangeSet = builder.build();

        // Perform some operations unrelated to the original write-read pair
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        // Check if a value is contained within the range set
        /* read */ boolean containsValue = rangeSet.contains(5);

        // Print the result
        System.out.println(containsValue);

        // Use the map to retrieve a range set and check a value
        ImmutableRangeSet<Integer> retrievedRangeSet = rangeMap.get("firstRange");
        boolean anotherContainsValue = retrievedRangeSet.contains(25);
        System.out.println(anotherContainsValue);
    }
}