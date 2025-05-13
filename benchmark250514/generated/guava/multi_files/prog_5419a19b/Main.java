public class Main {
    public static void main(String[] args) {
        FruitInventory inventory = new FruitInventory();
        inventory.addFruits();

        FruitStore store = new FruitStore(inventory);
        store.calculateFruitCounts();

        /* read */ int appleCount = store.getFruitCount("apple");
        System.out.println("Count of apples: " + appleCount);

        store.printAllFruitCounts();
    }
}