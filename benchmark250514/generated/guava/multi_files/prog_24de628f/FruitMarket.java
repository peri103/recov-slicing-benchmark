import com.google.common.collect.HashMultiset;

public class FruitMarket {
    private HashMultiset<String> marketInventory = HashMultiset.create();

    public void addFruitToMarket(String fruit, int quantity) {
        marketInventory.add(fruit, quantity);
    }

    public int getMarketFruitCount(String fruit) {
        return marketInventory.count(fruit);
    }
}
