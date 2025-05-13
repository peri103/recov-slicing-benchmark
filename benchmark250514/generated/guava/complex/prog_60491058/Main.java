import com.google.common.collect.HashMultimap;
import com.google.common.collect.SetMultimap;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SetMultimap<String, Integer> multimap = HashMultimap.create();
        
        /* write */ multimap.put("key", 42);
        
        Map<String, List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        map.put("numbers", list);

        for (String key : map.keySet()) {
            List<Integer> values = map.get(key);
            for (Integer value : values) {
                System.out.println("Map value: " + value);
            }
        }

        SetMultimap<String, String> stringMultimap = HashMultimap.create();
        stringMultimap.put("fruit", "apple");
        stringMultimap.put("fruit", "banana");
        
        Set<String> fruits = stringMultimap.get("fruit");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        /* read */ Set<Integer> values = multimap.get("key");
        
        for (Integer value : values) {
            System.out.println("Multimap value: " + value);
        }
    }
}