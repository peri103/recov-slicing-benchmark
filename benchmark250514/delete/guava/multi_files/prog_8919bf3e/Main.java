public class Main {
    public static void main(String[] args) {
        FruitStore store = new FruitStore();
        
        store.stockFruit("banana", 2);
        store.stockFruit("orange", 1);
        store.stockFruit("apple", 1);

        Map<String, Integer> inventory = store.getInventory();
        
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println("Fruit: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        // Get count of apples
        FruitInventory appleInventory = new FruitInventory();
        /* read */ int appleCount = appleInventory.getFruitCount("apple");
        System.out.println("Apple count: " + appleCount);
    }
}