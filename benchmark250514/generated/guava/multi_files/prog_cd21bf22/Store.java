import com.google.common.collect.HashMultiset;
import java.util.HashMap;

public class Store {
    private Inventory inventory;
    private HashMultiset<String> hashMultiset;
    private HashMap<String, Integer> priceMap;

    public Store() {
        inventory = new Inventory();
        hashMultiset = HashMultiset.create();
        priceMap = new HashMap<>();
    }

    public void addProduct(String product, int price) {
        hashMultiset.add(product);
        priceMap.put(product, price);
    }

    public void stockInventory(String item) {
        inventory.addItem(item);
    }

    public int getInventoryCount(String item) {
        return inventory.getItemCount(item);
    }

    public int getProductPrice(String product) {
        return priceMap.getOrDefault(product, 0);
    }
}
