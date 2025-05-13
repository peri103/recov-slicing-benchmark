import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.HashMultimap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LinkedHashMultimap<String, String> multimap = LinkedHashMultimap.create();
        HashMultimap<String, Integer> anotherMultimap = HashMultimap.create();
        Set<String> keySet = new HashSet<>();
        
        keySet.add("key1");
        keySet.add("key2");
        
        anotherMultimap.put("key1", 100);
        anotherMultimap.put("key1", 200);
        anotherMultimap.put("key2", 300);
        
        /* write */ multimap.put("key", "value");
        
        for (String key : keySet) {
            Set<Integer> values = anotherMultimap.get(key);
            for (Integer value : values) {
                System.out.println("Key: " + key + ", Value: " + value);
            }
        }
        
        multimap.put("anotherKey", "anotherValue");
        multimap.put("anotherKey", "yetAnotherValue");
        
        /* read */ java.util.Set<String> values = multimap.get("key");
        for (String value : values) {
            System.out.println(value);
        }

        java.util.Set<String> anotherValues = multimap.get("anotherKey");
        for (String value : anotherValues) {
            System.out.println("Another Key Value: " + value);
        }
    }
}