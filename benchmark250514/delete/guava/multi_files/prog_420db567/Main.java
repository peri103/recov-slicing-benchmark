public class Main {
    public static void main(String[] args) {
        FruitMultiset fruitMultiset = new FruitMultiset();
        fruitMultiset.addFruit("apple");
        
        FruitSet fruitSet = new FruitSet();
        fruitSet.addFruit("banana");
        fruitSet.addFruit("orange");
        
        // Build the ImmutableSet and perform operations
        ImmutableSet<String> fruitImmutableSet = fruitSet.buildSet();
        boolean containsBanana = fruitImmutableSet.contains("banana");
        System.out.println("Contains banana: " + containsBanana);
        
        // Build the ImmutableMultiset and perform operations
        ImmutableMultiset<String> fruitImmutableMultiset = fruitMultiset.buildMultiset();
        int totalElements = fruitImmutableMultiset.size();
        System.out.println("Total elements in multiset: " + totalElements);
        
        /* read */ int appleCount = fruitImmutableMultiset.count("apple");
        System.out.println("Count of 'apple': " + appleCount);
        
        for (String element : fruitImmutableMultiset.elementSet()) {
            System.out.println("Element: " + element + ", Count: " + fruitImmutableMultiset.count(element));
        }
        
        for (String fruit : fruitImmutableSet) {
            System.out.println("Fruit in set: " + fruit);
        }
    }
}