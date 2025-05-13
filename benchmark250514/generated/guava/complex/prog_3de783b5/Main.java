import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeSet
        ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();
        /* write */ builder.add(Range.closed(1, 10));

        // Create an ImmutableList with some values
        ImmutableList<Integer> immutableList = ImmutableList.of(15, 25, 35, 45);

        // Iterate over the ImmutableList and perform operations
        HashMap<Integer, String> valueMap = new HashMap<>();
        for (Integer value : immutableList) {
            valueMap.put(value, "Value: " + value);
        }

        // Display the values in the map
        for (Integer key : valueMap.keySet()) {
            System.out.println(valueMap.get(key));
        }

        // Build the ImmutableRangeSet
        ImmutableRangeSet<Integer> rangeSet = builder.build();

        // Use the contains method to check if a value is within the range
        /* read */ boolean containsValue = rangeSet.contains(5);
        System.out.println(containsValue);  // This should output true since 5 is within the range [1, 10]

        // Additional operations with the rangeSet
        boolean containsOutOfRangeValue = rangeSet.contains(20);
        System.out.println(containsOutOfRangeValue);  // This should output false since 20 is not within the range [1, 10]

        // Perform some arithmetic operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Create and manipulate another ImmutableRangeSet
        ImmutableRangeSet.Builder<Integer> anotherBuilder = ImmutableRangeSet.builder();
        anotherBuilder.add(Range.closed(20, 30));
        ImmutableRangeSet<Integer> anotherRangeSet = anotherBuilder.build();
        boolean containsAnotherRangeValue = anotherRangeSet.contains(25);
        System.out.println(containsAnotherRangeValue);  // This should output true since 25 is within the range [20, 30]
    }
}