import com.google.common.collect.Range;
import com.google.common.collect.TreeRangeMap;
import com.google.common.collect.RangeMap;

public class Main {
    public static void main(String[] args) {
        TreeRangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        RangeMap<Integer, String> anotherRangeMap = TreeRangeMap.create();
        
        // Initializing another RangeMap with different ranges
        anotherRangeMap.put(Range.closed(20, 30), "Value2");
        anotherRangeMap.put(Range.closed(31, 40), "Value3");
        
        // Performing operations on anotherRangeMap
        String anotherValue = anotherRangeMap.get(25);
        System.out.println("Another Value: " + anotherValue);
        
        /* write */ rangeMap.put(Range.closed(1, 10), "Value1");
        
        // Adding more ranges to rangeMap
        rangeMap.put(Range.closed(11, 15), "Value4");
        rangeMap.put(Range.closed(16, 20), "Value5");
        
        // Iterating over rangeMap to display values
        for (int i = 1; i <= 20; i++) {
            String valueAtIndex = rangeMap.get(i);
            if (valueAtIndex != null) {
                System.out.println("Value at " + i + ": " + valueAtIndex);
            }
        }
        
        /* read */ String value = rangeMap.get(5);
        
        System.out.println("Read Value: " + value);
        
        // Performing some computations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
    }
}