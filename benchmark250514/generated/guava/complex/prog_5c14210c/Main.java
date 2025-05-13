import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import com.google.common.collect.ImmutableRangeMap;

public class Main {
    public static void main(String[] args) {
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        RangeMap<Integer, String> immutableRangeMap = ImmutableRangeMap.<Integer, String>builder()
                .put(Range.closed(20, 30), "Value2")
                .put(Range.closed(31, 40), "Value3")
                .build();
        
        /* write */ rangeMap.put(Range.closed(1, 10), "Value1");
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum from 1 to 10: " + sum);

        // Access the immutable range map
        String immutableValue = immutableRangeMap.get(25);
        System.out.println("Immutable RangeMap value for 25: " + immutableValue);

        // Perform some calculations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product from 1 to 5: " + product);

        // More unrelated code
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);

        // Access the original range map
        /* read */ String value = rangeMap.get(5);
        System.out.println(value);
        
        // Additional operations
        RangeMap<Integer, String> anotherRangeMap = TreeRangeMap.create();
        anotherRangeMap.put(Range.closed(50, 60), "Value4");
        String anotherValue = anotherRangeMap.get(55);
        System.out.println("Another RangeMap value for 55: " + anotherValue);
    }
}