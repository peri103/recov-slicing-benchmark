import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Define a range and associate it with a value
        builder.put(Range.closed(1, 10), "Value1");
        
        // Create another range and associate it with a value
        builder.put(Range.closed(11, 20), "Value2");
        
        // Build the ImmutableRangeMap
        /* write */ ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        
        // Create a HashMap for additional data processing
        HashMap<Integer, String> dataMap = new HashMap<>();
        dataMap.put(1, "One");
        dataMap.put(2, "Two");
        dataMap.put(3, "Three");
        
        // Process the dataMap
        for (Integer key : dataMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + dataMap.get(key));
        }
        
        // Create an ImmutableList for storing elements
        ImmutableList<Integer> numberList = ImmutableList.of(1, 2, 3, 4, 5);
        
        // Loop through the ImmutableList and print elements
        for (int number : numberList) {
            System.out.println("ImmutableList Element: " + number);
        }
        
        // Read the value associated with a specific key in the rangeMap
        /* read */ String value = rangeMap.get(5);
        
        // Output the value
        System.out.println("RangeMap Value: " + value);
        
        // Perform additional operations with the rangeMap
        String value2 = rangeMap.get(15);
        System.out.println("RangeMap Value2: " + value2);
    }
}