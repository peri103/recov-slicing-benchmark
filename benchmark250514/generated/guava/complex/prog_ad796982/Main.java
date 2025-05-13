import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Initialize ImmutableRangeMap and add a range-value pair
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        /* write */ builder.put(Range.closed(1, 10), "Value1");
        
        // Create an ImmutableRangeMap from the builder
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        
        // Add more complex operations with other Guava collections
        ImmutableList<String> immutableList = ImmutableList.of("A", "B", "C", "D");
        ImmutableMap<Integer, String> immutableMap = ImmutableMap.of(1, "One", 2, "Two", 3, "Three");

        // Perform operations on immutableList
        for (String item : immutableList) {
            System.out.println("List item: " + item);
        }

        // Perform operations on immutableMap
        for (Integer key : immutableMap.keySet()) {
            System.out.println("Map key-value: " + key + " - " + immutableMap.get(key));
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 numbers: " + sum);

        // Retrieve a value from the rangeMap
        /* read */ String value = rangeMap.get(5);
        System.out.println("Retrieved value from rangeMap: " + value);

        // Further operations on rangeMap
        String valueOutOfRange = rangeMap.get(11);
        System.out.println("Value out of range: " + valueOutOfRange);

        // Additional loop for demonstration
        for (int i = 0; i < immutableList.size(); i++) {
            System.out.println("ImmutableList element at index " + i + ": " + immutableList.get(i));
        }
    }
}