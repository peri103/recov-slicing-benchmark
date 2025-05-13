import org.apache.commons.collections4.bag.HashBag;

public class FruitBag {
    private HashBag<String> bag = new HashBag<>();

    public void addFruit(String fruit) {
        /* write */ bag.add(fruit);
    }

    public int getFruitCount(String fruit) {
        return bag.getCount(fruit);
    }
}
