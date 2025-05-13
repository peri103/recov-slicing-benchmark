import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Use the builder to add a range and associate it with a value
        /* write */ builder.put(Range.closed(1, 10), "Value1");
        
        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        
        // Create a TreeRangeMap for additional complexity
        RangeMap<Integer, String> treeRangeMap = TreeRangeMap.create();
        treeRangeMap.put(Range.closed(20, 30), "Value2");
        treeRangeMap.put(Range.closed(31, 40), "Value3");

        // Perform some operations on the TreeRangeMap
        String treeValue1 = treeRangeMap.get(25);
        String treeValue2 = treeRangeMap.get(35);

        // Print values from TreeRangeMap
        System.out.println("TreeRangeMap value at 25: " + treeValue1);
        System.out.println("TreeRangeMap value at 35: " + treeValue2);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 integers: " + sum);

        // Use the get method to retrieve the value associated with a specific key
        /* read */ String value = rangeMap.get(5);
        
        // Print the retrieved value
        System.out.println("ImmutableRangeMap value at 5: " + value);

        // Further unrelated operations
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of first 3 integers: " + product);
    }
}