import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableMultiset
        ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();
        
        // Add elements to the builder
        /* write */ builder.add("apple").add("banana").add("apple");
        
        // Create an ImmutableList
        ImmutableList<String> list = ImmutableList.of("orange", "grape", "apple");
        
        // Create an ImmutableMap
        ImmutableMap<String, Integer> map = ImmutableMap.of("apple", 2, "banana", 3, "orange", 1);
        
        // Perform some operations on the list and map
        int listSize = list.size();
        int mapSize = map.size();
        
        // Print sizes
        System.out.println("List size: " + listSize);
        System.out.println("Map size: " + mapSize);
        
        // Build the ImmutableMultiset
        ImmutableMultiset<String> multiset = builder.build();
        
        // Perform some operations on the multiset
        int bananaCount = multiset.count("banana");
        System.out.println("Banana count: " + bananaCount);
        
        // Read the count of a specific element
        /* read */ int appleCount = multiset.count("apple");
        
        // Print the count of 'apple'
        System.out.println("Apple count: " + appleCount);
        
        // Additional operations
        for (String fruit : list) {
            System.out.println("Fruit in list: " + fruit);
        }
        
        for (String key : map.keySet()) {
            System.out.println("Key in map: " + key + ", Value: " + map.get(key));
        }
    }
}