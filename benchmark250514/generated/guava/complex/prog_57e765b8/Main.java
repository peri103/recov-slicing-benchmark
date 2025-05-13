import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import com.google.common.collect.Range;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        Map<Integer, String> regularMap = new HashMap<>();
        
        // Populate regularMap with some values
        regularMap.put(1, "One");
        regularMap.put(2, "Two");
        regularMap.put(3, "Three");

        // Use a loop to iterate over regularMap
        for (Map.Entry<Integer, String> entry : regularMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Add a new range to rangeMap
        rangeMap.put(Range.closed(20, 30), "B");
        
        // Perform some calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10 is: " + sum);
        
        /* write */ rangeMap.put(Range.closed(1, 10), "A");
        
        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5 is: " + product);
        
        // Retrieve a value from rangeMap
        /* read */ String value = rangeMap.get(5);
        System.out.println(value);
        
        // Further operations on regularMap
        regularMap.put(4, "Four");
        regularMap.put(5, "Five");
        
        for (Map.Entry<Integer, String> entry : regularMap.entrySet()) {
            System.out.println("Updated Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}