import com.google.common.collect.ForwardingMultiset;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ForwardingMultiset<String> multiset = new HashMultiset<String>() {
            @Override
            protected HashMultiset<String> delegate() {
                return HashMultiset.create();
            }
        };
        
        /* write */ multiset.add("apple");

        // Additional complex logic
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple");

        Multiset<String> fruitMultiset = HashMultiset.create();
        for (String fruit : fruits) {
            fruitMultiset.add(fruit);
        }

        int bananaCount = fruitMultiset.count("banana");
        System.out.println("Banana count: " + bananaCount);

        int orangeCount = fruitMultiset.count("orange");
        System.out.println("Orange count: " + orangeCount);

        // Some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        /* read */ int appleCount = multiset.count("apple");
        System.out.println("Apple count: " + appleCount);
    }
}