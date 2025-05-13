import org.apache.commons.collections4.bag.TreeBag;
import org.apache.commons.collections4.Bag;

public class Main {
    public static void main(String[] args) {
        TreeBag<String> bag = new TreeBag<>();
        Bag<String> anotherBag = new TreeBag<>();
        
        // Adding elements to anotherBag
        anotherBag.add("banana");
        anotherBag.add("orange");
        anotherBag.add("apple");

        // Processing anotherBag
        for (String fruit : anotherBag.uniqueSet()) {
            System.out.println(fruit + " count: " + anotherBag.getCount(fruit));
        }
        
        // Adding elements to the original bag
        /* write */ bag.add("apple");
        
        // Adding more elements to bag
        bag.add("banana");
        bag.add("orange");
        
        // Performing operations on bag
        if (bag.getCount("banana") > 0) {
            System.out.println("Banana exists in the bag.");
        }
        
        // Some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Reading the count of 'apple'
        /* read */ int count = bag.getCount("apple");
        System.out.println("Apple count: " + count);
        
        // More complex operations on bag
        for (String fruit : bag.uniqueSet()) {
            System.out.println("Fruit: " + fruit + ", Count: " + bag.getCount(fruit));
        }
    }
}