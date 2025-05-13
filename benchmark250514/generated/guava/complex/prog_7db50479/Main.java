import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Add a range and its associated value using the builder
        /* write */ builder.put(Range.closed(1, 10), "Value in range");

        // Additional complex operations with ImmutableMap and ImmutableList
        ImmutableMap<String, Integer> map = ImmutableMap.of("One", 1, "Two", 2, "Three", 3);
        ImmutableList<String> list = ImmutableList.of("Alpha", "Beta", "Gamma");

        // Perform some operations using map and list
        Integer mapValue = map.get("Two");
        System.out.println("Map value: " + mapValue);

        for (String item : list) {
            System.out.println("List item: " + item);
        }

        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();

        // Perform more operations with map and list
        Integer mapValue2 = map.get("Three");
        System.out.println("Another map value: " + mapValue2);

        for (String item : list) {
            System.out.println("Another list item: " + item);
        }

        // Retrieve a value using the get method of ImmutableRangeMap
        /* read */ String value = rangeMap.get(5);

        // Print the retrieved value
        System.out.println("RangeMap value: " + value);
    }
}