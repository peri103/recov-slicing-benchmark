import java.util.HashMap;
import java.util.Map;

public class FruitCounter {
    private Map<String, Integer> counterMap = new HashMap<>();

    public void addFruit(String fruit, int count) {
        counterMap.put(fruit, counterMap.getOrDefault(fruit, 0) + count);
    }

    public int getTotalFruits() {
        int sum = 0;
        for (int count : counterMap.values()) {
            sum += count;
        }
        return sum;
    }

    public void printFruitCounts() {
        for (Map.Entry<String, Integer> entry : counterMap.entrySet()) {
            System.out.println("Fruit: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}
