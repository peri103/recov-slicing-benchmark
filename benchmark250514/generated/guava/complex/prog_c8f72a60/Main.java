import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;

public class Main {
    public static void main(String[] args) {
        // Original ImmutableRangeMap write-read pair
        ImmutableRangeMap.Builder<Integer, String> builder = new ImmutableRangeMap.Builder<>();
        
        /* write */ builder.put(Range.closed(1, 10), "Value1");
        
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();

        // Additional complex operations using TreeRangeMap
        RangeMap<Integer, String> treeRangeMap = TreeRangeMap.create();
        treeRangeMap.put(Range.closedOpen(10, 20), "Value2");
        treeRangeMap.put(Range.closedOpen(20, 30), "Value3");

        // Performing some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 natural numbers: " + sum);

        // More operations using TreeRangeMap
        String treeValue = treeRangeMap.get(15);
        System.out.println("TreeRangeMap value for key 15: " + treeValue);

        // Final read operation from ImmutableRangeMap
        /* read */ String value = rangeMap.get(5);
        
        System.out.println("ImmutableRangeMap value for key 5: " + value);

        // Additional unrelated operations
        for (int i = 30; i < 35; i++) {
            treeRangeMap.put(Range.singleton(i), "ExtraValue" + i);
        }

        for (int i = 30; i < 35; i++) {
            System.out.println("TreeRangeMap value for key " + i + ": " + treeRangeMap.get(i));
        }
    }
}