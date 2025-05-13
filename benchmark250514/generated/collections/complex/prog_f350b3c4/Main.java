import org.apache.commons.collections4.map.LinkedMap;
import org.apache.commons.collections4.map.HashedMap;

public class Main {
    public static void main(String[] args) {
        LinkedMap<String, Integer> linkedMap = new LinkedMap<>();
        HashedMap<String, String> hashedMap = new HashedMap<>();
        
        // Adding some entries to the hashedMap
        hashedMap.put("a", "apple");
        hashedMap.put("b", "banana");
        
        // Print all entries in hashedMap
        for (String key : hashedMap.keySet()) {
            System.out.println("HashedMap: " + key + " -> " + hashedMap.get(key));
        }
        
        /* write */ linkedMap.put("key", 42);
        
        // Perform some operations on linkedMap
        linkedMap.put("anotherKey", 100);
        linkedMap.put("yetAnotherKey", 200);
        
        // Print all entries in linkedMap
        for (String key : linkedMap.keySet()) {
            System.out.println("LinkedMap: " + key + " -> " + linkedMap.get(key));
        }
        
        // Remove an entry from linkedMap
        linkedMap.remove("anotherKey");
        
        // Print all entries after removal
        for (String key : linkedMap.keySet()) {
            System.out.println("LinkedMap after removal: " + key + " -> " + linkedMap.get(key));
        }
        
        /* read */ int value = linkedMap.get("key");
        System.out.println("Read value: " + value);
        
        // More complex operations
        for (int i = 0; i < 5; i++) {
            linkedMap.put("key" + i, i * 10);
        }
        
        // Print all entries after adding more
        for (String key : linkedMap.keySet()) {
            System.out.println("LinkedMap after adding more: " + key + " -> " + linkedMap.get(key));
        }
    }
}