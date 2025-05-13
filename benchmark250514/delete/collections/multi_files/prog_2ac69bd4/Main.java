public class Main {
    public static void main(String[] args) {
        FruitBag fruitBag = new FruitBag();
        FruitInventory inventory = new FruitInventory();

        fruitBag.addFruit("apple");
        fruitBag.addFruit("banana");
        fruitBag.addFruit("orange");

        inventory.addToInventory("banana", 2);
        inventory.addToInventory("orange", 3);

        fruitBag.displayFruits();

        inventory.mergeWithBag(fruitBag);

        int totalFruits = inventory.getTotalFruits();
        System.out.println("Total fruits in inventory: " + totalFruits);

        /* read */ int appleCount = fruitBag.getFruitCount("apple");
        System.out.println("Count of apple in bag: " + appleCount);

        if (inventory.hasFruit("grape")) {
            System.out.println("Grape is in the inventory");
        } else {
            System.out.println("Grape is not in the inventory");
        }
    }
}