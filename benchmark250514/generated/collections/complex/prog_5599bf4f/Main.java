import org.apache.commons.collections4.bag.HashBag;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashBag<String> bag = new HashBag<>();
        HashBag<String> anotherBag = new HashBag<>();
        Map<String, Integer> itemMap = new HashMap<>();
        
        // Adding items to anotherBag
        anotherBag.add("banana");
        anotherBag.add("orange");
        
        // Adding items to the itemMap
        itemMap.put("apple", 10);
        itemMap.put("banana", 5);
        
        // Performing operations on itemMap
        int appleCount = itemMap.get("apple");
        int bananaCount = itemMap.get("banana");
        
        // Adding items to the main bag
        /* write */ bag.add("apple");
        
        // Performing operations on anotherBag
        anotherBag.add("apple");
        int anotherBagAppleCount = anotherBag.getCount("apple");
        
        // Performing operations on itemMap
        for (Map.Entry<String, Integer> entry : itemMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Reading the count from the main bag
        /* read */ int count = bag.getCount("apple");
        System.out.println(count);
        
        // Further operations
        anotherBag.add("grape");
        int grapeCount = anotherBag.getCount("grape");
        System.out.println("Grape count in anotherBag: " + grapeCount);
        
        // Operations on the main bag
        bag.add("banana");
        int bananaBagCount = bag.getCount("banana");
        System.out.println("Banana count in main bag: " + bananaBagCount);
    }
}