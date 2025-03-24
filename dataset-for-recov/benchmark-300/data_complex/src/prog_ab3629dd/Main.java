import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        // Initialize list with random values
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        // Perform some operations on the list
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of list elements: " + sum);

        // Write to the map
        /* write */ map.put("key", 42);

        // Perform some unrelated operations
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Read from the map
        /* read */ int value = map.get("key");
        System.out.println("Value from map: " + value);

        // More operations on the list
        list.sort(Integer::compareTo);
        System.out.println("Sorted list: " + list);
    }
}