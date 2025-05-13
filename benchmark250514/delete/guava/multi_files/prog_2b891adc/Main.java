import java.util.Map;

public class Main {
    public static void main(String[] args) {
        FruitInventory inventory = new FruitInventory();
        FruitMultiset multiset = new FruitMultiset();

        // Add fruits to inventory
        inventory.addFruit("banana", 5);
        inventory.addFruit("orange", 4);
        inventory.addFruit("apple", 10);
        inventory.addFruit("kiwi", 7);

        // Display inventory
        for (Map.Entry<String, Integer> entry : inventory.getInventory().entrySet()) {
            System.out.println("Fruit: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }

        // Add fruits to multiset
        multiset.addMultipleFruits("banana", 3);
        multiset.addMultipleFruits("orange", 2);
        
        // Calculate total inventory
        int totalInventory = inventory.getTotalInventory();
        System.out.println("Total inventory: " + totalInventory);

        // Remove a fruit from inventory
        inventory.removeFruit("banana");
        System.out.println("Updated inventory after removing 'banana': " + inventory.getInventory());

        // Add a single fruit to multiset
        multiset.addFruit("apple");

        // Calculate total fruits in multiset
        int totalFruits = multiset.getTotalFruits();
        System.out.println("Total fruits in multiset: " + totalFruits);

        // Get count of a specific fruit
        /* read */ int appleCount = multiset.getFruitCount("apple");
        System.out.println("Count of 'apple' in multiset: " + appleCount);
    }
}