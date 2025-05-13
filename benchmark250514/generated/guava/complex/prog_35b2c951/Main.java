import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();

        // Define a range and associate a value with it
        Range<Integer> range = Range.closed(1, 10);
        /* write */ builder.put(range, "Hello, Range!");

        // Additional unrelated operations
        ImmutableMap.Builder<Integer, String> mapBuilder = ImmutableMap.builder();
        mapBuilder.put(1, "One");
        mapBuilder.put(2, "Two");
        ImmutableMap<Integer, String> map = mapBuilder.build();

        // Perform some operations on the ImmutableMap
        String mapValue = map.get(1);
        System.out.println("Value from ImmutableMap: " + mapValue);

        // More unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("Current sum: " + sum);
        }

        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();

        // Complex logic before reading the value
        int keyToCheck = 5;
        if (keyToCheck >= 1 && keyToCheck <= 10) {
            System.out.println("The key is within the range.");
        } else {
            System.out.println("The key is outside the range.");
        }

        // Retrieve the value associated with a specific key within the range
        /* read */ String value = rangeMap.get(5);

        // Print the value
        System.out.println("Value from ImmutableRangeMap: " + value);

        // Additional logic after reading
        for (int i = 0; i < 3; i++) {
            System.out.println("Loop iteration: " + i);
        }
    }
}