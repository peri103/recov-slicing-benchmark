import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        // Add some random values to the list
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
        /* write */ map.put("key", 123);

        // Perform some more operations
        int product = 1;
        for (int num : list) {
            product *= num;
        }
        System.out.println("Product of list elements: " + product);

        // Read from the map
        /* read */ Integer value = map.get("key");
        System.out.println("Value from map: " + value);

        // Add more complexity
        HashMap<String, String> stringMap = new HashMap<>();
        stringMap.put("greeting", "Hello");
        stringMap.put("farewell", "Goodbye");

        System.out.println(stringMap.get("greeting") + " World!");
        System.out.println(stringMap.get("farewell") + " World!");
    }
}