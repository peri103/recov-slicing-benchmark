import java.util.HashSet;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        // Add some random numbers to the list
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        // Print the list
        System.out.println("List of random numbers:");
        for (Integer num : list) {
            System.out.println(num);
        }

        /* write */ set.add("Hello");

        // Perform some unrelated operations
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        System.out.println("Sum of list elements: " + sum);

        // Check if the set contains the written value
        /* read */ boolean contains = set.contains("Hello");
        System.out.println("Set contains 'Hello': " + contains);

        // Add more elements to the set
        set.add("World");
        set.add("Java");

        // Print all elements in the set
        System.out.println("Elements in the set:");
        for (String element : set) {
            System.out.println(element);
        }
    }
}