import java.util.Map;

public class Main {
    public static void main(String[] args) {
        FruitBasket basket = new FruitBasket();
        basket.addFruit("apple", 3);
        basket.addFruit("banana", 2);
        basket.addFruit("orange", 5);

        int totalFruits = 0;
        for (String fruit : basket.getFruitSummary().keySet()) {
            totalFruits += basket.getFruitCount(fruit);
        }

        System.out.println("Total fruits in the basket: " + totalFruits);

        /* read */ int appleSingleCount = basket.getFruitCount("apple");
        System.out.println("Single apple count: " + appleSingleCount);

        System.out.println("Fruit summary:");
        for (Map.Entry<String, Integer> entry : basket.getFruitSummary().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}