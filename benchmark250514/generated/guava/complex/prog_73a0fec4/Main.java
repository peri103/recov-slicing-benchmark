import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        /* write */ builder.put("key1", 100);
        
        // Create and fill a HashMap
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Alpha");
        hashMap.put("B", "Beta");
        hashMap.put("C", "Gamma");
        
        // Create an ImmutableList from the keys of the HashMap
        ImmutableList<String> keysList = ImmutableList.copyOf(hashMap.keySet());

        // Iterate over the ImmutableList and print values from HashMap
        for (String key : keysList) {
            System.out.println("HashMap value for key " + key + ": " + hashMap.get(key));
        }

        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();

        // Perform some operations on the map
        System.out.println("Map size: " + map.size());
        System.out.println("Contains 'key1': " + map.containsKey("key1"));
        
        /* read */ Integer value = map.get("key1");
        
        System.out.println("Value for 'key1': " + value);

        // Additional operations with ImmutableSortedMap
        ImmutableSortedMap<String, Integer> sortedMap = ImmutableSortedMap.copyOf(map);
        System.out.println("SortedMap size: " + sortedMap.size());

        // Print all entries in the sorted map
        for (String key : sortedMap.keySet()) {
            System.out.println("SortedMap value for key " + key + ": " + sortedMap.get(key));
        }
    }
}