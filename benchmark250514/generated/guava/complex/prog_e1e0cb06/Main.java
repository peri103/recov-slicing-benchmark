import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedMultiset.Builder;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Builder<String> builder = ImmutableSortedMultiset.naturalOrder();
        ImmutableList.Builder<String> listBuilder = ImmutableList.builder();
        
        // Adding elements to the ImmutableList
        listBuilder.add("element1");
        listBuilder.add("element2");
        
        // Creating the ImmutableList
        ImmutableList<String> immutableList = listBuilder.build();
        
        // Using a HashMap to store data
        HashMap<String, Integer> map = new HashMap<>();
        map.put("key1", 100);
        map.put("key2", 200);
        
        // Processing elements in the ImmutableList
        for (String element : immutableList) {
            System.out.println("Processing: " + element);
            builder.add(element);
        }
        
        // Using the HashMap
        int valueFromMap = map.get("key1");
        System.out.println("Value from map: " + valueFromMap);
        
        /* write */ builder.add("example");
        
        // More operations with HashMap
        map.put("key3", 300);
        for (String key : map.keySet()) {
            System.out.println("Map key: " + key + ", value: " + map.get(key));
        }
        
        // Building the ImmutableSortedMultiset
        ImmutableSortedMultiset<String> multiset = builder.build();
        
        // Performing operations with the multiset
        int totalElements = multiset.size();
        System.out.println("Total elements in multiset: " + totalElements);
        
        /* read */ int count = multiset.count("example");
        System.out.println("Count of 'example': " + count);
        
        // Final operations
        for (String element : multiset.elementSet()) {
            System.out.println("Element in multiset: " + element);
        }
    }
}