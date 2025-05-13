import com.google.common.collect.SortedSetMultimap;
import com.google.common.collect.TreeMultimap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.util.SortedSet;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Initialize a SortedSetMultimap
        SortedSetMultimap<String, Integer> multimap = TreeMultimap.create();
        
        // Initialize another Multimap
        Multimap<String, String> stringMultimap = HashMultimap.create();
        stringMultimap.put("keyA", "valueA1");
        stringMultimap.put("keyA", "valueA2");
        stringMultimap.put("keyB", "valueB1");
        
        /* write */ multimap.put("key1", 100);
        
        // Perform some operations on the stringMultimap
        Collection<String> valuesA = stringMultimap.get("keyA");
        System.out.println("Values for keyA: " + valuesA);
        
        // Adding more elements to the multimap
        multimap.put("key2", 200);
        multimap.put("key1", 101);
        
        // Print all values for key2
        SortedSet<Integer> valuesKey2 = multimap.get("key2");
        System.out.println("Values for key2: " + valuesKey2);
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Access the original write-read pair
        /* read */ SortedSet<Integer> values = multimap.get("key1");
        System.out.println("Values for key1: " + values);
        
        // Additional operations on the original multimap
        for (Integer value : values) {
            System.out.println("Processing value: " + value);
        }
    }
}