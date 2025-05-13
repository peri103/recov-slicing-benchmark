import com.google.common.collect.ForwardingMultiset;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Multiset<String> multiset = HashMultiset.create();
        ForwardingMultiset<String> forwardingMultiset = new ForwardingMultiset<String>() {
            @Override
            protected Multiset<String> delegate() {
                return multiset;
            }
        };

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        HashMap<String, Integer> fruitCount = new HashMap<>();
        for (String fruit : fruits) {
            fruitCount.put(fruit, fruitCount.getOrDefault(fruit, 0) + 1);
        }

        System.out.println("Initial fruit count:");
        for (String fruit : fruitCount.keySet()) {
            System.out.println(fruit + ": " + fruitCount.get(fruit));
        }

        /* write */ forwardingMultiset.add("apple");

        fruits.add("grape");
        for (String fruit : fruits) {
            forwardingMultiset.add(fruit);
        }

        System.out.println("Updated fruit count:");
        for (String fruit : fruits) {
            System.out.println(fruit + ": " + forwardingMultiset.count(fruit));
        }

        /* read */ int appleCount = forwardingMultiset.count("apple");
        System.out.println("Final apple count: " + appleCount);

        int totalCount = 0;
        for (String fruit : fruits) {
            totalCount += forwardingMultiset.count(fruit);
        }
        System.out.println("Total fruit count: " + totalCount);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        System.out.println("Numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}