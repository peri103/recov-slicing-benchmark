import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // ImmutableMultimap builder for the original write-read pair
        ImmutableMultimap.Builder<String, String> builder = ImmutableMultimap.builder();
        
        /* write */ builder.put("key", "value");
        
        // Unrelated code to make the program more complex
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        
        ImmutableList.Builder<Integer> listBuilder = ImmutableList.builder();
        for (int i = 0; i < 5; i++) {
            listBuilder.add(i * 10);
        }
        ImmutableList<Integer> immutableList = listBuilder.build();
        
        for (Integer num : immutableList) {
            System.out.println("Number: " + num);
        }
        
        // Build the ImmutableMultimap
        ImmutableMultimap<String, String> multimap = builder.build();
        
        // Another unrelated code block
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of map values: " + sum);
        
        /* read */ String value = multimap.get("key").iterator().next();
        
        System.out.println("Read from multimap: " + value);
        
        // Additional complexity with map operations
        map.put("three", 3);
        map.remove("one");
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}