import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Add a range and corresponding value using the builder
        /* write */ builder.put(Range.closed(1, 10), "Value1");
        
        // Additional complex operations
        ImmutableList.Builder<String> listBuilder = ImmutableList.builder();
        listBuilder.add("Alpha");
        listBuilder.add("Beta");
        ImmutableList<String> immutableList = listBuilder.build();
        
        ImmutableMap.Builder<Integer, String> mapBuilder = ImmutableMap.builder();
        mapBuilder.put(1, "One");
        mapBuilder.put(2, "Two");
        ImmutableMap<Integer, String> immutableMap = mapBuilder.build();
        
        for (String str : immutableList) {
            System.out.println("List item: " + str);
        }
        
        String mapValue = immutableMap.get(1);
        System.out.println("Map value: " + mapValue);

        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 natural numbers: " + sum);

        // Retrieve the value for a specific key using the get method
        /* read */ String value = rangeMap.get(5);
        
        // Print the retrieved value
        System.out.println("RangeMap value: " + value);
        
        // More complex operations
        for (int i = 0; i < immutableList.size(); i++) {
            System.out.println("ImmutableList item at index " + i + ": " + immutableList.get(i));
        }
    }
}