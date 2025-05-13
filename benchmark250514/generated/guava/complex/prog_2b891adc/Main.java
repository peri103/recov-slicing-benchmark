import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Multiset<String> multiset = LinkedHashMultiset.create();
        Map<String, Integer> fruitInventory = new HashMap<>();
        
        // Adding multiple items to the multiset
        multiset.add("banana", 3);
        multiset.add("orange", 2);
        
        // Adding items to the inventory map
        fruitInventory.put("banana", 5);
        fruitInventory.put("orange", 4);
        
        // Performing operations on the inventory map
        for (Map.Entry<String, Integer> entry : fruitInventory.entrySet()) {
            System.out.println("Fruit: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
        
        // A complex operation using the multiset
        int totalFruits = 0;
        for (String fruit : multiset.elementSet()) {
            totalFruits += multiset.count(fruit);
        }
        System.out.println("Total fruits in multiset: " + totalFruits);
        
        /* write */ multiset.add("apple");
        
        // More operations with the inventory map
        fruitInventory.put("apple", 10);
        fruitInventory.put("kiwi", 7);
        
        // Calculating the total quantity of fruits in the inventory
        int totalInventory = 0;
        for (int quantity : fruitInventory.values()) {
            totalInventory += quantity;
        }
        System.out.println("Total inventory: " + totalInventory);
        
        /* read */ int count = multiset.count("apple");
        System.out.println("Count of 'apple' in multiset: " + count);
        
        // Further operations
        fruitInventory.remove("banana");
        System.out.println("Updated inventory after removing 'banana': " + fruitInventory);
    }
}