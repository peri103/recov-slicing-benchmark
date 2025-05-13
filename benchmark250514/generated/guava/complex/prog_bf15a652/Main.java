import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import com.google.common.collect.ImmutableRangeMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the RangeMap
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();

        // Add a range to the RangeMap
        /* write */ rangeMap.put(Range.closed(1, 10), "Hello");

        // Add additional ranges to make the program more complex
        rangeMap.put(Range.closed(11, 20), "World");
        rangeMap.put(Range.closed(21, 30), "Java");
        
        // Create an ImmutableRangeMap for demonstration
        ImmutableRangeMap<Integer, String> immutableRangeMap = ImmutableRangeMap.<Integer, String>builder()
                .put(Range.closed(31, 40), "Guava")
                .put(Range.closed(41, 50), "Library")
                .build();

        // Perform operations on the ImmutableRangeMap
        System.out.println("ImmutableRangeMap Value: " + immutableRangeMap.get(35));

        // Additional logic to manipulate data
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            if (rangeMap.get(i) != null) {
                sum += i;
            }
        }
        System.out.println("Sum of keys with non-null values in rangeMap: " + sum);

        // Read from the original RangeMap
        /* read */ String value = rangeMap.get(5);
        System.out.println("RangeMap Value: " + value);

        // More complex operations
        RangeMap<Integer, String> anotherRangeMap = TreeRangeMap.create();
        anotherRangeMap.put(Range.closed(51, 60), "Extended");
        anotherRangeMap.put(Range.closed(61, 70), "Complexity");

        for (int i = 51; i <= 70; i++) {
            System.out.println("AnotherRangeMap Value at " + i + ": " + anotherRangeMap.get(i));
        }
    }
}