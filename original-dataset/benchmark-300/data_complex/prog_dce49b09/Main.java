import java.util.TreeMap;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        Random random = new Random();

        // Populate the HashMap with random values
        for (int i = 0; i < 10; i++) {
            hashMap.put("hashKey" + i, random.nextInt(100));
        }

        // Perform some operations on the HashMap
        for (String key : hashMap.keySet()) {
            System.out.println("HashMap Key: " + key + ", Value: " + hashMap.get(key));
        }

        // Write to the TreeMap
        /* write */ map.put("key", 123);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += random.nextInt(10);
        }
        System.out.println("Sum of random numbers: " + sum);

        // Read from the TreeMap
        /* read */ int value = map.get("key");
        System.out.println("Value from TreeMap: " + value);

        // More unrelated code
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}