import java.util.HashMap;
import java.util.Map;

public class FruitBasket {
    private Map<String, Integer> fruitBasket = new HashMap<>();

    public FruitBasket() {
        fruitBasket.put("banana", 2);
        fruitBasket.put("orange", 3);
    }

    public void addFruit(String fruit, int count) {
        fruitBasket.put(fruit, fruitBasket.getOrDefault(fruit, 0) + count);
    }

    public void displayBasket() {
        for (Map.Entry<String, Integer> entry : fruitBasket.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
