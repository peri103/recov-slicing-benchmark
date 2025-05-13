import com.google.common.collect.LinkedHashMultiset;

public class FruitInventory {
    private LinkedHashMultiset<String> multiset = LinkedHashMultiset.create();

    public void addFruit(String fruit) {
        /* write */ multiset.add(fruit);
    }

    public int getFruitCount(String fruit) {
        return multiset.count(fruit);
    }
}
