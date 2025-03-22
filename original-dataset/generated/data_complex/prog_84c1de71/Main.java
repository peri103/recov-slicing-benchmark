import java.util.HashSet;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        HashSet<Integer> set = new HashSet<>();
        /* write */ set.add(10);

        // Adding more complexity
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        for (String item : list) {
            System.out.println("Fruit: " + item);
        }

        // Using another HashSet
        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("hello");
        stringSet.add("world");

        if (stringSet.contains("hello")) {
            System.out.println("StringSet contains 'hello'");
        }

        // Adding more elements to the original set
        for (int i = 1; i <= 5; i++) {
            set.add(i * 20);
        }

        // Iterating over the set
        for (Integer num : set) {
            System.out.println("Number in set: " + num);
        }

        // Check if the original value is still present
        /* read */ boolean containsValue = set.contains(10);
        System.out.println("Original set contains 10: " + containsValue);

        // Adding a new unrelated ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        // Printing all numbers
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}