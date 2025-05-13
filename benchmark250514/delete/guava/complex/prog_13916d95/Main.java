import com.google.common.collect.EnumMultiset;
import com.google.common.collect.HashMultiset;
import java.util.EnumSet;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Define an enum for demonstration
        enum Color { RED, GREEN, BLUE }

        // Create an EnumMultiset for the enum Color
        EnumMultiset<Color> multiset = EnumMultiset.create(EnumSet.allOf(Color.class));

        // Create another multiset for additional demonstration
        HashMultiset<String> stringMultiset = HashMultiset.create();
        stringMultiset.add("apple");
        stringMultiset.add("apple");
        stringMultiset.add("banana");

        // Use a HashMap for unrelated complexity
        HashMap<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("apple", 2);
        fruitMap.put("banana", 1);

        /* write */ multiset.add(Color.RED);

        // Perform operations with the stringMultiset
        int appleCount = stringMultiset.count("apple");
        int bananaCount = stringMultiset.count("banana");
        System.out.println("Count of apple: " + appleCount);
        System.out.println("Count of banana: " + bananaCount);

        // Iterate over the fruitMap and print values
        for (String fruit : fruitMap.keySet()) {
            System.out.println("Fruit: " + fruit + ", Count: " + fruitMap.get(fruit));
        }

        /* read */ int count = multiset.count(Color.RED);

        System.out.println("Count of RED: " + count);
    }
}