import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original ImmutableRangeMap write-read pair
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        /* write */ builder.put(Range.closed(1, 10), "Hello");
        
        // Creating another ImmutableRangeMap for demonstration
        ImmutableRangeMap.Builder<Integer, String> builder2 = ImmutableRangeMap.builder();
        builder2.put(Range.closed(11, 20), "World");
        ImmutableRangeMap<Integer, String> rangeMap2 = builder2.build();
        
        // Unrelated operation using HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("Key1", 100);
        map.put("Key2", 200);
        
        // ImmutableList demonstration
        ImmutableList<String> immutableList = ImmutableList.of("A", "B", "C");
        for (String s : immutableList) {
            System.out.println(s);
        }
        
        // Performing operations on HashMap
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of values in map: " + sum);
        
        // Building the original ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        
        // More unrelated code for complexity
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);
        
        // Reading from the original ImmutableRangeMap
        /* read */ String value = rangeMap.get(5);
        System.out.println(value);
    }
}