import com.google.common.collect.Range;
import com.google.common.collect.TreeRangeMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TreeRangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        HashMap<Integer, String> hashMap = new HashMap<>();
        
        // Initialize some values in the HashMap
        for (int i = 0; i < 5; i++) {
            hashMap.put(i, "Value" + i);
        }

        // Add more entries to the TreeRangeMap
        rangeMap.put(Range.closed(11, 20), "B");
        rangeMap.put(Range.closed(21, 30), "C");
        
        /* write */ rangeMap.put(Range.closed(1, 10), "A");

        // Perform operations on HashMap
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("HashMap Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Access the TreeRangeMap
        String rangeBValue = rangeMap.get(15);
        System.out.println("Value from TreeRangeMap for key 15: " + rangeBValue);

        // Further operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        /* read */ String value = rangeMap.get(5);
        
        System.out.println(value);
        
        // Display all entries in TreeRangeMap
        for (int i = 1; i <= 30; i++) {
            String val = rangeMap.get(i);
            if (val != null) {
                System.out.println("RangeMap Key: " + i + ", Value: " + val);
            }
        }
    }
}