import com.google.common.collect.LinkedHashMultimap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LinkedHashMultimap<String, Integer> multimap = LinkedHashMultimap.create();
        Set<String> keySet = new HashSet<>();
        
        // Add keys to the set
        keySet.add("key");
        keySet.add("anotherKey");

        // Add values to the multimap
        multimap.put("anotherKey", 99);
        multimap.put("anotherKey", 100);
        
        // Iterate over keys
        for (String key : keySet) {
            if (key.equals("key")) {
                /* write */ multimap.put("key", 42);
            }
        }

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Iterate over the multimap values for "anotherKey"
        Iterator<Integer> iterator = multimap.get("anotherKey").iterator();
        while (iterator.hasNext()) {
            int val = iterator.next();
            System.out.println("Value for 'anotherKey': " + val);
        }
        
        // Read the value from the multimap for "key"
        /* read */ Integer value = multimap.get("key").iterator().next();
        System.out.println("Value for 'key': " + value);
        
        // More unrelated operations
        Set<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            numberSet.add(i * 5);
        }
        
        for (Integer num : numberSet) {
            System.out.println("Number in set: " + num);
        }
    }
}