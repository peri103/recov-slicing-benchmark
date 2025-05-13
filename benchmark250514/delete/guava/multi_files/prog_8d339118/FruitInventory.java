import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class FruitInventory {
    private Multiset<String> multiset = HashMultiset.create();

    public void addFruit(String fruit) {
        /* write */ multiset.add(fruit);
    }

    public int getFruitCount(String fruit) {
        return multiset.count(fruit);
    }
}
