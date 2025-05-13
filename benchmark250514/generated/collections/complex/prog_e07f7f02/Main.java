import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.Predicate;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Define a predicate that allows all elements
        Predicate<Object> predicate = obj -> true;

        // Create a PredicatedBag with the predicate
        PredicatedBag<String> bag = PredicatedBag.predicatedBag(new HashBag<>(), predicate);

        // Create another PredicatedBag with the same predicate
        PredicatedBag<Integer> numberBag = PredicatedBag.predicatedBag(new HashBag<>(), predicate);

        // Add elements to the secondary bag
        numberBag.add(10);
        numberBag.add(20);
        numberBag.add(30);

        /* write */ bag.add("example");

        // Perform operations on the secondary bag
        int sum = 0;
        for (Integer number : numberBag.uniqueSet()) {
            sum += numberBag.getCount(number) * number;
        }
        System.out.println("Sum of numbers in numberBag: " + sum);

        // Create and manipulate an ArrayList to add complexity
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("world");
        stringList.add("example");

        // Check if elements in the ArrayList exist in the bag
        for (String str : stringList) {
            if (bag.uniqueSet().contains(str)) {
                System.out.println("Bag contains: " + str);
            }
        }

        /* read */ int count = bag.getCount("example");
        System.out.println(count);

        // Additional operations on the secondary bag
        numberBag.add(40);
        numberBag.add(50);
        System.out.println("Unique elements in numberBag:");
        for (Integer number : numberBag.uniqueSet()) {
            System.out.println(number + " -> Count: " + numberBag.getCount(number));
        }
    }
}