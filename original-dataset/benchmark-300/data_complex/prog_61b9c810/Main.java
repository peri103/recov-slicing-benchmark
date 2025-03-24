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
        System.out.println("Random numbers in the list:");
        for (Integer num : list) {
            System.out.println(num);
        }

        // Write operation
        /* write */ set.add("testValue");

        // Perform some operations on the list
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        System.out.println("Sum of the numbers in the list: " + sum);

        // Read operation
        /* read */ boolean containsValue = set.contains("testValue");
        System.out.println("Set contains 'testValue': " + containsValue);

        // Add more elements to the set
        for (int i = 0; i < 5; i++) {
            set.add("value" + i);
        }

        // Print all elements in the set
        System.out.println("Elements in the set:");
        for (String element : set) {
            System.out.println(element);
        }
    }
}