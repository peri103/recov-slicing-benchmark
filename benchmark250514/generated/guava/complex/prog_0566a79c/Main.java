import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedSet
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();

        // Use the builder to add elements to the set
        /* write */ builder.add(1).add(2).add(3);

        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> sortedSet = builder.build();

        // Create a HashMap to store some key-value pairs
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Retrieve a value from the HashMap
        Integer mapValue = map.get("two");
        System.out.println("Value from map: " + mapValue);

        // Create an ImmutableList and perform operations on it
        ImmutableList<String> stringList = ImmutableList.of("apple", "banana", "cherry");
        System.out.println("First element of stringList: " + stringList.get(0));

        // Use the contains method to check if an element is in the set
        /* read */ boolean contains = sortedSet.contains(2);

        // Print the result
        System.out.println("Set contains 2: " + contains);

        // More complex operations
        for (String fruit : stringList) {
            System.out.println("Fruit: " + fruit);
        }

        // Perform some calculations
        int sum = 0;
        for (Integer num : sortedSet) {
            sum += num;
        }
        System.out.println("Sum of elements in sortedSet: " + sum);
    }
}