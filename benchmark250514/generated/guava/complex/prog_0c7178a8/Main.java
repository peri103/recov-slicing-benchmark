import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;

public class Main {
    public static void main(String[] args) {
        // Original ImmutableRangeMap usage
        ImmutableRangeMap.Builder<Integer, String> builder = new ImmutableRangeMap.Builder<>();
        /* write */ builder.put(Range.closed(1, 10), "Value");
        
        // Additional RangeMap usage
        RangeMap<Integer, String> treeRangeMap = TreeRangeMap.create();
        treeRangeMap.put(Range.closed(11, 20), "Another Value");
        treeRangeMap.put(Range.closed(21, 30), "Yet Another Value");

        // Perform operations on the additional RangeMap
        String anotherValue = treeRangeMap.get(15);
        System.out.println("TreeRangeMap value at 15: " + anotherValue);

        String yetAnotherValue = treeRangeMap.get(25);
        System.out.println("TreeRangeMap value at 25: " + yetAnotherValue);

        // Build the original ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();

        // Perform unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // More complex logic
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
            if (i % 2 == 0) {
                System.out.println("Product till " + i + ": " + product);
            }
        }

        // Read from the original ImmutableRangeMap
        /* read */ String value = rangeMap.get(5);
        System.out.println("ImmutableRangeMap value at 5: " + value);
    }
}