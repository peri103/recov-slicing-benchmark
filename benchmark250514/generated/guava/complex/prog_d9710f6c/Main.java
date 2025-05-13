import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedMultiset.Builder;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Builder<String> builder = ImmutableSortedMultiset.naturalOrder();
        HashMap<String, Integer> fruitCountMap = new HashMap<>();
        
        /* write */ builder.add("apple");
        
        ImmutableSortedMultiset<String> multiset = builder.build();
        
        ImmutableList<String> fruitList = ImmutableList.of("banana", "orange", "apple", "grape");
        for (String fruit : fruitList) {
            fruitCountMap.put(fruit, multiset.count(fruit));
        }
        
        int totalFruits = 0;
        for (String fruit : fruitCountMap.keySet()) {
            totalFruits += fruitCountMap.get(fruit);
        }
        
        System.out.println("Total fruit count: " + totalFruits);
        
        // Additional logic to demonstrate complexity
        if (fruitCountMap.containsKey("apple")) {
            System.out.println("Apples are available.");
        } else {
            System.out.println("Apples are not available.");
        }
        
        /* read */ int count = multiset.count("apple");
        System.out.println("Count of apples: " + count);
        
        for (String fruit : fruitList) {
            if (fruitCountMap.get(fruit) > 0) {
                System.out.println(fruit + " is available.");
            } else {
                System.out.println(fruit + " is not available.");
            }
        }
    }
}