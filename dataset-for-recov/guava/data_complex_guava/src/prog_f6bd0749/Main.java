import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableListMultimap.Builder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Builder<String, Integer> builder = ImmutableListMultimap.builder();
        /* write */ builder.put("key1", 42);
        ImmutableListMultimap<String, Integer> multimap = builder.build();
        
        // Unrelated code to increase complexity
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < stringList.size(); i++) {
            map.put(stringList.get(i), i);
        }
        
        // More unrelated processing
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " has index " + entry.getValue());
        }

        /* read */ Integer value = multimap.get("key1").iterator().next();
        System.out.println("Value from multimap: " + value);
        
        // Additional unrelated code
        ArrayList<Integer> additionalList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            additionalList.add(i * 10);
        }
        
        for (Integer num : additionalList) {
            System.out.println("Number: " + num);
        }
    }
}