import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a RangeSet using the specified range
        ImmutableRangeSet<Integer> rangeSet = /* write */ ImmutableRangeSet.of(Range.closed(1, 10));

        // Create an ImmutableList with some values
        ImmutableList<Integer> immutableList = ImmutableList.of(1, 2, 3, 4, 5);

        // Create an ImmutableMap with key-value pairs
        ImmutableMap<String, Integer> immutableMap = ImmutableMap.of("One", 1, "Two", 2, "Three", 3);

        // Perform operations on the ImmutableList
        for (int i = 0; i < immutableList.size(); i++) {
            System.out.println("ImmutableList element at index " + i + ": " + immutableList.get(i));
        }

        // Perform operations on the ImmutableMap
        for (String key : immutableMap.keySet()) {
            System.out.println("ImmutableMap key: " + key + ", value: " + immutableMap.get(key));
        }

        // Check if a specific value is contained within the range
        boolean containsValue = /* read */ rangeSet.contains(5);

        // Output the result
        System.out.println("RangeSet contains 5: " + containsValue);

        // Additional operations with RangeSet
        boolean containsValueOutsideRange = rangeSet.contains(15);
        System.out.println("RangeSet contains 15: " + containsValueOutsideRange);

        // Perform a calculation using elements from ImmutableList
        int sum = 0;
        for (Integer value : immutableList) {
            sum += value;
        }
        System.out.println("Sum of ImmutableList elements: " + sum);

        // Perform a transformation using ImmutableMap
        ImmutableMap<String, String> transformedMap = ImmutableMap.of(
            "One", "First",
            "Two", "Second",
            "Three", "Third"
        );

        for (String key : transformedMap.keySet()) {
            System.out.println("TransformedMap key: " + key + ", value: " + transformedMap.get(key));
        }
    }
}