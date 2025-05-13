import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMultiset
        ImmutableSortedMultiset.Builder<Integer> builder = ImmutableSortedMultiset.naturalOrder();
        
        // Add elements to the builder
        /* write */ builder.add(1).add(1).add(2);
        
        // Create a map to store some data
        HashMap<String, Integer> map = new HashMap<>();
        map.put("first", 10);
        map.put("second", 20);
        
        // Print all elements in the map
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        
        // Create an ImmutableList
        ImmutableList<String> immutableList = ImmutableList.of("apple", "banana", "cherry");
        
        // Print elements in the ImmutableList
        for (String fruit : immutableList) {
            System.out.println("Fruit: " + fruit);
        }
        
        // Build the ImmutableSortedMultiset
        ImmutableSortedMultiset<Integer> multiset = builder.build();
        
        // Read the count of an element
        /* read */ int countOfOne = multiset.count(1);
        
        // Print the count
        System.out.println("Count of 1: " + countOfOne);
        
        // Add more elements to the map
        map.put("third", 30);
        map.put("fourth", 40);
        
        // Print updated map
        for (String key : map.keySet()) {
            System.out.println("Updated Key: " + key + ", Value: " + map.get(key));
        }
    }
}