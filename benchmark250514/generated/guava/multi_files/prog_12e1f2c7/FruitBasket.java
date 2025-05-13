import com.google.common.collect.HashMultiset;

public class FruitBasket {
    private HashMultiset<String> fruitMultiset;

    public FruitBasket() {
        fruitMultiset = HashMultiset.create();
    }

    public void addFruit(String fruit) {
        fruitMultiset.add(fruit);
    }

    public int getFruitCount(String fruit) {
        return fruitMultiset.count(fruit);
    }

    public void printAllFruits() {
        for (String fruit : fruitMultiset.elementSet()) {
            System.out.println(fruit + ": " + fruitMultiset.count(fruit));
        }
    }
}
