public class Main {
    public static void main(String[] args) {
        FruitMultiset fruitMultiset = new FruitMultiset();
        fruitMultiset.addFruit("apple");
        fruitMultiset.addFruit("banana");
        fruitMultiset.addFruit("apple");
        fruitMultiset.addFruit("orange");

        FruitCounter fruitCounter = new FruitCounter(fruitMultiset);
        fruitCounter.countFruits();

        int appleCount = fruitCounter.getFruitCount("apple");
        System.out.println("Count of apples: " + appleCount);

        System.out.println("Final fruit counts: " + fruitCounter.getAllCounts());
    }
}