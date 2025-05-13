import java.util.ArrayList;
import java.util.HashMap;

public class FruitInventory {
    private ArrayList<String> fruitsList;
    private HashMap<String, Integer> fruitCount;

    public FruitInventory() {
        fruitsList = new ArrayList<>();
        fruitCount = new HashMap<>();
        initializeFruits();
    }

    private void initializeFruits() {
        fruitsList.add("apple");
        fruitsList.add("banana");
        fruitsList.add("orange");
        fruitsList.add("grape");
        fruitsList.add("kiwi");

        for (String fruit : fruitsList) {
            fruitCount.put(fruit, fruitCount.getOrDefault(fruit, 0) + 1);
        }
    }

    public void printFruitCount() {
        System.out.println("Fruit count:");
        for (String key : fruitCount.keySet()) {
            System.out.println(key + ": " + fruitCount.get(key));
        }
    }

    public void updateFruits() {
        fruitsList.remove("kiwi");
        fruitsList.add("mango");
    }

    public void printFruitsList() {
        System.out.println("Updated fruits list:");
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }
    }
}
