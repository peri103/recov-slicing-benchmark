import com.google.common.collect.TreeMultimap;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TreeMultimap<String, Integer> multimap = TreeMultimap.create();
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        
        /* write */ multimap.put("key1", 10);
        
        // Additional unrelated code to increase complexity
        map.put("one", 1);
        map.put("two", 2);
        list.add("item1");
        list.add("item2");
        
        for (String item : list) {
            System.out.println("List item: " + item);
        }
        
        // More operations on the map
        for (String key : map.keySet()) {
            System.out.println("Map key: " + key + ", value: " + map.get(key));
        }
        
        /* read */ Collection<Integer> values = multimap.get("key1");
        for (Integer value : values) {
            System.out.println(value);
        }
        
        // Further operations to enhance complexity
        for (int i = 0; i < 5; i++) {
            multimap.put("key" + i, i * 10);
        }
        
        // Displaying the contents of the multimap
        for (String key : multimap.asMap().keySet()) {
            System.out.println("Key: " + key + ", Values: " + multimap.get(key));
        }
    }
}