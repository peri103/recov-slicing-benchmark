import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        List<String> list = new ArrayList<>();

        // Adding some initial data to the map and list
        map.put("key1", 100);
        map.put("key2", 200);
        list.add("item1");
        list.add("item2");

        // Performing some operations on the map and list
        map.compute("key1", (k, v) -> v + 50);
        list.add("item3");

        /* write */ set.add(42);

        // More operations on the map and list
        map.put("key3", 300);
        list.remove("item1");

        // Iterating over the map and list
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        for (String item : list) {
            System.out.println("List Item: " + item);
        }

        /* read */ boolean containsValue = set.contains(42);
        System.out.println("Contains 42: " + containsValue);

        // Additional complex operations
        map.forEach((k, v) -> {
            if (v > 150) {
                System.out.println("High value key: " + k);
            }
        });

        list.forEach(item -> {
            if (item.startsWith("item")) {
                System.out.println("Filtered item: " + item);
            }
        });
    }
}