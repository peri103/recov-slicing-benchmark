import com.google.common.collect.ForwardingMultiset;
import com.google.common.collect.HashMultiset;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ForwardingMultiset<String> multiset = new ForwardingMultiset<String>() {
            private final HashMultiset<String> delegate = HashMultiset.create();

            @Override
            protected HashMultiset<String> delegate() {
                return delegate;
            }
        };

        Map<String, Integer> fruitCountMap = new HashMap<>();
        fruitCountMap.put("apple", 3);
        fruitCountMap.put("banana", 5);

        for (String fruit : fruitCountMap.keySet()) {
            multiset.add(fruit, fruitCountMap.get(fruit));
        }

        int totalCount = 0;
        for (String fruit : fruitCountMap.keySet()) {
            totalCount += multiset.count(fruit);
        }
        System.out.println("Total fruit count: " + totalCount);

        /* write */ multiset.add("apple");
        System.out.println("Added one more apple.");

        int distinctFruits = multiset.elementSet().size();
        System.out.println("Distinct fruit types: " + distinctFruits);

        for (String fruit : multiset.elementSet()) {
            System.out.println(fruit + ": " + multiset.count(fruit));
        }

        /* read */ int appleCount = multiset.count("apple");
        System.out.println("Apple count: " + appleCount);

        int bananaCount = multiset.count("banana");
        System.out.println("Banana count: " + bananaCount);

        int orangeCount = multiset.count("orange");
        System.out.println("Orange count (should be zero): " + orangeCount);
    }
}