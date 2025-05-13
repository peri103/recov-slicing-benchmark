import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        // Adding ranges to the RangeSet
        rangeSet.add(Range.closed(1, 10));
        rangeSet.add(Range.closed(20, 30));
        
        // Adding elements to the ArrayList
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        // Adding key-value pairs to the HashMap
        map.put("first", 1);
        map.put("second", 2);
        map.put("third", 3);
        
        // Performing some operations on ArrayList
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Performing operations on HashMap
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Original write operation
        /* write */ rangeSet.add(Range.closed(15, 25));
        
        // More operations
        boolean containsInNumbers = numbers.contains(4);
        System.out.println("Numbers contain 4: " + containsInNumbers);
        
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        System.out.println("Product of numbers: " + product);
        
        // Original read operation
        /* read */ boolean containsValue = rangeSet.contains(5);
        System.out.println(containsValue); // Expected output: true
        
        // Additional read operations
        boolean containsValueInRangeSet = rangeSet.contains(22);
        System.out.println("RangeSet contains 22: " + containsValueInRangeSet);
    }
}