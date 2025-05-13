import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Predicate<Object> predicate = object -> object instanceof Integer;
        Bag<Integer> hashBag = new HashBag<>();
        PredicatedBag<Integer> predicatedBag = new PredicatedBag<>(hashBag, predicate);

        /* write */ predicatedBag.add(10);

        // Adding more complexity with an ArrayList
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        
        // Iterate over the list
        for (String str : stringList) {
            System.out.println(str);
        }

        // Adding more elements to the PredicatedBag
        predicatedBag.add(20);
        predicatedBag.add(30);

        // Using an iterator to traverse the Bag
        Iterator<Integer> iterator = predicatedBag.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("Bag contains: " + value);
        }

        // Perform some calculations
        int sum = 0;
        for (Integer value : predicatedBag) {
            sum += value;
        }
        System.out.println("Sum of elements in the bag: " + sum);

        /* read */ int count = predicatedBag.getCount(10);
        System.out.println("Count of 10 in the bag: " + count);

        // Further complexity with conditional logic
        if (count > 0) {
            System.out.println("The number 10 is present in the bag.");
        } else {
            System.out.println("The number 10 is not present in the bag.");
        }
    }
}