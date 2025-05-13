import com.google.common.collect.ForwardingSortedMap;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        ForwardingSortedMap<String, Integer> forwardingSortedMap = new ForwardingSortedMap<String, Integer>() {
            @Override
            protected SortedMap<String, Integer> delegate() {
                return sortedMap;
            }
        };

        // Unrelated code to make the program more complex
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        list.add("apple");
        list.add("banana");
        hashMap.put("fruit", 2);

        // Another write-read pair
        forwardingSortedMap.put("key2", 200);
        int anotherValue = forwardingSortedMap.get("key2");
        System.out.println("Another value: " + anotherValue);

        // Some operations with list and hashMap
        for (String item : list) {
            hashMap.put(item, item.length());
        }

        /* write */ forwardingSortedMap.put("key1", 100);

        // Complex operations
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Length: " + hashMap.get(key));
        }

        // Unrelated loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List item: " + list.get(i));
        }

        /* read */ int value = forwardingSortedMap.get("key1");
        System.out.println("Read value: " + value);

        // More unrelated operations
        int sum = 0;
        for (int val : hashMap.values()) {
            sum += val;
        }
        System.out.println("Sum of lengths: " + sum);
    }
}