import com.google.common.collect.ConcurrentHashMultiset;

public class FruitInventory {
    private ConcurrentHashMultiset<String> multiset = ConcurrentHashMultiset.create();

    public void addFruit(String fruit) {
        /* write */ multiset.add(fruit);
    }

    public int countFruit(String fruit) {
        return multiset.count(fruit);
    }
}
