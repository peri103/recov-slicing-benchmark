import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a ReferenceMap instance
        AbstractReferenceMap<Integer, String> map = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.SOFT, AbstractReferenceMap.ReferenceStrength.SOFT);
        
        // Write operation: put a value into the map
        /* write */ map.put(1, "Hello, World!");
        
        // Initialize a HashMap for additional complexity
        HashMap<Integer, String> hashMap = new HashMap<>();
        
        // Add some values to the HashMap
        hashMap.put(2, "Goodbye, World!");
        hashMap.put(3, "Hello again!");
        
        // Perform operations on the HashMap
        for (int i = 2; i <= 3; i++) {
            System.out.println("HashMap Value: " + hashMap.get(i));
        }
        
        // Manipulate the ReferenceMap further
        map.put(4, "New Entry");
        map.put(5, "Another Entry");
        
        // Read operation: get the value from the map
        /* read */ String value = map.get(1);
        
        // Output the read value
        System.out.println(value);
        
        // Additional manipulation of ReferenceMap
        map.put(6, "Final Entry");
        
        // Iterate and print all entries in the ReferenceMap
        for (Integer key : map.keySet()) {
            System.out.println("ReferenceMap Key: " + key + ", Value: " + map.get(key));
        }
    }
}