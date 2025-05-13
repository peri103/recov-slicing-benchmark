import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedMultiset.Builder;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initializing a builder for ImmutableSortedMultiset
        Builder<Integer> builder = ImmutableSortedMultiset.naturalOrder();

        // Adding elements to the builder
        builder.add(1);
        builder.add(2);

        // Creating another collection
        ImmutableSet<String> immutableSet = ImmutableSet.of("apple", "banana", "cherry");

        // Using a HashMap for additional complexity
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        // Adding more elements to the builder
        builder.add(3);
        builder.add(4);

        // Building the multiset
        ImmutableSortedMultiset<Integer> multiset = builder.build();

        // Using an ArrayList for further complexity
        ArrayList<String> list = new ArrayList<>();
        list.add("grape");
        list.add("orange");

        // Iterating over the immutable set
        for (String fruit : immutableSet) {
            System.out.println("Fruit: " + fruit + ", Count: " + map.get(fruit));
        }

        // Adding elements to the list
        list.add("pineapple");
        list.add("mango");

        // Accessing the multiset to get the count of a specific element
        /* read */ int count = multiset.count(1);
        System.out.println("Count of 1 in multiset: " + count);

        // Iterating over the list
        for (String item : list) {
            System.out.println("List item: " + item);
        }

        // Adding more complexity with additional operations
        map.put("mango", 4);
        System.out.println("Count of mango in map: " + map.get("mango"));
    }
}