import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FruitStore {
    private FruitBag fruitBag = new FruitBag();
    private Map<String, Integer> fruitPrices = new HashMap<>();

    public FruitStore() {
        fruitPrices.put("apple", 100);
        fruitPrices.put("banana", 50);
        fruitPrices.put("orange", 80);
    }

    public void addFruit(String fruit) {
        fruitBag.addFruit(fruit);
    }

    public int calculateTotalPrice() {
        int totalPrice = 0;
        Set<String> fruits = fruitBag.getBag().uniqueSet();
        for (String fruit : fruits) {
            int count = fruitBag.getFruitCount(fruit);
            totalPrice += count * fruitPrices.get(fruit);
        }
        return totalPrice;
    }

    public int getAppleCount() {
        /* read */ return fruitBag.getFruitCount("apple");
    }
}
