import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Multiset;

public class FruitMultiset {
    private Multiset<String> multiset = LinkedHashMultiset.create();

    public void addFruit(String fruit) {
        /* write */ multiset.add(fruit);
    }

    public int getFruitCount(String fruit) {
        return multiset.count(fruit);
    }

    public void addMultipleFruits(String fruit, int count) {
        multiset.add(fruit, count);
    }

    public int getTotalFruits() {
        int total = 0;
        for (String fruit : multiset.elementSet()) {
            total += multiset.count(fruit);
        }
        return total;
    }
}