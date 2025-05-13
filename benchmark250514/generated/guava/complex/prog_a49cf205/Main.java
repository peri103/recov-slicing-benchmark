import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Write a value using the builder
        /* write */ builder.put("key1", 100);
        
        // Create an ImmutableMap using a builder
        ImmutableMap.Builder<String, String> mapBuilder = ImmutableMap.builder();
        mapBuilder.put("name", "Alice");
        mapBuilder.put("city", "Wonderland");
        ImmutableMap<String, String> map2 = mapBuilder.build();
        
        // Perform operations on the ImmutableMap
        String name = map2.get("name");
        String city = map2.get("city");
        System.out.println("Name: " + name + ", City: " + city);
        
        // Create an ImmutableList and perform operations
        ImmutableList.Builder<Integer> listBuilder = ImmutableList.builder();
        for (int i = 0; i < 5; i++) {
            listBuilder.add(i * 10);
        }
        ImmutableList<Integer> list = listBuilder.build();
        for (Integer value : list) {
            System.out.println("List value: " + value);
        }
        
        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Read the value using the get method
        /* read */ Integer value = map.get("key1");
        
        // Print the value
        System.out.println("Map value for 'key1': " + value);
        
        // Additional operations on the list
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        System.out.println("Sum of list values: " + sum);
    }
}