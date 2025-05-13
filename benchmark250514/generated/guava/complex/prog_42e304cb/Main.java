import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ArrayListMultimap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create an instance of a Multimap using ArrayListMultimap
        Multimap<String, Integer> multimap = ArrayListMultimap.create();

        // Wrap it with ForwardingMultimap to simulate the use of ForwardingMultimap
        ForwardingMultimap<String, Integer> forwardingMultimap = new ForwardingMultimap<String, Integer>() {
            @Override
            protected Multimap<String, Integer> delegate() {
                return multimap;
            }
        };

        // Use a HashMap for additional complexity
        Map<String, String> map = new HashMap<>();
        map.put("name", "Alice");
        map.put("city", "Wonderland");

        // Perform some operations on the map
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Another Multimap usage
        Multimap<String, String> stringMultimap = ArrayListMultimap.create();
        stringMultimap.put("category", "Books");
        stringMultimap.put("category", "Movies");
        stringMultimap.put("category", "Music");

        // Iterate over entries in stringMultimap
        for (Map.Entry<String, String> entry : stringMultimap.entries()) {
            System.out.println("Category: " + entry.getValue());
        }

        /* write */ forwardingMultimap.put("key", 42);

        // More operations on the map
        if (map.containsKey("name")) {
            System.out.println("Name found: " + map.get("name"));
        }

        // Additional logic to iterate over the multimap
        for (String category : stringMultimap.get("category")) {
            System.out.println("Exploring category: " + category);
        }

        /* read */ Integer value = forwardingMultimap.get("key").iterator().next();

        System.out.println(value);

        // Further operations to increase complexity
        map.put("country", "Fictionland");
        for (String key : map.keySet()) {
            System.out.println("Updated Key: " + key + ", Value: " + map.get(key));
        }
    }
}