import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
        ConcurrentHashMap<String, String> hashMap = new ConcurrentHashMap<>();
        Random random = new Random();

        // Populate the ConcurrentHashMap with some random data
        for (int i = 0; i < 10; i++) {
            hashMap.put("hashKey" + i, "value" + random.nextInt(100));
        }

        // Perform some operations on the ConcurrentHashMap
        for (String key : hashMap.keySet()) {
            System.out.println("HashMap Key: " + key + ", Value: " + hashMap.get(key));
        }

        // Write to the ConcurrentSkipListMap
        /* write */ map.put("key", 42);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += random.nextInt(10);
        }
        System.out.println("Sum of random numbers: " + sum);

        // Read from the ConcurrentSkipListMap
        /* read */ int value = map.get("key");
        System.out.println("Value from ConcurrentSkipListMap: " + value);

        // More unrelated code
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}