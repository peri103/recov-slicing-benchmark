import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.HashMultiset;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashMultiset<Integer> multiset = LinkedHashMultiset.create();
        HashMultiset<String> stringMultiset = HashMultiset.create();
        Map<String, Integer> stringCountMap = new HashMap<>();

        /* write */ multiset.add(42);

        // Adding elements to stringMultiset
        stringMultiset.add("apple");
        stringMultiset.add("banana");
        stringMultiset.add("apple");
        stringMultiset.add("banana");
        stringMultiset.add("orange");

        // Counting occurrences of each string in stringMultiset and storing in stringCountMap
        for (String fruit : stringMultiset.elementSet()) {
            int count = stringMultiset.count(fruit);
            stringCountMap.put(fruit, count);
        }

        // Printing the count of each fruit in stringCountMap
        for (Map.Entry<String, Integer> entry : stringCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Performing some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        /* read */ int count = multiset.count(42);
        System.out.println("Count of 42 in multiset: " + count);

        // Adding more elements to multiset and performing operations
        multiset.add(56);
        multiset.add(56);
        multiset.add(78);

        int totalElements = multiset.size();
        System.out.println("Total elements in multiset: " + totalElements);

        // Printing all unique elements in multiset
        System.out.println("Unique elements in multiset:");
        for (Integer element : multiset.elementSet()) {
            System.out.println(element);
        }
    }
}