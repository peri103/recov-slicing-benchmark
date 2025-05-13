import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a ReferenceMap instance
        AbstractReferenceMap<Integer, String> map = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.SOFT, AbstractReferenceMap.ReferenceStrength.SOFT);
        
        // Initialize a HashMap for additional complexity
        Map<Integer, String> hashMap = new HashMap<>();
        
        // Populate the HashMap with some values
        for (int i = 0; i < 5; i++) {
            hashMap.put(i, "Value " + i);
        }
        
        // Perform some operations on the HashMap
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("HashMap Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        /* write */ map.put(1, "Hello, World!");

        // Perform more operations on the HashMap
        hashMap.remove(2);
        System.out.println("After removal, HashMap size: " + hashMap.size());
        
        // Use a loop to manipulate the ReferenceMap
        for (int i = 2; i < 5; i++) {
            map.put(i, "ReferenceMap Value " + i);
        }

        // Perform operations on the ReferenceMap
        for (int i = 2; i < 5; i++) {
            System.out.println("ReferenceMap Key: " + i + ", Value: " + map.get(i));
        }

        /* read */ String value = map.get(1);

        System.out.println(value);
        
        // Further operations to increase complexity
        int sum = 0;
        for (int i = 0; i < hashMap.size(); i++) {
            sum += i;
        }
        System.out.println("Sum of keys in HashMap: " + sum);
    }
}