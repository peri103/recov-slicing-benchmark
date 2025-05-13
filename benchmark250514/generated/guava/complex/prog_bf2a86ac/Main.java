import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Define a range and associated value
        Range<Integer> range = Range.closed(1, 10);
        String value = "ValueInRange";
        
        // Add the range and value to the builder
        /* write */ builder.put(range, value);

        // Create a HashMap to store additional data
        HashMap<Integer, String> map = new HashMap<>();
        map.put(20, "Twenty");
        map.put(30, "Thirty");

        // Create an ArrayList and perform some operations
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 2);
        }

        // Manipulate the list
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 1);
        }

        // Output some values from the HashMap
        System.out.println("Value for key 20: " + map.get(20));
        System.out.println("Value for key 30: " + map.get(30));

        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();

        // Perform some additional operations
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of list elements: " + sum);

        // Read the value associated with a specific key within the range
        /* read */ String readValue = rangeMap.get(5);
        
        // Print the value
        System.out.println(readValue);

        // More complex logic
        if (list.contains(5)) {
            System.out.println("List contains 5");
        } else {
            System.out.println("List does not contain 5");
        }

        // Final manipulation of map and list
        map.put(40, "Forty");
        list.add(10);
        System.out.println("Final map size: " + map.size());
        System.out.println("Final list size: " + list.size());
    }
}