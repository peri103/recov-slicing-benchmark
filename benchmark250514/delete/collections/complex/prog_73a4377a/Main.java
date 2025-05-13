import org.apache.commons.collections4.map.AbstractBidiMapDecorator;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import org.apache.commons.collections4.map.HashedMap;

public class Main {
    public static void main(String[] args) {
        AbstractBidiMapDecorator<String, Integer> bidiMap = new AbstractBidiMapDecorator<>(new DualHashBidiMap<>());
        HashedMap<String, String> hashedMap = new HashedMap<>();
        
        // Writing to bidiMap
        /* write */ bidiMap.put("key", 42);
        
        // Additional operations
        hashedMap.put("name", "Alice");
        hashedMap.put("city", "Wonderland");
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        
        String name = hashedMap.get("name");
        System.out.println("Name: " + name);
        
        // More operations
        for (String key : hashedMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashedMap.get(key));
        }
        
        // Reading from bidiMap
        /* read */ int value = bidiMap.get("key");
        System.out.println("Value from bidiMap: " + value);
        
        if (sum > 20) {
            System.out.println("Sum is greater than 20.");
        } else {
            System.out.println("Sum is less than or equal to 20.");
        }
        
        hashedMap.put("country", "Dreamland");
        System.out.println("Country: " + hashedMap.get("country"));
    }
}