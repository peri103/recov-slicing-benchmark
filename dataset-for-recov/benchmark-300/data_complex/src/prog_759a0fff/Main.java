import java.util.TreeMap;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        HashMap<Integer, String> hashMap = new HashMap<>();
        Random random = new Random();

        // Populate the TreeMap with random values
        for (int i = 0; i < 10; i++) {
            int key = random.nextInt(100);
            String value = "TreeMapValue" + key;
            map.put(key, value);
        }

        // Populate the HashMap with random values
        for (int i = 0; i < 10; i++) {
            int key = random.nextInt(100);
            String value = "HashMapValue" + key;
            hashMap.put(key, value);
        }

        // Perform some operations on the HashMap
        for (int key : hashMap.keySet()) {
            System.out.println("HashMap Key: " + key + ", Value: " + hashMap.get(key));
        }

        // Perform some operations on the TreeMap
        for (int key : map.keySet()) {
            System.out.println("TreeMap Key: " + key + ", Value: " + map.get(key));
        }

        /* write */ map.put(1, "value");

        // Perform some more operations on the TreeMap
        for (int key : map.keySet()) {
            System.out.println("TreeMap Key: " + key + ", Value: " + map.get(key));
        }

        // Perform some more operations on the HashMap
        for (int key : hashMap.keySet()) {
            System.out.println("HashMap Key: " + key + ", Value: " + hashMap.get(key));
        }

        /* read */ String value = map.get(1);
        System.out.println("Read value from TreeMap: " + value);
    }
}