import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ArrayListMultimap;

public class Main {
    public static void main(String[] args) {
        Multimap<String, String> multimap = HashMultimap.create();
        Multimap<String, String> anotherMultimap = ArrayListMultimap.create();
        
        anotherMultimap.put("anotherKey", "anotherValue");
        anotherMultimap.put("anotherKey", "anotherValue2");
        
        /* write */ multimap.put("key", "value");
        
        for (String key : anotherMultimap.keySet()) {
            System.out.println("Values for " + key + ":");
            for (String val : anotherMultimap.get(key)) {
                System.out.println(val);
            }
        }
        
        multimap.put("key", "value2");
        
        int count = 0;
        for (String key : multimap.keySet()) {
            for (String val : multimap.get(key)) {
                count++;
            }
        }
        System.out.println("Total entries in multimap: " + count);
        
        /* read */ String value = multimap.get("key").iterator().next();
        System.out.println("First value for 'key': " + value);
        
        for (String val : multimap.get("key")) {
            System.out.println("Iterating value for 'key': " + val);
        }
        
        System.out.println("Program completed.");
    }
}