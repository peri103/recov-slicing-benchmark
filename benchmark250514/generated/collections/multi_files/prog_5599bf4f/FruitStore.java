import java.util.HashMap;

public class FruitStore {
    private HashMap<String, Integer> inventory = new HashMap<>();
    private FruitBag fruitBag = new FruitBag();

    public void addFruitToInventory(String fruit, int quantity) {
        inventory.put(fruit, quantity);
    }

    public void addFruitToBag(String fruit) {
        fruitBag.addFruit(fruit);
    }

    public int checkFruitInBag(String fruit) {
        return fruitBag.getFruitCount(fruit);
    }

    public void displayInventory() {
        for (String fruit : inventory.keySet()) {
            System.out.println(fruit + " count in inventory: " + inventory.get(fruit));
        }
    }
}
