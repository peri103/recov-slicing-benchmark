import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class FruitBasket {
    private Multiset<String> fruits = HashMultiset.create();

    public void addFruit(String fruit) {
        /* write */ fruits.add(fruit);
    }

    public Multiset<String> getFruits() {
        return fruits;
    }
}
