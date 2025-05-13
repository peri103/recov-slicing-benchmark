import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMultiset
        ImmutableSortedMultiset.Builder<Integer> builder = ImmutableSortedMultiset.naturalOrder();
        
        /* write */ builder.add(1); // Add an element to the builder
        
        // Introducing a HashMap for additional complexity
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);
        
        // Perform operations on the map
        int valueFromMap = map.get("key1");
        System.out.println("Value from map: " + valueFromMap);
        
        // Introducing an ImmutableList for additional complexity
        ImmutableList<String> list = ImmutableList.of("A", "B", "C");
        for (String s : list) {
            System.out.println("List element: " + s);
        }
        
        // Build the ImmutableSortedMultiset
        ImmutableSortedMultiset<Integer> multiset = builder.build();
        
        // Perform operations on the multiset
        int sum = 0;
        for (Integer num : multiset) {
            sum += num;
        }
        System.out.println("Sum of elements in multiset: " + sum);
        
        /* read */ int count = multiset.count(1); // Read the count of the element
        
        System.out.println("Count of '1' in multiset: " + count); // Output the count
        
        // Additional operations to increase complexity
        for (int i = 0; i < 5; i++) {
            map.put("key" + (i + 3), i * 50);
        }
        
        for (String key : map.keySet()) {
            System.out.println("Map key: " + key + ", value: " + map.get(key));
        }
    }
}