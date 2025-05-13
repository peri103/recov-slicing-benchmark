import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap;

public class FruitAnalyzer {
    private ImmutableMultiset<String> multiset;

    public FruitAnalyzer(ImmutableMultiset<String> multiset) {
        this.multiset = multiset;
    }

    public void analyzeFruits() {
        // Create and use an ImmutableSet
        ImmutableSet<String> fruitSet = ImmutableSet.of("apple", "banana", "orange");
        System.out.println("ImmutableSet contains 'banana': " + fruitSet.contains("banana"));

        // Create and use an ImmutableMap
        ImmutableMap<String, Integer> fruitMap = ImmutableMap.of("apple", 2, "banana", 3, "orange", 1);
        System.out.println("FruitMap size: " + fruitMap.size());

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);

        // More unrelated operations
        int product = 1;
        for (String fruit : fruitSet) {
            product *= fruit.length();
        }
        System.out.println("Product of string lengths in fruitSet: " + product);

        // Additional unrelated code
        String[] fruits = {"apple", "banana", "orange"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }

    public int getAppleCount() {
        // Use the count method to read the number of occurrences of "apple"
        /* read */ return multiset.count("apple");
    }
}
