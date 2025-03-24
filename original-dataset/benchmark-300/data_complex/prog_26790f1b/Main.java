import java.util.TreeMap;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        Random random = new Random();

        // Initialize hashMap with random values
        for (int i = 0; i < 10; i++) {
            hashMap.put("hashKey" + i, random.nextInt(100));
        }

        // Perform some operations on hashMap
        for (String key : hashMap.keySet()) {
            System.out.println("hashMap Key: " + key + ", Value: " + hashMap.get(key));
        }

        /* write */ map.put("key", 123);

        // Add some more entries to map
        for (int i = 0; i < 5; i++) {
            map.put("additionalKey" + i, random.nextInt(100));
        }

        // Perform some operations on map
        for (String key : map.keySet()) {
            System.out.println("map Key: " + key + ", Value: " + map.get(key));
        }

        /* read */ Integer value = map.get("key");
        System.out.println("Read value from map: " + value);

        // Additional unrelated code to make the program more complex
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println("Sum of first 100 integers: " + sum);
    }
}