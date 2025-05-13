import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Add a range to the builder
        /* write */ builder.put(Range.closed(1, 10), "Value in range 1 to 10");
        
        // Create a simple HashMap and populate it
        HashMap<Integer, String> simpleMap = new HashMap<>();
        simpleMap.put(1, "One");
        simpleMap.put(2, "Two");
        simpleMap.put(3, "Three");
        
        // Perform operations on the HashMap
        for (int i = 1; i <= 3; i++) {
            String value = simpleMap.get(i);
            System.out.println("HashMap value for " + i + ": " + value);
        }
        
        // Create another ImmutableMap and perform operations
        ImmutableMap<String, Integer> immutableMap = ImmutableMap.of("A", 1, "B", 2, "C", 3);
        for (String key : immutableMap.keySet()) {
            System.out.println("ImmutableMap key: " + key + ", value: " + immutableMap.get(key));
        }

        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        
        // Create an ArrayList and populate it
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        
        // Perform operations on the ArrayList
        for (String fruit : arrayList) {
            System.out.println("ArrayList fruit: " + fruit);
        }
        
        // Read a value from the ImmutableRangeMap
        /* read */ String rangeValue = rangeMap.get(5);
        
        // Print the value
        System.out.println("RangeMap value for 5: " + rangeValue);
    }
}