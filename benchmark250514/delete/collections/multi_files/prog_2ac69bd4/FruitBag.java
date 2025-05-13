import org.apache.commons.collections4.bag.TreeBag;

public class FruitBag {
    private TreeBag<String> bag = new TreeBag<>();

    public void addFruit(String fruit) {
        /* write */ bag.add(fruit);
    }

    public int getFruitCount(String fruit) {
        return bag.getCount(fruit);
    }

    public void displayFruits() {
        for (String fruit : bag) {
            System.out.println("Fruit in bag: " + fruit);
        }
    }
}
