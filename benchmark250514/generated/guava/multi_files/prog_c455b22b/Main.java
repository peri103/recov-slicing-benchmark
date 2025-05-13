public class Main {
    public static void main(String[] args) {
        FruitMultiset fruitMultiset = new FruitMultiset();
        fruitMultiset.addFruit("apple");

        FruitBasket fruitBasket = new FruitBasket();
        fruitBasket.addFruit("apple", 1);
        fruitBasket.addFruit("banana", 1);
        fruitBasket.displayBasket();

        fruitMultiset.addFruit("banana");
        fruitMultiset.addFruit("orange");
        fruitMultiset.addFruit("orange");

        /* read */ int appleCount = fruitMultiset.countFruit("apple");
        System.out.println("Count of apple in multiset: " + appleCount);
    }
}