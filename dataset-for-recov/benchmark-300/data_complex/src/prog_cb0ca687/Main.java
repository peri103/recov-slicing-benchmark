import java.util.TreeMap;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        Random random = new Random();

        // Insert some random values into the HashMap
        for (int i = 0; i < 10; i++) {
            hashMap.put("hashKey" + i, random.nextInt(100));
        }

        // Perform some operations with the HashMap
        for (String key : hashMap.keySet()) {
            System.out.println("HashMap Key: " + key + ", Value: " + hashMap.get(key));
        }

        /* write */ map.put("key", 42);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println("Sum of first 100 numbers: " + sum);

        // Insert more values into the TreeMap
        for (int i = 0; i < 5; i++) {
            map.put("treeKey" + i, random.nextInt(50));
        }

        /* read */ int value = map.get("key");
        System.out.println("Value read from TreeMap: " + value);

        // Perform some final operations
        for (String key : map.keySet()) {
            System.out.println("TreeMap Key: " + key + ", Value: " + map.get(key));
        }
    }
}